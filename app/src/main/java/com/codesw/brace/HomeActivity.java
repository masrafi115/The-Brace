package com.codesw.brace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
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
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HomeActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private String fontName = "";
	private String typeace = "";
	
	private LinearLayout linear60;
	private LinearLayout toolbar;
	private TabLayout tablayout1;
	private ViewPager viewpager1;
	private ImageView sort;
	private TextView textview16;
	private TextView textview17;
	private LinearLayout view;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear23;
	private LinearLayout _drawer_linear22;
	private ScrollView _drawer_vscroll1;
	private LinearLayout _drawer_linear4;
	private LinearLayout _drawer_linear24;
	private LinearLayout _drawer_linear18;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear15;
	private LinearLayout _drawer_linear19;
	private LinearLayout _drawer_linear20;
	private LinearLayout _drawer_linear27;
	private LinearLayout _drawer_linear21;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_linear26;
	private LinearLayout _drawer_linear25;
	private TextView _drawer_textview12;
	private TextView _drawer_textview13;
	private ImageView _drawer_i4;
	private TextView _drawer_textview4;
	private ImageView _drawer_i3;
	private TextView _drawer_textview6;
	private ImageView _drawer_i2;
	private TextView _drawer_textview10;
	private ImageView _drawer_i1;
	private TextView _drawer_textview11;
	private TextView _drawer_textview14;
	private TextView _drawer_textview17;
	private TextView _drawer_textview15;
	private TextView _drawer_textview16;
	private ImageView _drawer_i5;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		toolbar = (LinearLayout) findViewById(R.id.toolbar);
		tablayout1 = (TabLayout) findViewById(R.id.tablayout1);
		viewpager1 = (ViewPager) findViewById(R.id.viewpager1);
		sort = (ImageView) findViewById(R.id.sort);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		view = (LinearLayout) findViewById(R.id.view);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear23 = (LinearLayout) _nav_view.findViewById(R.id.linear23);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_vscroll1 = (ScrollView) _nav_view.findViewById(R.id.vscroll1);
		_drawer_linear4 = (LinearLayout) _nav_view.findViewById(R.id.linear4);
		_drawer_linear24 = (LinearLayout) _nav_view.findViewById(R.id.linear24);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_linear20 = (LinearLayout) _nav_view.findViewById(R.id.linear20);
		_drawer_linear27 = (LinearLayout) _nav_view.findViewById(R.id.linear27);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_linear26 = (LinearLayout) _nav_view.findViewById(R.id.linear26);
		_drawer_linear25 = (LinearLayout) _nav_view.findViewById(R.id.linear25);
		_drawer_textview12 = (TextView) _nav_view.findViewById(R.id.textview12);
		_drawer_textview13 = (TextView) _nav_view.findViewById(R.id.textview13);
		_drawer_i4 = (ImageView) _nav_view.findViewById(R.id.i4);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_i3 = (ImageView) _nav_view.findViewById(R.id.i3);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_i2 = (ImageView) _nav_view.findViewById(R.id.i2);
		_drawer_textview10 = (TextView) _nav_view.findViewById(R.id.textview10);
		_drawer_i1 = (ImageView) _nav_view.findViewById(R.id.i1);
		_drawer_textview11 = (TextView) _nav_view.findViewById(R.id.textview11);
		_drawer_textview14 = (TextView) _nav_view.findViewById(R.id.textview14);
		_drawer_textview17 = (TextView) _nav_view.findViewById(R.id.textview17);
		_drawer_textview15 = (TextView) _nav_view.findViewById(R.id.textview15);
		_drawer_textview16 = (TextView) _nav_view.findViewById(R.id.textview16);
		_drawer_i5 = (ImageView) _nav_view.findViewById(R.id.i5);
		
		sort.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_OpenDrawer();
			}
		});
		
		_drawer_linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ProfileActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PurchasedActivity.class);
				startActivity(i);
			}
		});
		
		_drawer_linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ExtraActivity.class);
				i.putExtra("info", "pp");
				startActivity(i);
			}
		});
		
		_drawer_linear27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), ExtraActivity.class);
				i.putExtra("info", "au");
				startActivity(i);
			}
		});
		
		_drawer_linear21.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), RequestActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		_ActionBarHide();
		_setDrawerWidth(250);
		_NavStatusBarColor("#FFFFFF", "#FFFFFF");
		_hide_buttom();
		_changeActivityFont("en_light");
		_drawer_textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/roboto_medium.ttf"), 0);
		_ICC(_drawer_i1, "#0084FF", "#0084FF");
		_ICC(_drawer_i2, "#0084FF", "#0084FF");
		_ICC(_drawer_i3, "#0084FF", "#0084FF");
		_ICC(_drawer_i4, "#0084FF", "#0084FF");
		_DARK_ICONS();
		_SimpleRipple(_drawer_linear6);
		_SimpleRipple(_drawer_linear8);
		_SimpleRipple(_drawer_linear15);
		_SimpleRipple(_drawer_linear14);
		_SimpleRipple(_drawer_linear20);
		_SimpleRipple(_drawer_linear21);
		tablayout1.setupWithViewPager(viewpager1);
		viewpager1.setAdapter(new MyFragmentAdapter(getApplicationContext(), getSupportFragmentManager(), 3));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public class MyFragmentAdapter extends FragmentStatePagerAdapter {
		Context context;
		int tabCount;
		
		public MyFragmentAdapter(Context context, FragmentManager fm, int tabCount) {
			super(fm);
			this.context = context;
			this.tabCount = tabCount;
		}
		
		@Override
		public int getCount(){
			return tabCount;
		}
		
		@Override
		public CharSequence getPageTitle(int _position) {
			if (_position == 0) {
				return "Website";
			}
			if (_position == 1) {
				return "Android";
			}
			if (_position == 2) {
				return "Practice";
			}
			return null;
		}
		
		@Override
		public Fragment getItem(int _position) {
			if (_position == 0) {
				return new Fragment1FragmentActivity();
			}
			else {
				if (_position == 1) {
					return new Fragment2FragmentActivity();
				}
				else {
					if (_position == 2) {
						return new Fragment3FragmentActivity();
					}
				}
			}
			return null;
		}
		
	}
	
	@Override
	public void onBackPressed() {
		finishAffinity();
	}
	public void _ActionBarHide () {
		getSupportActionBar().hide();
	}
	
	
	public void _OpenDrawer () {
		_drawer.openDrawer(GravityCompat.START);
	}
	
	
	public void _setDrawerWidth (final double _num) {
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		_nav_view.setBackgroundColor(Color.parseColor("#FFFFFF"));
		
		androidx.drawerlayout.widget.DrawerLayout.LayoutParams params = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams)_nav_view.getLayoutParams();
		
		params.width = (int)getDip((int)_num);
		
		params.height = androidx.drawerlayout.widget.DrawerLayout.LayoutParams.MATCH_PARENT;
		
		_nav_view.setLayoutParams(params);
	}
	
	
	public void _hide_buttom () {
		getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
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
	
	
	public void _NavStatusBarColor (final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _ICC (final ImageView _img, final String _c1, final String _c2) {
		_img.setImageTintList(new android.content.res.ColorStateList(new int[][] {{-android.R.attr.state_pressed},{android.R.attr.state_pressed}},new int[]{Color.parseColor(_c1), Color.parseColor(_c2)}));
	}
	
	
	public void _RippleEffects (final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null);
		_view.setBackground(ripdr);
	}
	
	
	public void _DARK_ICONS () {
		getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
	}
	
	
	public void _SimpleRipple (final View _view) {
		android.graphics.drawable.RippleDrawable GA8PO9 = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{ Color.parseColor("#EEEEEE")}), new android.graphics.drawable.ColorDrawable(Color.WHITE), null);
		
		_view.setBackground(GA8PO9);
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