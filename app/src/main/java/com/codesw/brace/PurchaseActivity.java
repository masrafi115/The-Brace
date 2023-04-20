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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PurchaseActivity extends  AppCompatActivity  { 
	
	
	private String fontName = "";
	private String typeace = "";
	private HashMap<String, Object> map = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear10;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private ImageView imageview2;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ListView listview1;
	private LinearLayout linear7;
	private LinearLayout linear6;
	private ImageView imageview1;
	private TextView textview1;
	
	private Intent intent = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.purchase);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_Dialog("Congratulation", "You've Purchased This Course. Now you can learn full course easily. Get started from now to learn. ");
			}
		});
	}
	
	private void initializeLogic() {
		imageview1.setColorFilter(0xFF3F51B5, PorterDuff.Mode.MULTIPLY);
		textview2.setText(getIntent().getStringExtra("course"));
		_RoundAndBorder(linear6, "#FFFFFF", 4, "#3F51B5", 15);
		_RoundAndBorder(linear7, "#FFFFFF", 4, "#3F51B5", 15);
		_RoundAndBorder(linear8, "#FFFFFF", 4, "#3F51B5", 15);
		_roundedCorners(linear4, 30, 30, 0, 0, "#FFFFFF", 0, "#000000", 0, "");
		for(int _repeat18 = 0; _repeat18 < (int)(6); _repeat18++) {
			map = new HashMap<>();
			map.put("key", String.valueOf((long)(SketchwareUtil.getRandom((int)(1), (int)(100)))));
			listmap.add(map);
		}
		listview1.setAdapter(new Listview1Adapter(listmap));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
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
	
	
	public void _roundedCorners (final View _view, final double _one, final double _two, final double _three, final double _four, final String _color, final double _stroke, final String _stColor, final double _num, final String _NOTES) {
		Double left_top = _one;
		Double right_top = _two;
		Double right_bottom = _three;
		Double left_bottom = _four;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {left_top.floatValue(),left_top.floatValue(), right_top.floatValue(),right_top.floatValue(), left_bottom.floatValue(),left_bottom.floatValue(), right_bottom.floatValue(),right_bottom.floatValue()});
		s.setColor(Color.parseColor(_color));
		s.setStroke((int)_stroke, Color.parseColor(_stColor));
		_view.setBackground(s);
		_view.setElevation((int)_num);
	}
	
	
	public void _shapeRadius (final View _v, final String _color, final double _radius) {
		android.graphics.drawable.GradientDrawable shape = new android.graphics.drawable.GradientDrawable();
		  shape.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		
		shape.setCornerRadius((int)_radius);
		
		shape.setColor(Color.parseColor(_color));
		_v.setBackgroundDrawable(shape);
	}
	
	
	public void _Dialog (final String _title, final String _message) {
		final AlertDialog d = new AlertDialog.Builder(PurchaseActivity.this).create();
		LayoutInflater inflater = getLayoutInflater();
		View convertVie = (View) inflater.inflate(R.layout.layout_materialdial, null);
		
		TextView text1 = (TextView) convertVie.findViewById(R.id.textview1);
		text1.setText(_title);
		
		TextView text2 = (TextView) convertVie.findViewById(R.id.textview2);
		text2.setText(_message);
		
		
		LinearLayout dismiss = (LinearLayout) convertVie.findViewById(R.id.linear3);
		
		android.graphics.drawable.GradientDrawable ind = new android.graphics.drawable.GradientDrawable();  ind.setColor(Color.parseColor("#2196F3"));
		ind.setCornerRadius(30);
		dismiss.setBackground(ind);
		dismiss.setElevation((int)5);
		
		dismiss.setOnClickListener(new View.OnClickListener(){
			    public void onClick(View v){
				intent.setClass(getApplicationContext(), CourceContainActivity.class);
				intent.putExtra("course", textview2.getText().toString());
				startActivity(intent);
				d.dismiss();
			}
		});
		
		
		LinearLayout inear = (LinearLayout) convertVie.findViewById(R.id.box);
		
		android.graphics.drawable.GradientDrawable ine = new android.graphics.drawable.GradientDrawable();  ine.setColor(Color.parseColor("#ffffff"));
		ine.setCornerRadius(15);
		inear.setBackground(ine);
		
		
		d.setView(convertVie);
		d.setCancelable(false);
		d.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		d.show();
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.course_list, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final ImageView imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			final TextView textview2 = (TextView) _view.findViewById(R.id.textview2);
			
			_shapeRadius(linear1, "#FFF5F5F5", 15);
			_shapeRadius(linear3, "#536DFE", 15);
			textview1.setText("Course Title ".concat(String.valueOf((long)(_position)).concat(" Goes Here")));
			textview2.setText("Course Description ".concat(String.valueOf((long)(_position)).concat(" Goes Here")));
			
			return _view;
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