package com.teddycathy.msinjection4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

@TargetApi(Build.VERSION_CODES.GINGERBREAD)
@SuppressLint("NewApi")
public class MainCountDown extends Activity{
	Button btReport, btInjectionsite;
	TextView tvtimecount;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.countdown);
		
		Intent i=getIntent();
	//	int intValue = i.getIntExtra("timeinhour", 999);
	
		int intValue = getIntent().getExtras().getInt("timeinhour");
		Log.e("...", "intvalue--->" + intValue);
		
		GetCurrentSecond gcs=new GetCurrentSecond();
		
		//int ii=(int) gcs.getseconds();
		String str=getDateTime();
		String[] s=str.split(" ");
		for(int x=0;x<s.length;x++){
			Log.e("vlaues ", " "+s[x]);
		}
		Log.e("getdatetimne", " "+str);
		
		String[] t=s[1].split(":");
		for(int x=0;x<t.length;x++){
			Log.e("time in min hr sec ", " "+t[x]);
		}
		int h=Integer.parseInt(t[0]);
		int m=Integer.parseInt(t[1]);
		int sec=Integer.parseInt(t[2]);
		int second = intValue*3600 - (h * 3600 + m*60+sec);
	
	
		
		//int second = intValue*3600 - ii;
		if (second < 0){second = second + 24*3600;}
		Log.e("second=", " "+second);
		
		tvtimecount = (TextView)findViewById(R.id.tv_displaytime);
		//tvtimecount.setText("00:03:00");
		btReport = (Button)findViewById(R.id.bt_reportissue);
		btInjectionsite = (Button)findViewById(R.id.bt_InjectionSite);
		new CountDownTimer(second*1000, 1000) {

		     public void onTick(long millisUntilFinished) {
		    	 Log.e("untilfin", " "+millisUntilFinished);
		    	 tvtimecount.setText((millisUntilFinished / 60000 /60)+":"+(millisUntilFinished / 60000%60)+":"+(millisUntilFinished % 60000 / 1000));
		     }

		     public void onFinish() {
		    	 tvtimecount.setText("done!");
		     }
		  }.start();
		
		btReport.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainCountDown.this,Report_Issues.class);
				startActivity(intent);
			}
		});
		
		btInjectionsite.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainCountDown.this, Choose_position.class);
				startActivity(intent);
			}
		});
	}
	@TargetApi(Build.VERSION_CODES.GINGERBREAD)
	@SuppressLint("NewApi")
	public class CounterClass extends CountDownTimer{

		public CounterClass(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
			// TODO Auto-generated constructor stub
		}
		@SuppressLint("NewApi")
		@TargetApi(Build.VERSION_CODES.GINGERBREAD)
		@Override
		public void onTick(long millisUntilFinished) {
			// TODO Auto-generated method stub
			long millis = millisUntilFinished;
			String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
					TimeUnit.MICROSECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
							TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
			System.out.println(hms);
			tvtimecount.setText(hms);
		}

		@Override
		public void onFinish() {
			// TODO Auto-generated method stub
			
		}
				
		
	}
	
	private String getDateTime() { 
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   Date date = new Date(); return dateFormat.format(date); 
		}
}
