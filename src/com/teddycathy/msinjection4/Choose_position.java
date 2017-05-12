package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Choose_position extends Activity{
	ImageButton btleft_thigh_front;
	ImageButton btright_thigh_front, btLEFT_BUTTOCK_UPPER_OUTER, btRIGHT_BUTTOCK_UPPER_OUTER;
	ImageButton btLEFT_ARM_UPPER_OUTER, btRIGHT_ARM_UPPER_OUTER,btABDOMEN;
	private TextView tv,tv_abdomen;
	RelativeLayout rl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_position);
	 tv=(TextView)findViewById(R.id.txt1);
	 
		tv.setText(Choose_medication.med);
		btleft_thigh_front = (ImageButton)findViewById(R.id.ibt_thigh_left);
		btright_thigh_front = (ImageButton)findViewById(R.id.ibt_thigh_right);
		btLEFT_BUTTOCK_UPPER_OUTER = (ImageButton)findViewById(R.id.ibt_buttock_left);
		btRIGHT_BUTTOCK_UPPER_OUTER = (ImageButton)findViewById(R.id.ibt_buttock_right);
		btLEFT_ARM_UPPER_OUTER = (ImageButton)findViewById(R.id.ibt_arm_left);
		btRIGHT_ARM_UPPER_OUTER = (ImageButton)findViewById(R.id.ibt_arm_right);
		btABDOMEN = (ImageButton)findViewById(R.id.ibt_abdomen);
		tv_abdomen = (TextView)findViewById(R.id.tv_Abdomen);
		
		String name=Choose_medication.med;
		
		if(name.equals("REBIF")||name.equals("PLEGRIDY")||name.equals("COPAXONE")||name.equals("BETASERON")){
			btLEFT_ARM_UPPER_OUTER.setBackgroundResource(R.drawable.arm_back_left);	
			btRIGHT_ARM_UPPER_OUTER.setBackgroundResource(R.drawable.arm_back_right);
			btABDOMEN.setBackgroundResource(R.drawable.abdomen);
			btABDOMEN.setVisibility(View.VISIBLE);
			tv_abdomen.setVisibility(View.VISIBLE);
		}
		
		btleft_thigh_front.setOnClickListener(new View.OnClickListener() {
			
			

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btleft_thigh_front.setVisibility(View.GONE);
				String position="Left Thigh Front";
				Intent intent = new Intent(Choose_position.this, Popup.class);
				intent.putExtra("position", position);
				startActivity(intent);
			
			}
		});
		
		btright_thigh_front.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btright_thigh_front.setVisibility(View.GONE);
				String position1="Right Thigh Front";
				Intent intent1 = new Intent(Choose_position.this, Popup.class);
				intent1.putExtra("position", position1);
				startActivity(intent1);
			}
		});
		btLEFT_BUTTOCK_UPPER_OUTER.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btLEFT_BUTTOCK_UPPER_OUTER.setVisibility(View.GONE);
				String position2="LEFT_BUTTOCK_UPPER_OUTER";
				Intent intent2 = new Intent(Choose_position.this, Popup.class);
				intent2.putExtra("position", position2);
				startActivity(intent2);
			}
		});		
		btRIGHT_BUTTOCK_UPPER_OUTER.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btRIGHT_BUTTOCK_UPPER_OUTER.setVisibility(View.GONE);
				String position3="RIGHT_BUTTOCK_UPPER_OUTER";
				Intent intent3 = new Intent(Choose_position.this, Popup.class);
				intent3.putExtra("position", position3);
				startActivity(intent3);
			}
		});	
		btLEFT_ARM_UPPER_OUTER.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btLEFT_ARM_UPPER_OUTER.setVisibility(View.INVISIBLE);
				String position4="LEFT_ARM_UPPER_OUTER";
				Intent intent4 = new Intent(Choose_position.this, Popup.class);
				intent4.putExtra("position", position4);
				startActivity(intent4);
			}
		});	
		btRIGHT_ARM_UPPER_OUTER.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btRIGHT_ARM_UPPER_OUTER.setVisibility(View.GONE);
				String position5="RIGHT_ARM_UPPER_OUTER";
				Intent intent5 = new Intent(Choose_position.this, Popup.class);
				intent5.putExtra("position", position5);
				startActivity(intent5);
			}
		});	
	}
	

}
