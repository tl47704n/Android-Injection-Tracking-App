package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rebif extends Activity{
	Button threetimes;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.rebif_how_often);
		threetimes = (Button)findViewById(R.id.btThree_times_per_week);
		threetimes.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Rebif.this,Three_times_a_week.class);
				startActivity(intent);
			}
		});
		
	}
	
}
