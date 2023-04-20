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
import com.google.android.material.button.*;
import android.widget.TextView;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class RequestActivity extends  AppCompatActivity  { 
	
	
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout linear2;
	private LinearLayout textinputlayout1;
	private LinearLayout textinputlayout2;
	private MaterialButton materialbutton1;
	private TextView textview1;
	private EditText edittext1;
	private EditText edittext2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.request);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textinputlayout1 = (LinearLayout) findViewById(R.id.textinputlayout1);
		textinputlayout2 = (LinearLayout) findViewById(R.id.textinputlayout2);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		textview1 = (TextView) findViewById(R.id.textview1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
	}
	
	private void initializeLogic() {
		_changeActivityFont("product");
		textinputlayout1.removeView(edittext1);
		final com.google.android.material.textfield.TextInputLayout textinput = new com.google.android.material.textfield.TextInputLayout (this);
		 textinput.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)); 
		//textinput.setBoxBackgroundColor(0xFFFFFFFF);
		textinput.setBoxStrokeColor(0xFF0D47A1);
		textinput.setBoxCornerRadii(5, 5, 5, 5);
		textinput.setPadding((int)8, (int)0 , (int)0 , (int)0 );
		textinput.setHintEnabled(true);
		textinput.setHint("Your Name");
		textinput.setHintAnimationEnabled(true);
		textinput.setBoxBackgroundMode(textinput.BOX_BACKGROUND_OUTLINE);
		textinput.addView(edittext1);
		textinputlayout1.addView(textinput);
		textinputlayout2.removeView(edittext2);
		final com.google.android.material.textfield.TextInputLayout textinput2 = new com.google.android.material.textfield.TextInputLayout (this);
		 textinput2.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)); 
		//textinput2.setBoxBackgroundColor(0xFFFFFFFF);
		textinput2.setBoxStrokeColor(0xFF0D47A1);
		textinput2.setBoxCornerRadii(5, 5, 5, 5);
		textinput2.setPadding((int)8, (int)0 , (int)0 , (int)0 );
		textinput2.setHintEnabled(true);
		textinput2.setHint("Enter Message");
		textinput2.setHintAnimationEnabled(true);
		textinput2.setBoxBackgroundMode(textinput.BOX_BACKGROUND_OUTLINE);
		textinput2.addView(edittext2);
		textinputlayout2.addView(textinput2);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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