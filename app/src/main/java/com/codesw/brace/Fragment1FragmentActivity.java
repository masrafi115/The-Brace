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
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.HorizontalScrollView;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Fragment1FragmentActivity extends  Fragment  { 
	
	
	private LinearLayout linear60;
	private ScrollView vscroll1;
	private LinearLayout linear61;
	private LinearLayout linear1;
	private LinearLayout linear62;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private LinearLayout gridv;
	private TextView textview2;
	private TextView textview4;
	private LinearLayout linear64;
	private TextView textview47;
	private TextView textview48;
	private LinearLayout gridvi;
	private LinearLayout linear63;
	private LinearLayout linear53;
	private LinearLayout linear6;
	private LinearLayout linear10;
	private LinearLayout linear13;
	private LinearLayout s1;
	private LinearLayout s2;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private TextView textview39;
	private LinearLayout linear22;
	private LinearLayout s7;
	private ImageView imageview3;
	private TextView textview9;
	private TextView textview8;
	private LinearLayout linear16;
	private LinearLayout linear15;
	private LinearLayout linear14;
	private TextView textview5;
	private LinearLayout linear17;
	private LinearLayout s8;
	private ImageView imageview2;
	private TextView textview6;
	private TextView textview7;
	private LinearLayout s3;
	private LinearLayout s4;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private TextView textview40;
	private LinearLayout linear34;
	private LinearLayout s9;
	private ImageView imageview5;
	private TextView textview41;
	private TextView textview42;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private TextView textview43;
	private LinearLayout linear28;
	private LinearLayout s10;
	private ImageView imageview4;
	private TextView textview44;
	private TextView textview45;
	private LinearLayout s5;
	private LinearLayout s6;
	private LinearLayout linear43;
	private LinearLayout linear44;
	private LinearLayout linear45;
	private TextView textview22;
	private LinearLayout linear46;
	private LinearLayout s11;
	private ImageView imageview7;
	private TextView textview21;
	private TextView textview20;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private TextView textview19;
	private LinearLayout linear40;
	private LinearLayout s12;
	private ImageView imageview6;
	private TextView textview18;
	private TextView textview46;
	private LinearLayout linear47;
	private HorizontalScrollView hscroll10;
	private LinearLayout linear54;
	private LinearLayout linear48;
	private LinearLayout linear57;
	private LinearLayout linear56;
	private TextView textview10;
	private TextView textview11;
	private Button button8;
	private TextView textview12;
	private TextView textview13;
	private Button button9;
	private TextView textview14;
	private TextView textview15;
	private Button button10;
	
	private Intent i = new Intent();
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.fragment1_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		
		linear60 = (LinearLayout) _view.findViewById(R.id.linear60);
		vscroll1 = (ScrollView) _view.findViewById(R.id.vscroll1);
		linear61 = (LinearLayout) _view.findViewById(R.id.linear61);
		linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
		linear62 = (LinearLayout) _view.findViewById(R.id.linear62);
		linear4 = (LinearLayout) _view.findViewById(R.id.linear4);
		linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
		gridv = (LinearLayout) _view.findViewById(R.id.gridv);
		textview2 = (TextView) _view.findViewById(R.id.textview2);
		textview4 = (TextView) _view.findViewById(R.id.textview4);
		linear64 = (LinearLayout) _view.findViewById(R.id.linear64);
		textview47 = (TextView) _view.findViewById(R.id.textview47);
		textview48 = (TextView) _view.findViewById(R.id.textview48);
		gridvi = (LinearLayout) _view.findViewById(R.id.gridvi);
		linear63 = (LinearLayout) _view.findViewById(R.id.linear63);
		linear53 = (LinearLayout) _view.findViewById(R.id.linear53);
		linear6 = (LinearLayout) _view.findViewById(R.id.linear6);
		linear10 = (LinearLayout) _view.findViewById(R.id.linear10);
		linear13 = (LinearLayout) _view.findViewById(R.id.linear13);
		s1 = (LinearLayout) _view.findViewById(R.id.s1);
		s2 = (LinearLayout) _view.findViewById(R.id.s2);
		linear19 = (LinearLayout) _view.findViewById(R.id.linear19);
		linear20 = (LinearLayout) _view.findViewById(R.id.linear20);
		linear21 = (LinearLayout) _view.findViewById(R.id.linear21);
		textview39 = (TextView) _view.findViewById(R.id.textview39);
		linear22 = (LinearLayout) _view.findViewById(R.id.linear22);
		s7 = (LinearLayout) _view.findViewById(R.id.s7);
		imageview3 = (ImageView) _view.findViewById(R.id.imageview3);
		textview9 = (TextView) _view.findViewById(R.id.textview9);
		textview8 = (TextView) _view.findViewById(R.id.textview8);
		linear16 = (LinearLayout) _view.findViewById(R.id.linear16);
		linear15 = (LinearLayout) _view.findViewById(R.id.linear15);
		linear14 = (LinearLayout) _view.findViewById(R.id.linear14);
		textview5 = (TextView) _view.findViewById(R.id.textview5);
		linear17 = (LinearLayout) _view.findViewById(R.id.linear17);
		s8 = (LinearLayout) _view.findViewById(R.id.s8);
		imageview2 = (ImageView) _view.findViewById(R.id.imageview2);
		textview6 = (TextView) _view.findViewById(R.id.textview6);
		textview7 = (TextView) _view.findViewById(R.id.textview7);
		s3 = (LinearLayout) _view.findViewById(R.id.s3);
		s4 = (LinearLayout) _view.findViewById(R.id.s4);
		linear31 = (LinearLayout) _view.findViewById(R.id.linear31);
		linear32 = (LinearLayout) _view.findViewById(R.id.linear32);
		linear33 = (LinearLayout) _view.findViewById(R.id.linear33);
		textview40 = (TextView) _view.findViewById(R.id.textview40);
		linear34 = (LinearLayout) _view.findViewById(R.id.linear34);
		s9 = (LinearLayout) _view.findViewById(R.id.s9);
		imageview5 = (ImageView) _view.findViewById(R.id.imageview5);
		textview41 = (TextView) _view.findViewById(R.id.textview41);
		textview42 = (TextView) _view.findViewById(R.id.textview42);
		linear25 = (LinearLayout) _view.findViewById(R.id.linear25);
		linear26 = (LinearLayout) _view.findViewById(R.id.linear26);
		linear27 = (LinearLayout) _view.findViewById(R.id.linear27);
		textview43 = (TextView) _view.findViewById(R.id.textview43);
		linear28 = (LinearLayout) _view.findViewById(R.id.linear28);
		s10 = (LinearLayout) _view.findViewById(R.id.s10);
		imageview4 = (ImageView) _view.findViewById(R.id.imageview4);
		textview44 = (TextView) _view.findViewById(R.id.textview44);
		textview45 = (TextView) _view.findViewById(R.id.textview45);
		s5 = (LinearLayout) _view.findViewById(R.id.s5);
		s6 = (LinearLayout) _view.findViewById(R.id.s6);
		linear43 = (LinearLayout) _view.findViewById(R.id.linear43);
		linear44 = (LinearLayout) _view.findViewById(R.id.linear44);
		linear45 = (LinearLayout) _view.findViewById(R.id.linear45);
		textview22 = (TextView) _view.findViewById(R.id.textview22);
		linear46 = (LinearLayout) _view.findViewById(R.id.linear46);
		s11 = (LinearLayout) _view.findViewById(R.id.s11);
		imageview7 = (ImageView) _view.findViewById(R.id.imageview7);
		textview21 = (TextView) _view.findViewById(R.id.textview21);
		textview20 = (TextView) _view.findViewById(R.id.textview20);
		linear37 = (LinearLayout) _view.findViewById(R.id.linear37);
		linear38 = (LinearLayout) _view.findViewById(R.id.linear38);
		linear39 = (LinearLayout) _view.findViewById(R.id.linear39);
		textview19 = (TextView) _view.findViewById(R.id.textview19);
		linear40 = (LinearLayout) _view.findViewById(R.id.linear40);
		s12 = (LinearLayout) _view.findViewById(R.id.s12);
		imageview6 = (ImageView) _view.findViewById(R.id.imageview6);
		textview18 = (TextView) _view.findViewById(R.id.textview18);
		textview46 = (TextView) _view.findViewById(R.id.textview46);
		linear47 = (LinearLayout) _view.findViewById(R.id.linear47);
		hscroll10 = (HorizontalScrollView) _view.findViewById(R.id.hscroll10);
		linear54 = (LinearLayout) _view.findViewById(R.id.linear54);
		linear48 = (LinearLayout) _view.findViewById(R.id.linear48);
		linear57 = (LinearLayout) _view.findViewById(R.id.linear57);
		linear56 = (LinearLayout) _view.findViewById(R.id.linear56);
		textview10 = (TextView) _view.findViewById(R.id.textview10);
		textview11 = (TextView) _view.findViewById(R.id.textview11);
		button8 = (Button) _view.findViewById(R.id.button8);
		textview12 = (TextView) _view.findViewById(R.id.textview12);
		textview13 = (TextView) _view.findViewById(R.id.textview13);
		button9 = (Button) _view.findViewById(R.id.button9);
		textview14 = (TextView) _view.findViewById(R.id.textview14);
		textview15 = (TextView) _view.findViewById(R.id.textview15);
		button10 = (Button) _view.findViewById(R.id.button10);
		
		s1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "HTML");
				startActivity(i);
			}
		});
		
		s2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "HTML5");
				startActivity(i);
			}
		});
		
		s3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "CSS");
				startActivity(i);
			}
		});
		
		s4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "Bootstrap");
				startActivity(i);
			}
		});
		
		s5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "jQuery");
				startActivity(i);
			}
		});
		
		s6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), PurchaseActivity.class);
				i.putExtra("course", "SCSS");
				startActivity(i);
			}
		});
		
		button8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getContext(), QuizActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		_Elevation(linear3, 5);
		_Elevation(linear48, 5);
		_Elevation(linear57, 5);
		_Elevation(linear56, 5);
		_shapeRadius(linear3, "#2196F3", 8);
		_shapeRadius(linear48, "#000000", 8);
		_shapeRadius(linear57, "#00E676", 8);
		_shapeRadius(linear56, "#FF5722", 8);
		_ButtonColorFilter(button8, "#FFFFFF");
		_ButtonColorFilter(button9, "#FFFFFF");
		_ButtonColorFilter(button10, "#FFFFFF");
		android.graphics.drawable.GradientDrawable ss = new android.graphics.drawable.GradientDrawable();
		
		ss.setColor(Color.parseColor("#FA6962"));
		ss.setCornerRadius(22);
		s1.setElevation(0);
		s1.setBackground(ss);
		android.graphics.drawable.GradientDrawable ss1 = new android.graphics.drawable.GradientDrawable();
		
		ss1.setColor(Color.parseColor("#7A54FF"));
		ss1.setCornerRadius(22);
		s2.setElevation(0);
		s2.setBackground(ss1);
		android.graphics.drawable.GradientDrawable ss2 = new android.graphics.drawable.GradientDrawable();
		
		ss2.setColor(Color.parseColor("#FE8F60"));
		ss2.setCornerRadius(22);
		s3.setElevation(0);
		s3.setBackground(ss2);
		android.graphics.drawable.GradientDrawable ss3 = new android.graphics.drawable.GradientDrawable();
		
		ss3.setColor(Color.parseColor("#2AC3FF"));
		ss3.setCornerRadius(22);
		s4.setElevation(0);
		s4.setBackground(ss3);
		android.graphics.drawable.GradientDrawable ss4 = new android.graphics.drawable.GradientDrawable();
		
		ss4.setColor(Color.parseColor("#5A65FF"));
		ss4.setCornerRadius(22);
		s5.setElevation(0);
		s5.setBackground(ss4);
		android.graphics.drawable.GradientDrawable ss5 = new android.graphics.drawable.GradientDrawable();
		
		ss5.setColor(Color.parseColor("#96DA45"));
		ss5.setCornerRadius(22);
		s6.setElevation(0);
		s6.setBackground(ss5);
		android.graphics.drawable.GradientDrawable ss6 = new android.graphics.drawable.GradientDrawable();
		
		ss6.setColor(Color.parseColor("#FE817F"));
		ss6.setCornerRadius(80);
		s7.setElevation(0);
		s7.setBackground(ss6);
		android.graphics.drawable.GradientDrawable ss7 = new android.graphics.drawable.GradientDrawable();
		
		ss7.setColor(Color.parseColor("#916AFE"));
		ss7.setCornerRadius(80);
		s8.setElevation(0);
		s8.setBackground(ss7);
		android.graphics.drawable.GradientDrawable ss8 = new android.graphics.drawable.GradientDrawable();
		
		ss8.setColor(Color.parseColor("#FDA576"));
		ss8.setCornerRadius(80);
		s9.setElevation(0);
		s9.setBackground(ss8);
		android.graphics.drawable.GradientDrawable ss9 = new android.graphics.drawable.GradientDrawable();
		
		ss9.setColor(Color.parseColor("#34D3FA"));
		ss9.setCornerRadius(80);
		s10.setElevation(0);
		s10.setBackground(ss9);
		android.graphics.drawable.GradientDrawable ss10 = new android.graphics.drawable.GradientDrawable();
		
		ss10.setColor(Color.parseColor("#6F7AFE"));
		ss10.setCornerRadius(80);
		s11.setElevation(0);
		s11.setBackground(ss10);
		android.graphics.drawable.GradientDrawable ss11 = new android.graphics.drawable.GradientDrawable();
		
		ss11.setColor(Color.parseColor("#AAE656"));
		ss11.setCornerRadius(80);
		s12.setElevation(0);
		s12.setBackground(ss11);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _shapeRadius (final View _v, final String _color, final double _radius) {
		android.graphics.drawable.GradientDrawable shape = new android.graphics.drawable.GradientDrawable();
		  shape.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		
		shape.setCornerRadius((int)_radius);
		
		shape.setColor(Color.parseColor(_color));
		_v.setBackgroundDrawable(shape);
	}
	
	
	public void _ButtonColorFilter (final View _view, final String _color) {
		_view.getBackground().setColorFilter(Color.parseColor(_color), PorterDuff.Mode.MULTIPLY);
	}
	
	
	public void _Elevation (final View _view, final double _number) {
		
		_view.setElevation((int)_number);
	}
	
	
	
}