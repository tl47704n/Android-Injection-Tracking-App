package com.teddycathy.msinjection4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class History extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.history);
		final DatabaseHelper2 dbh;
		dbh = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh1;
		dbh1 = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh2;
		dbh2 = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh3;
		dbh3 = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh4;
		dbh4 = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh5;
		dbh5 = new DatabaseHelper2(this);
		final DatabaseHelper2 dbh6;
		dbh6 = new DatabaseHelper2(this);
		final TextView tvhistory;
		Button swell;
		swell = (Button)findViewById(R.id.bt_swelling_history);
		Button redness = (Button)findViewById(R.id.bt_redness_history);
		Button rash = (Button)findViewById(R.id.bt_rash_history);
		Button bruise = (Button)findViewById(R.id.bt_bruising_history);
		Button pain = (Button)findViewById(R.id.bt_pain_history);
		Button other = (Button)findViewById(R.id.bt_other_history);
		tvhistory = (TextView)findViewById(R.id.tv_history);
		
		swell.setOnClickListener(new View.OnClickListener() {
		
		
			@Override
			public void onClick(View v) {
				dbh.getData1();
				tvhistory.setText("");
				String str1=dbh.fetchdata();
				tvhistory.setText(str1);
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
		
		redness.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				dbh2.getData2();
				tvhistory.setText("");
				String str2=dbh2.fetchdata();
				tvhistory.setText(str2);
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
		
		rash.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				dbh3.getData3();
				tvhistory.setText("");
				String str3=dbh3.fetchdata();
				tvhistory.setText(str3);
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
		bruise.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				dbh4.getData4();
				tvhistory.setText("");
				String str4=dbh4.fetchdata();
				tvhistory.setText(str4);
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
		pain.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				dbh5.getData5();
				tvhistory.setText("");
				String str5=dbh5.fetchdata();
				tvhistory.setText(str5);
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
		other.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				dbh6.getData6();
				tvhistory.setText("");
				String str6=dbh6.fetchdata();
				Log.e("othert", "other"+str6);
				tvhistory.setText(str6);
				if(str6.equals("")){
					tvhistory.setText("");
					Log.e("othert", "inside....");
				}
				// TODO Auto-generated method stub
				//tvhistory.setText(dbh.getData1().toString());
			}
		});
	}
	
}
