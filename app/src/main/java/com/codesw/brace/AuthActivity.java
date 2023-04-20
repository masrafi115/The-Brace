package com.codesw.brace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.textfield.*;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class AuthActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private String fontName = "";
	private String typeace = "";
	private boolean onStart = false;
	private boolean Current = false;
	
	private LinearLayout linear2;
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private TextInputLayout textinputlayout2;
	private TextInputLayout textinput2;
	private TextView textview5;
	private CheckBox checkbox1;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview2;
	
	private RequestNetwork req;
	private RequestNetwork.RequestListener _req_request_listener;
	private SharedPreferences data;
	private Intent i = new Intent();
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.auth);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textinputlayout2 = (TextInputLayout) findViewById(R.id.textinputlayout2);
		textinput2 = (TextInputLayout) findViewById(R.id.textinput2);
		textview5 = (TextView) findViewById(R.id.textview5);
		checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		req = new RequestNetwork(this);
		data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					
				}
				else {
					if (edittext2.getText().toString().equals("")) {
						
					}
					else {
						if (Current) {
							if ("".equals("")) {
								
							}
							else {
								_autoTransitionScroll(vscroll1);
								
								textview6.setVisibility(View.GONE);
								textview7.setEnabled(false);
								checkbox1.setEnabled(false);
								edittext1.setEnabled(false);
								edittext2.setEnabled(false);
								
								timer = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												req.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "", _req_request_listener);
											}
										});
									}
								};
								_timer.schedule(timer, (int)(1000));
							}
						}
						else {
							_autoTransitionScroll(vscroll1);
							
							textview6.setVisibility(View.GONE);
							textview7.setEnabled(false);
							checkbox1.setEnabled(false);
							edittext1.setEnabled(false);
							edittext2.setEnabled(false);
							
							timer = new TimerTask() {
								@Override
								public void run() {
									runOnUiThread(new Runnable() {
										@Override
										public void run() {
											req.startRequestNetwork(RequestNetworkController.GET, "https://www.google.com", "", _req_request_listener);
										}
									});
								}
							};
							_timer.schedule(timer, (int)(1000));
						}
					}
				}
				data.edit().putString("isAuth", "1").commit();
				i.setClass(getApplicationContext(), WelcomeActivity.class);
				startActivity(i);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (Current) {
					Current = false;
					_autoTransitionScroll(vscroll1);
					textview1.setText("Welcome back !");
					textview2.setText("Connect to your account");
					textview6.setText("Sign in");
					textview7.setText("Sign up");
					
					
					
					checkbox1.setVisibility(View.GONE);
					textview5.setVisibility(View.VISIBLE);
				}
				else {
					Current = true;
					_autoTransitionScroll(vscroll1);
					textview5.setVisibility(View.GONE);
					textview1.setText("Hello new user !");
					textview2.setText("Let's join to learn online");
					textview6.setText("Create account");
					textview7.setText("Sign in");
					
					
					
					checkbox1.setVisibility(View.VISIBLE);
				}
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_req_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				SketchwareUtil.showMessage(getApplicationContext(), "Logged in");
				_autoTransitionScroll(vscroll1);
				
				textview6.setVisibility(View.VISIBLE);
				textview7.setEnabled(true);
				checkbox1.setEnabled(true);
				edittext1.setEnabled(true);
				edittext2.setEnabled(true);
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				_autoTransitionScroll(vscroll1);
				
				textview6.setVisibility(View.VISIBLE);
				textview7.setEnabled(true);
				checkbox1.setEnabled(true);
				edittext1.setEnabled(true);
				edittext2.setEnabled(true);
				
			}
		};
	}
	
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (onStart) {
			
		}
		else {
			onStart = true;
			_Design_UI_Logic();
			_Typeface_Logic();
		}
	}
	public void _autoTransitionScroll (final View _scroll) {
		android.transition.TransitionManager.beginDelayedTransition((ScrollView)_scroll, new android.transition.AutoTransition());
	}
	
	
	public void _NavStatusBarColor (final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _DARK_ICONS () {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _rippleRoundStroke (final View _view, final String _focus, final String _pressed, final double _round, final double _stroke, final String _strokeclr) {
		android.graphics.drawable.GradientDrawable GG = new android.graphics.drawable.GradientDrawable();
		GG.setColor(Color.parseColor(_focus));
		GG.setCornerRadius((float)_round);
		GG.setStroke((int) _stroke,
		Color.parseColor("#" + _strokeclr.replace("#", "")));
		android.graphics.drawable.RippleDrawable RE = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor(_pressed)}), GG, null);
		_view.setBackground(RE);
	}
	
	
	public void _changeActivityFont (final String _fontname) {
		fontName = "fonts/".concat(_fontname.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
	} 
	private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface 
			typeace = Typeface.createFromAsset(getAssets(), fontName);;
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0;
				i < vg.getChildCount();
				i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}
			else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}
				else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}
					else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
						}
					}
				}
			}
		}
		catch(Exception e)
		
		{
			SketchwareUtil.showMessage(getApplicationContext(), "Error Loading Font");
		};
	}
	
	
	public void _transitionComplete (final View _view, final String _transitionName) {
		_view.setTransitionName(_transitionName);
	}
	
	
	public void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RippleEffects (final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _removeScollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _Design_UI_Logic () {
		_rippleRoundStroke(textview6, "#00B0FF", "#33FFFFFF", 10, 2, "#00B0FF");
		_rippleRoundStroke(textview7, "#0000B0FF", "#16000000", 10, 2, "#E0E0E0");
		_rippleRoundStroke(textview8, "#0000B0FF", "#16000000", 10, 2, "#E0E0E0");
		_removeScollBar(vscroll1);
		_NavStatusBarColor("#FFFFFF", "#FFFFFF");
		_DARK_ICONS();
	}
	
	
	public void _Typeface_Logic () {
		_changeActivityFont("en_light");
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_med.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_med.ttf"), 0);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_med.ttf"), 0);
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}