package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class SetupEmail extends Activity{
	DatabaseHelper myDb;
	EditText editname;
	Button confirm;
	ImageButton next,back;
	String str;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		myDb = new DatabaseHelper(this);
		setContentView(R.layout.activity_setup_email);
		next = (ImageButton)findViewById(R.id.btNextemail);
		editname = (EditText)findViewById(R.id.etEmail);
		confirm = (Button)findViewById(R.id.btConfirmemail);
		back = (ImageButton)findViewById(R.id.btBack_in_email);
		back.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				Intent intent = new Intent (SetupEmail.this, Choose_medication.class);
				startActivity(intent);
			
			}});
		
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//	String data=editname.getText().toString();
				// TODO Auto-generated method stub
				if(!editname.getText().toString().equals("")){
					 Intent intent = new Intent(SetupEmail.this, Choose_medication.class);
	                 startActivity(intent);  
					}else{
						Toast.makeText(SetupEmail.this,"Please enter name", Toast.LENGTH_LONG).show();
					}
				
			
			}
		});
		
		confirm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				str=editname.getText().toString();
				if(str.contains("@")){
					boolean isInserted = myDb.insertData2(editname.getText().toString());
					if(isInserted = true){
						Toast.makeText(SetupEmail.this,"Data is Inserted", Toast.LENGTH_LONG).show();}
					else{
						Toast.makeText(SetupEmail.this,"Data is not Inserted", Toast.LENGTH_LONG).show();}
					
				}else{
					Toast.makeText(SetupEmail.this,"Email Invalid please try again", Toast.LENGTH_LONG).show();
				}
				
				
				
			}
		});
		
	}

}
