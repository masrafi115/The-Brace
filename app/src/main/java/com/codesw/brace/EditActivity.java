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
import com.google.android.material.textfield.*;
import android.widget.TextView;
import android.widget.ImageView;
import com.google.android.material.button.*;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class EditActivity extends  AppCompatActivity  { 
	
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear11;
	private TextInputLayout textinputlayout1;
	private TextInputLayout textinputlayout2;
	private TextView textview2;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear10;
	private ImageView imageview1;
	private TextView textview1;
	private LinearLayout linear12;
	private ImageView imageview2;
	private TextInputLayout textinputlayout3;
	private TextInputLayout textinputlayout4;
	private TextInputLayout textinputlayout5;
	private MaterialButton materialbutton1;
	private MaterialButton materialbutton2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.edit);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		textinputlayout1 = (TextInputLayout) findViewById(R.id.textinputlayout1);
		textinputlayout2 = (TextInputLayout) findViewById(R.id.textinputlayout2);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textinputlayout3 = (TextInputLayout) findViewById(R.id.textinputlayout3);
		textinputlayout4 = (TextInputLayout) findViewById(R.id.textinputlayout4);
		textinputlayout5 = (TextInputLayout) findViewById(R.id.textinputlayout5);
		materialbutton1 = (MaterialButton) findViewById(R.id.materialbutton1);
		materialbutton2 = (MaterialButton) findViewById(R.id.materialbutton2);
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		textinputlayout1.setBoxCornerRadii(5, 5, 5, 5);
		textinputlayout2.setBoxCornerRadii(5, 5, 5, 5);
		textinputlayout3.setBoxCornerRadii(5, 5, 5, 5);
		textinputlayout4.setBoxCornerRadii(5, 5, 5, 5);
		textinputlayout5.setBoxCornerRadii(5, 5, 5, 5);
		_Elevation(linear2, 5);
		_RoundAndBorder(linear12, "#FFFFFF", 5, "#E0E0E0", 90);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
	}
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
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