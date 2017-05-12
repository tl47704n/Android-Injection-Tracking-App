package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Avenox extends Activity{
	Button button;
	ImageButton back;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.avenox_how_often);
		button = (Button)findViewById(R.id.btOnce_a_week);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Avenox.this, Once_a_week.class );
				startActivity(intent);
			}
		});
		back = (ImageButton)findViewById(R.id.btback_avenox);
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Avenox.this,Choose_medication.class);
				startActivity(intent);
			}
		});
	}
	
}
