package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EveryDay extends Activity{
	Button add, sub;
	ImageButton back,next;
	String clock1 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	TextView display;
	int counter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.everyday);
		back = (ImageButton)findViewById(R.id.btback_everyday);
		next = (ImageButton)findViewById(R.id.bt_next_everyday);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(EveryDay.this,Copaxone.class);
				startActivity(intent);
			}
		});
		

		add = (Button)findViewById(R.id.btAddsetclock_everyday);
		sub = (Button)findViewById(R.id.btMinorsetclock_everyday);
		display = (TextView)findViewById(R.id.tv12to12_everyday);
		counter = 0;
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter++;
				if(counter == 24){counter=0;}
				display.setText(""+clock1[counter]);
			}
	
		});
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter--;
				if(counter == -1){counter=23;}
				display.setText(""+clock1[counter]);
			}
		});
		
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int timeinhour = counter + 12;
				Intent intent = new Intent(EveryDay.this, MainCountDown.class);
				intent.putExtra("timeinhour", timeinhour);
				startActivity(intent);
				Log.e("timeinhour","--->" + timeinhour);
			}
		});

	}
	
}
