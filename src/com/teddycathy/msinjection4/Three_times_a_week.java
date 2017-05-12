package com.teddycathy.msinjection4;

import com.teddycathy.msinjection4.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Three_times_a_week extends Activity{
	int counter,counter2,counter3,counterc1,counterc2,counterc3;
	Button add, sub,add2,sub2,add3,sub3,addc1,addc2,addc3,subc1,subc2,subc3;
	ImageButton back,next;
	String motosun []= new String[]{"Mon",	"Tue","Wed","Thu","Fri","Sat","Sun"	};
	String motosun2 []= new String[]{"Mon",	"Tue","Wed","Thu","Fri","Sat","Sun"	};
	String motosun3 []= new String[]{"Mon",	"Tue","Wed","Thu","Fri","Sat","Sun"	};	
	TextView display,display2,display3;
	String clock1 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	String clock2 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	String clock3 [] = new String[]{"12:00pm","1:00pm","2:00pm","3:00pm","4:00pm","5:00pm","6:00pm","7:00pm","8:00pm","9:00pm","10:00pm","11:00pm","00:00am","1:00am","2:00am","3:00am","4:00am","5:00am","6:00am","7:00am","8:00am","9:00am","10:00am","11:00am"};
	TextView displayc1,displayc2,displayc3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.three_times_a_week_set_time);
		next = (ImageButton)findViewById(R.id.btnext_countdown);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Three_times_a_week.this, MainCountDown.class);
				startActivity(intent);
			}
		});
		
		back = (ImageButton)findViewById(R.id.bt_three_time_aweek);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Three_times_a_week.this, Choose_medication.class);
				startActivity(intent);
			}
		});
		
		counter = 0;


		add = (Button)findViewById(R.id.btAddsettime);
		sub = (Button)findViewById(R.id.btMinorsettime);
		display = (TextView)findViewById(R.id.tvMontosun);
		

		
		
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
		
		add2 = (Button)findViewById(R.id.btAddsettime2);
		sub2 = (Button)findViewById(R.id.btMinorsettime2);
		display2 = (TextView)findViewById(R.id.tvMontosun2);
		counter2 = 2;
		add2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2++;
				if(counter2==7){counter2=0;}
				display2.setText(""+motosun2[counter2]);
			}
		});
		sub2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter2--;
				if(counter2==-1){counter2=6;}
				display2.setText(""+motosun2[counter2]);
			}
		});
		
		add3 = (Button)findViewById(R.id.btAddsettime3);
		sub3 = (Button)findViewById(R.id.btMinorsettime3);
		display3 = (TextView)findViewById(R.id.tvMontosun3);
		counter3 = 4;
		
		add3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter3++;
				if(counter3==7){counter3=0;}
				display3.setText(""+motosun3[counter3]);
			}
		});
		sub3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter3--;
				if(counter3==-1){counter3=6;}
				display3.setText(""+motosun3[counter3]);
			}
		});
		
		addc1 = (Button)findViewById(R.id.btAddsetclock1);
		subc1 = (Button)findViewById(R.id.btMinorsetclock1);
		displayc1 = (TextView)findViewById(R.id.tv12to12);
		counterc1 = 0;
		addc1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc1++;
				if(counterc1 == 24){counterc1=0;}
				displayc1.setText(""+clock1[counterc1]);
			}
	
		});
		subc1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc1--;
				if(counterc1 == -1){counterc1=23;}
				displayc1.setText(""+clock1[counterc1]);
			}
		});
		
		addc2 = (Button)findViewById(R.id.btAddsetclock2);
		subc2 = (Button)findViewById(R.id.btMinorsetclock2);
		displayc2 = (TextView)findViewById(R.id.tv12to12_2);
		counterc2 = 0;
		addc2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc2++;
				if(counterc2 == 24){counterc2=0;}
				displayc2.setText(""+clock2[counterc2]);
			}
	
		});
		subc2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc2--;
				if(counterc2 == -1){counterc2=23;}
				displayc2.setText(""+clock2[counterc2]);
			}
		});

		addc3 = (Button)findViewById(R.id.btAddsetclock3);
		subc3 = (Button)findViewById(R.id.btMinorsetclock3);
		displayc3 = (TextView)findViewById(R.id.tv12to12_3);
		counterc3 = 0;
		addc3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc3++;
				if(counterc3 == 24){counterc3=0;}
				displayc3.setText(""+clock3[counterc3]);
			}
	
		});
		subc3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counterc3--;
				if(counterc3 == -1){counterc3=23;}
				displayc3.setText(""+clock3[counterc3]);
			}
		});

	}
	

}
