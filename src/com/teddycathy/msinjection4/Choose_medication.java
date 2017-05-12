package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Choose_medication extends Activity{
	Button rebif;
	Button plegridy;
	Button copaxone;
	Button betaseron;
	Button avenox;
	ImageButton next,back;
	public static String med;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_medication);
		rebif = (Button)findViewById(R.id.btRebif);
		plegridy= (Button)findViewById(R.id.btPlegridy);
		copaxone = (Button)findViewById(R.id.btCopaxone);
		betaseron = (Button)findViewById(R.id.btBetaseron);
		avenox = (Button)findViewById(R.id.btAvenox);
		next = (ImageButton)findViewById(R.id.btNext_choosemed);
		back = (ImageButton)findViewById(R.id.btback_in_choosemed);
		
		back.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this,SetupEmail.class);
				startActivity(intent);
			}
		});
		rebif.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this, Rebif.class);
				med="REBIF";
				startActivity(intent);
			}
		});
		
		plegridy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this, Plegridy.class);
				med="PLEGRIDY";
				startActivity(intent);
			}
		});
		copaxone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this, Copaxone.class);
				med="COPAXONE";
				startActivity(intent);
			}
		});
		betaseron.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this, Betaseron.class);
				med="BETASERON";
				startActivity(intent);
			}
		});
		avenox.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Choose_medication.this, Avenox.class);
				med="AVENOX";
				startActivity(intent);
			}
		});
	}
	
}
