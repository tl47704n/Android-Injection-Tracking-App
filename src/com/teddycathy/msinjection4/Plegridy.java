package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Plegridy extends Activity{
	Button twoweek;
	ImageButton back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plegridy_how_often);
		back = (ImageButton)findViewById(R.id.btback_plegridy);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent (Plegridy.this, Choose_medication.class);
				startActivity(intent);
			}
		});
		
		
		twoweek = (Button)findViewById(R.id.btOnce_every_2weeks);
		twoweek.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Plegridy.this,OnceTwoWeeks.class);
				startActivity(intent);
			}
		});
		
	}
	
}
