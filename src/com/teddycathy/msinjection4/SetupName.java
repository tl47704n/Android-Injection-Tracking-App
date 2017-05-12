package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class SetupName extends Activity {
	DatabaseHelper myDb;
	EditText editname;
	Button confirm;
	ImageButton next;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_setup_name);
		myDb = new DatabaseHelper(this);
		next = (ImageButton)findViewById(R.id.btNext);
		confirm = (Button)findViewById(R.id.btConfirm);
		editname = (EditText)findViewById(R.id.etNames);
		next.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(!editname.getText().toString().equals("")){
				 Intent intent = new Intent(SetupName.this, SetupEmail.class);
                 startActivity(intent);  
				}else{
					Toast.makeText(SetupName.this,"Please enter name", Toast.LENGTH_LONG).show();
				}
			}
		});
		
		confirm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(!editname.getText().toString().equals("")){
					 Intent intent = new Intent(SetupName.this, SetupEmail.class);
	                 startActivity(intent);  
					}else{
						Toast.makeText(SetupName.this,"Please enter name", Toast.LENGTH_LONG).show();
					}
				
			}
		});
		
	}

}
