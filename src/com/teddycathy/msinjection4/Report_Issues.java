package com.teddycathy.msinjection4;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ResourceAsColor")
public class Report_Issues extends Activity{
	
	Boolean sw,re,ra,br,pa,ot;
	DatabaseHelper2 myDb;
	EditText editreport;
	Button submit,swelling,redness,rash,bruising,pain,other,tohistory;
	TextView tv;
	ImageView back;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.report_issue);
		myDb = new DatabaseHelper2(this);
		submit = (Button)findViewById(R.id.bt_submit_report);
		editreport = (EditText)findViewById(R.id.et_report);
		swelling = (Button)findViewById(R.id.bt_swelling);
		redness = (Button)findViewById(R.id.bt_redness);
		rash = (Button)findViewById(R.id.bt_rash);
		bruising = (Button)findViewById(R.id.bt_bruising);
		pain = (Button)findViewById(R.id.bt_pain);
		other = (Button)findViewById(R.id.bt_other);
		tohistory = (Button)findViewById(R.id.bt_goto_history);
		tv=(TextView)findViewById(R.id.tv_show_medic);
		back=(ImageView)findViewById(R.id.bt_back);
		
		back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Report_Issues.this, MainCountDown.class);
				startActivity(intent);
				finish();
			}
		});
				
		
		tohistory.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Report_Issues.this, History.class);
				startActivity(intent);
			}
		});
		editreport.setFocusable(false);
		
		editreport.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				editreport.setFocusableInTouchMode(true);
				return false;
			}
		});

		swelling.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 sw = true;
				 re = false;
				 ra = false;
				 br = false;
				 pa = false;
				 ot = false;
				swelling.setBackgroundColor(Color.rgb(255,128,0));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(0,162,232));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(0,162,232));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(0,162,232));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(0,162,232));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(0,162,232));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("SWELLING");
				
			}
		});

		redness.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 sw = false;
				 re = true;
				 ra = false;
				 br = false;
				 pa = false;
				 ot = false;
				swelling.setBackgroundColor(Color.rgb(0,162,232));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(255,128,0));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(0,162,232));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(0,162,232));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(0,162,232));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(0,162,232));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("REDNESS");
			}
		});
		
		rash.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 sw = false;
				 re = false;
				 ra = true;
				 br = false;
				 pa = false;
				 ot = false;
				swelling.setBackgroundColor(Color.rgb(0,162,232));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(0,162,232));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(255,128,0));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(0,162,232));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(0,162,232));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(0,162,232));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("RASH");
			}
		});		
		bruising.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 sw = false;
				 re = false;
				 ra = false;
				 br = true;
				 pa = false;
				 ot = false;
				swelling.setBackgroundColor(Color.rgb(0,162,232));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(0,162,232));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(0,162,232));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(255,128,0));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(0,162,232));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(0,162,232));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("BRUISING");
			}
		});
		pain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//  Auto-generated method stub
				 sw = false;
				 re = false;
				 ra = false;
				 br = false;
				 pa = true;
				 ot = false;
				swelling.setBackgroundColor(Color.rgb(0,162,232));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(0,162,232));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(0,162,232));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(0,162,232));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(255,128,0));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(0,162,232));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("PAIN");
			}
		});		
		other.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 sw = false;
				 re = false;
				 ra = false;
				 br = false;
				 pa = false;
				 ot = true;
				swelling.setBackgroundColor(Color.rgb(0,162,232));
				swelling.setTextColor(Color.rgb(255,255,255));
				redness.setBackgroundColor(Color.rgb(0,162,232));
				redness.setTextColor(Color.rgb(255,255,255));
				rash.setBackgroundColor(Color.rgb(0,162,232));
				rash.setTextColor(Color.rgb(255,255,255));	
				bruising.setBackgroundColor(Color.rgb(0,162,232));
				bruising.setTextColor(Color.rgb(255,255,255));
				pain.setBackgroundColor(Color.rgb(0,162,232));
				pain.setTextColor(Color.rgb(255,255,255));
				other.setBackgroundColor(Color.rgb(255,128,0));
				other.setTextColor(Color.rgb(255,255,255));
				tv.setText("OTHER");
			}
		});		
		submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if ( sw){
					myDb.insertData1(editreport.getText().toString());
					
					Log.e("sw", "sw");
				
				}
				else if (re){
					myDb.insertData2(editreport.getText().toString());
					Log.e("re", "re");
				}
				else if (ra){
					myDb.insertData3(editreport.getText().toString());
					Log.e("ra", "ra");
				}
				else if (br){
					myDb.insertData4(editreport.getText().toString());
					Log.e("br", "br");
				}
				else if (pa){
					myDb.insertData5(editreport.getText().toString());
					Log.e("pa", "pa");
				}
				else if(ot){
					myDb.insertData6(editreport.getText().toString());
					Log.e("ot", "ot");
				}
				
				editreport.setText("");
			}
			
			
			
		});
		
	}

}
