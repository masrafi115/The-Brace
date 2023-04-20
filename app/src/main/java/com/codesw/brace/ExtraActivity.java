package com.codesw.brace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ExtraActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private FloatingActionButton _fab;
	private String title = "";
	private String content = "";
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private ScrollView vscroll1;
	private LinearLayout linear4;
	private ImageView image_back;
	private TextView text_title;
	private TextView text_msg;
	private LinearLayout linear6;
	private TextView music;
	private TextView garage;
	
	private TimerTask timer;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.extra);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		image_back = (ImageView) findViewById(R.id.image_back);
		text_title = (TextView) findViewById(R.id.text_title);
		text_msg = (TextView) findViewById(R.id.text_msg);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		music = (TextView) findViewById(R.id.music);
		garage = (TextView) findViewById(R.id.garage);
	}
	
	private void initializeLogic() {
		overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
		_SetStatusBarColor("#FFFFFF");
		linear1.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
		Window window = this.getWindow();window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);  window.setNavigationBarColor(Color.parseColor("#FFFFFF"));
		_Animation();
		_setBackground(image_back, 200, 0, "#FFFFFF", true);
		text_title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansbold.ttf"), 0);
		text_msg.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansregular.ttf"), 0);
		music.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensanslight.ttf"), 0);
		garage.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/opensansbold.ttf"), 1);
		_removeScollBar(vscroll1);
		if (getIntent().getStringExtra("info").equals("pp")) {
			title = "PRIVACY POLICY";
			content = "JawaHash Pvt LTD built the The Brace app as a Free app. This SERVICE is provided by JawaHash Pvt LTD at no cost and is intended for use as is. It contains in app purchase features inside app\n\n\nThis page is used to inform visitors regarding our policies with the collection, use, and disclosure of Personal Information if anyone decided to use our Service.\n\n\nIf you choose to use our Service, then you agree to the collection and use of information in relation to this policy. The Personal Information that we collect is used for providing and improving the Service. We will not use or share your information with anyone except as described in this Privacy Policy.\n\n\nThe terms used in this Privacy Policy have the same meanings as in our Terms and Conditions, which is accessible at The Brace unless otherwise defined in this Privacy Policy.\n\n\n**Information Collection and Use**\n\n\nFor a better experience, while using our Service, we may require you to provide us with certain personally identifiable information. The information that we request will be retained by us and used as described in this privacy policy.\n\n\nThe app does use third party services that may collect information used to identify you.\n\n\nLink to privacy policy of third party service providers used by the app\n\n\n* [Google Play Services](https://www.google.com/policies/privacy/)\n\n\n**Log Data**\n\n\nWe want to inform you that whenever you use our Service, in a case of an error in the app we collect data and information (through third party products) on your phone called Log Data. This Log Data may include information such as your device Internet Protocol (“IP”) address, device name, operating system version, the configuration of the app when utilizing our Service, the time and date of your use of the Service, and other statistics.\n\n\n**Cookies**\n\n\nCookies are files with a small amount of data that are commonly used as anonymous unique identifiers. These are sent to your browser from the websites that you visit and are stored on your device's internal memory.\n\n\nThis Service does not use these “cookies” explicitly. However, the app may use third party code and libraries that use “cookies” to collect information and improve their services. You have the option to either accept or refuse these cookies and know when a cookie is being sent to your device. If you choose to refuse our cookies, you may not be able to use some portions of this Service.\n\n\n**Service Providers**\n\n\nWe may employ third-party companies and individuals due to the following reasons:\n\n\n* To facilitate our Service;\n\n* To provide the Service on our behalf;\n\n* To perform Service-related services; or\n\n* To assist us in analyzing how our Service is used.\n\n\nWe want to inform users of this Service that these third parties have access to your Personal Information. The reason is to perform the tasks assigned to them on our behalf. However, they are obligated not to disclose or use the information for any other purpose.\n\n\n**Security**\n\n\nWe value your trust in providing us your Personal Information, thus we are striving to use commercially acceptable means of protecting it. But remember that no method of transmission over the internet, or method of electronic storage is 100% secure and reliable, and we cannot guarantee its absolute security.\n\n\n**Links to Other Sites**\n\n\nThis Service may contain links to other sites. If you click on a third-party link, you will be directed to that site. Note that these external sites are not operated by us. Therefore, we strongly advise you to review the Privacy Policy of these websites. We have no control over and assume no responsibility for the content, privacy policies, or practices of any third-party sites or services.\n\n\n**Children’s Privacy**\n\n\nThese Services do not address anyone under the age of 13. We do not knowingly collect personally identifiable information from children under 13\\. In the case we discover that a child under 13 has provided us with personal information, we immediately delete this from our servers. If you are a parent or guardian and you are aware that your child has provided us with personal information, please contact us so that we will be able to do necessary actions.\n\n\n**Changes to This Privacy Policy**\n\n\nWe may update our Privacy Policy from time to time. Thus, you are advised to review this page periodically for any changes. We will notify you of any changes by posting the new Privacy Policy on this page.\n\n\nThis policy is effective as of 2020-12-05\n\n\n**Contact Us**\n\n\nIf you have any questions or suggestions about our Privacy Policy, do not hesitate to contact us at -\n\n The.jawa.team@gmail.com.\n\n";
			text_title.setText(title);
			text_msg.setText(content);
		}
		else {
			if (getIntent().getStringExtra("info").equals("au")) {
				title = "ABOUT US";
				content = "Hi, and thank you for visiting Playerio’s copyright policy page. Playerio respects intellectual property rights and expects its users to do the same. If you are a copyright holder, or its agent, and you believe that any of the copyrighted material which is directly available via the Playerio Service infringes your copyrighted work, please let us know.\n\nPlease use this web form to submit a notice of alleged copyright infringement. Alternatively a notice of alleged copyright infringement may be sent to Playerio's designated copyright email at the following email address:\n\nCopyright-playeriosupport@gmail.com\n\nPlease include as much detail as possible to allow us to identify the facts or circumstances, including, where possible:\n\n1. A physical or electronic signature of the owner (or person authorised to act on behalf of the owner) of the copyright that is allegedly infringed;\n\n2. Specific identification of each copyrighted work claimed to have been infringed;\n\n3. A description of where the material believed to be infringing is located on Playerio Service or the Playerio Websites (please be as detailed as possible and provide some screenshots and anything you think it's will use like as a proof);\n\n4. Contact information for the complaining party, such as a complete name, address, telephone number, and email address;\n\n5. A statement that the complaining party has a good faith belief that use of the work(s) in the manner complained of is not authorised by the copyright owner, its agent, or the law; and\n\n6. A statement that the information in the notification is accurate, and that the complaining party is the owner of the right that is allegedly infringed, or agent for the owner.\n\nWe should also let you know that Playerio has a policy to terminate in appropriate circumstances the accounts of subscribers who are repeat infringers.\n\nLast updated: November 10, 2020\n\nCopyright © 2020 Playerio. All rights reserved.";
				text_title.setText(title);
				text_msg.setText(content);
			}
		}
		vscroll1.setOnTouchListener(new View.OnTouchListener() {
			Boolean scroll;
			@Override public boolean onTouch(View v, MotionEvent event) {
				scroll = false;
				switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
					x = event.getY();
					scroll = false;
					case MotionEvent.ACTION_UP:
					
					y = event.getY();
					if (((x - y) < -15)) {
						
						_FabAnimator("translationX", 500, 300);
					} 
					if (((y - x) < -15)) {
						
						_FabAnimator("translationX", 0, 300);
					}
					
					scroll = false;
				}
				return scroll;
			}
		});
	}
	private double x = 0;
	private double y = 0;
	{
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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
	
	
	public void _removeScollBar (final View _view) {
		_view.setVerticalScrollBarEnabled(false); _view.setHorizontalScrollBarEnabled(false);
	}
	
	
	public void _SetStatusBarColor (final String _color) {
		Window w = this.getWindow();w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS); w.setStatusBarColor(Color.parseColor(_color));
	}
	
	
	public void _Animation () {
		_FabAnimator("translationX", 500, 200);
		_Animator(linear6, "translationX", -250, 200);
		timer = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_Animator(linear6, "translationX", 0, 300);
					}
				});
			}
		};
		_timer.schedule(timer, (int)(850));
	}
	
	
	public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _FabAnimator (final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_fab);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
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