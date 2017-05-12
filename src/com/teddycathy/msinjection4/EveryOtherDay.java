package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class EveryOtherDay extends Activity{
	ImageButton back,next;
	Button addday,addtime,subday,subtime;
	int counter1,counter2;
	TextView display,display2;
	String clock1 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	String motosun []= new String[]{"Mon",	"Tue","Wed","Thu","Fri","Sat","Sun"	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.every_other_day);

		back = (ImageButton)findViewById(R.id.btback_every_other_day);
		next = (ImageButton)findViewById(R.id.bt_everyotherday);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(EveryOtherDay.this,Betaseron.class);
				startActivity(intent);
			}
		});
		
		counter1 = 0;
		addday = (Button)findViewById(R.id.btAddsettime_every_other_day);
		subday = (Button)findViewById(R.id.btMinorsettime_every_other_day);
		display = (TextView)findViewById(R.id.tvMontosun_every_other_day);
		

		
		
		addday.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				counter1++;
				if(counter1 == 7){counter1 = 0;}
				display.setText(""+motosun[counter1] );
			}
			
			
		});
		subday.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter1--;
				if(counter1==-1){counter1= 6;}
				display.setText(""+motosun[counter1]);
			}
		});
		
		addtime = (Button)findViewById(R.id.btAddsetclock_every_other_day);
		subtime = (Button)findViewById(R.id.btMinorsetclock_every_other_day);
		display2 = (TextView)findViewById(R.id.tv12to12_every_other_day);
		counter2 = 0;
		addtime.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2++;
				if(counter2 == 24){counter2=0;}
				display2.setText(""+clock1[counter2]);
			}
	
		});
		subtime.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2--;
				if(counter2 == -1){counter2=23;}
				display2.setText(""+clock1[counter2]);
			}
		});
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(EveryOtherDay.this, MainCountDown.class);
				startActivity(intent);
			}
		});
	}
	

}
