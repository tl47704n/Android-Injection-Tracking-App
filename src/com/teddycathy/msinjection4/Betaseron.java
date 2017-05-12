package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Betaseron extends Activity{
	Button everyother;
	ImageButton back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.betaseron_how_often);
		back = (ImageButton)findViewById(R.id.btback_betaseron);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Betaseron.this, Choose_medication.class);
				startActivity(intent);
			}
		});
		
		everyother = (Button)findViewById(R.id.btEvery_other_day);
		everyother.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Betaseron.this, EveryOtherDay.class);
				startActivity(intent);
			}
		});
	}
	
}
