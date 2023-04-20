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
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class QuizActivity extends  AppCompatActivity  { 
	
	
	private HashMap<String, Object> map = new HashMap<>();
	private double n = 0;
	
	private ArrayList<HashMap<String, Object>> quiz_list = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private TextView textview1;
	private ListView listview1;
	private LinearLayout linear4;
	private TextView textview2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.quiz);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		textview1 = (TextView) findViewById(R.id.textview1);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview2 = (TextView) findViewById(R.id.textview2);
		
		linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Just Test, Need to add function");
			}
		});
	}
	
	private void initializeLogic() {
		_roundedCorners(linear3, 30, 30, 0, 0, "#FFFFFF", 0, "#000000", 0, "");
		for(int _repeat13 = 0; _repeat13 < (int)(4); _repeat13++) {
			n++;
			map = new HashMap<>();
			map.put("key", String.valueOf((long)(n)));
			quiz_list.add(map);
		}
		listview1.setAdapter(new Listview1Adapter(quiz_list));
		((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
		_RoundAndBorder(linear4, "#FFFFFF", 4, "#FF29C3FF", 15);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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
	
	
	public void _RoundAndBorder (final View _view, final String _color1, final double _border, final String _color2, final double _round) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color1));
		gd.setCornerRadius((int) _round);
		gd.setStroke((int) _border, Color.parseColor(_color2));
		_view.setBackground(gd);
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
				_view = _inflater.inflate(R.layout.quiz_list, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final TextView textview3 = (TextView) _view.findViewById(R.id.textview3);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			
			_shapeRadius(linear1, "#FFF5F5F5", 15);
			_RoundAndBorder(linear3, "#FFF5F5F5", 3, "#FF29C3FF", 15);
			textview3.setText(_data.get((int)_position).get("key").toString());
			if (_position == 0) {
				textview1.setText("UI Only");
			}
			if (_position == 1) {
				textview1.setText("Function");
			}
			if (_position == 2) {
				textview1.setText("User Database");
			}
			if (_position == 3) {
				textview1.setText("No Purpose");
			}
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					_RoundAndBorder(linear1, "#FFF5F5F5", 3, "#FF29C3FF", 15);
				}
			});
			
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