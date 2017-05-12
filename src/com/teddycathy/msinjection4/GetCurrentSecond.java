package com.teddycathy.msinjection4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.util.Log;

public class GetCurrentSecond {

	/*public static long getseconds(){
		Date now = new Date();
		int hour = now.getDay();
		Log.e("hour", " "+hour);
		int minute = now.getMinutes();
		Log.e("min", " "+minute);
		int second = now.getSeconds();
		Log.e("sec", " "+second);
		int secondnow = hour * 3600 + minute * 60 + second;
		Log.e("seconds", " "+secondnow);
		return secondnow;
	}*/
	
	
	private String getDateTime() { 
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   Date date = new Date(); 
		   return dateFormat.format(date); 
		}
	
	
}
