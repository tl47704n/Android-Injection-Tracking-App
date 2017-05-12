package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Once_a_week extends Activity{
	Button add, sub,add1,sub1;
	ImageButton back,next;
	String clock1 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	String motosun []= new String[]{"Mon",	"Tue","Wed","Thu","Fri","Sat","Sun"	};
	TextView display,display1;
	int counter,counter1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		setContentView(R.layout.once_a_week);
			counter = 0;
			add = (Button)findViewById(R.id.btAddsettime_once_a_week);
			sub = (Button)findViewById(R.id.btMinorsetclock_once);
			display = (TextView)findViewById(R.id.tvMontosun_once_a_week);
			back = (ImageButton)findViewById(R.id.btback_once_a_week);
			next = (ImageButton)findViewById(R.id.bt_once_aweek);
			back.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Once_a_week.this, Avenox.class);
					startActivity(intent);
				}
			});
			
			add.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					counter++;
					if(counter == 7){counter = 0;}
					display.setText(""+motosun[counter] );
				}
				
				
			});
			
			sub.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					counter--;
					if(counter==-1){counter= 6;}
					display.setText(""+motosun[counter]);
				}
			});
			
			add1 = (Button)findViewById(R.id.btAddsetclock_once);
			sub1 = (Button)findViewById(R.id.btMinorsetclock_once);
			display1 = (TextView)findViewById(R.id.tv12to12_once);
			counter1 = 0;
			add1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					counter1++;
					if(counter1 == 24){counter1=0;}
					display1.setText(""+clock1[counter1]);
				}
		
			});
			sub1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					counter1--;
					if(counter1 == -1){counter1=23;}
					display1.setText(""+clock1[counter1]);
				}
			});
			next.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Once_a_week.this, MainCountDown.class);
					startActivity(intent);
				}
			});
	}
	

}
