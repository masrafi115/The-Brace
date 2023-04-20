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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class UpdateActivity extends  AppCompatActivity  { 
	
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private ImageView imageview1;
	private TextView textview8;
	private LinearLayout linear3;
	private ProgressBar progressbar1;
	private LinearLayout linear2;
	private TextView textview4;
	private LinearLayout linear4;
	private TextView textview7;
	private TextView textview5;
	private TextView textview6;
	private TextView textview3;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.update);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview4 = (TextView) findViewById(R.id.textview4);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview3 = (TextView) findViewById(R.id.textview3);
	}
	
	private void initializeLogic() {
		android.graphics.drawable.GradientDrawable CRNUS = new android.graphics.drawable.GradientDrawable();
		CRNUS.setColor(Color.parseColor("#EF5350"));
		CRNUS.setCornerRadii(new float[]{ (float) 360,(float) 360,(float) 360,(float) 360,(float) 360,(float) 360,(float) 360,(float) 360 });
		CRNUS.setStroke((int) 0, Color.parseColor("#000000"));
		linear2.setElevation((float) 6);
		linear2.setBackground(CRNUS);
		//Milz
		progressbar1.setVisibility(View.GONE);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
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