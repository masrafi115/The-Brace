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
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DebugActivity extends  AppCompatActivity  { 
	
	
	private String message = "";
	
	private LinearLayout linear1;
	private LinearLayout linear6;
	private TextView text_title;
	private ImageView imageview1;
	private TextView text_msg;
	private LinearLayout linear2;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private ScrollView vscroll1;
	private TextView textview3;
	private ImageView imageview2;
	private TextView text_error;
	private LinearLayout linear3;
	private TextView textview5;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.debug);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		text_title = (TextView) findViewById(R.id.text_title);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		text_msg = (TextView) findViewById(R.id.text_msg);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		text_error = (TextView) findViewById(R.id.text_error);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview5 = (TextView) findViewById(R.id.textview5);
	}
	
	private void initializeLogic() {
		setTheme(android.R.style.ThemeOverlay_Material_Dark);
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) { getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR); }
		_SetStatusBarColor("#FFFFFF");
		text_error.setText(getIntent().getStringExtra("error"));
		text_msg.setText(message);
		vscroll1.setVisibility(View.GONE);
		text_title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansbold.ttf"), 1);
		text_msg.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensanslight.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansbold.ttf"), 0);
		text_error.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansregular.ttf"), 0);
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansbold.ttf"), 0);
		_MusicGarageUI(linear3, 10, 0, "#FFFFFF", "#212121", 2, true);
		_setBackground(imageview2, 10, 0, "#00000000", true);
		_setBackground(linear2, 20, 10, "#EEEEEE", false);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _setBackground (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
	}
	
	
	public void _SetStatusBarColor (final String _color) {
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor(_color));
	}
	
	
	public void _MusicGarageUI (final View _view, final double _radius, final double _shadow, final String _color1, final String _color2, final double _border, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color1));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int) _border, Color.parseColor(_color2));
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#9e9e9e")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color1));
			gd.setCornerRadius((int)_radius);
			gd.setStroke((int) _border, Color.parseColor(_color2));
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
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