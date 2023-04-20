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
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PurchasedActivity extends  AppCompatActivity  { 
	
	
	private HashMap<String, Object> map = new HashMap<>();
	private String fontName = "";
	private String typeace = "";
	
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	private LinearLayout linear1;
	private ListView listview1;
	private ImageView imageview1;
	private TextView textview1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.purchased);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		listview1 = (ListView) findViewById(R.id.listview1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview1 = (TextView) findViewById(R.id.textview1);
	}
	
	private void initializeLogic() {
		for(int _repeat13 = 0; _repeat13 < (int)(5); _repeat13++) {
			map = new HashMap<>();
			map.put("key", String.valueOf((long)(SketchwareUtil.getRandom((int)(1), (int)(5)))));
			list.add(map);
		}
		listview1.setAdapter(new Listview1Adapter(list));
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
				_view = _inflater.inflate(R.layout.purchases, null);
			}
			
			final CardView cardview1 = (CardView) _view.findViewById(R.id.cardview1);
			
			textview1.setText("Purchase Course Title ".concat(String.valueOf((long)(_position)).concat("")));
			textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/en_light.ttf"), 0);
			
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