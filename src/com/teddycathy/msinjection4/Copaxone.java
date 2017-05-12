package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Copaxone extends Activity{
	ImageButton next,back;
	Button daily,three;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.copaxone_how_often);
		next = (ImageButton)findViewById(R.id.btNextCop);
		back = (ImageButton)findViewById(R.id.btBackCop);
		daily = (Button)findViewById(R.id.btDaily);
		three = (Button)findViewById(R.id.btThree_times_per_week_cop);
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (Copaxone.this,Choose_medication.class);
				startActivity(intent);
			}
		});
		three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (Copaxone.this,Three_times_a_week.class);
				startActivity(intent);
			}
		});
		daily.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Copaxone.this,EveryDay.class);
				startActivity(intent);
			}
		});
	}
}
