package com.teddycathy.msinjection4;

import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends Activity{
	DatabaseHelper myDb;
	EditText editname, editemail;
	Button adddata,viewall;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.settings);
		myDb = new DatabaseHelper(this);
		tv = (TextView)findViewById(R.id.tvdatabase);
		editname = (EditText)findViewById(R.id.etNames);
		editemail = (EditText)findViewById(R.id.etEmail);
		adddata = (Button)findViewById(R.id.btadddata);
		viewall = (Button)findViewById(R.id.btViewall);
		AddData();
		viewAll();

	}
	public void AddData(){
		adddata.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				boolean isInserted = myDb.insertData(editname.getText().toString());
				if(isInserted = true){
					Toast.makeText(Settings.this,"Data is Inserted", Toast.LENGTH_LONG).show();}
				else{
					Toast.makeText(Settings.this,"Data is not Inserted", Toast.LENGTH_LONG).show();}


			}
		});
	}
	public void viewAll(){
		viewall.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Cursor c = myDb.getAllData();
				if (c != null ) {
			        if  (c.moveToFirst()) {
			              do {
			              String dir = c.getString(c.getColumnIndex("NAME"));
			              tv.setText("" + dir);
			              }while (c.moveToNext());
			        }
			   }
		

			}
		});
		
	}

}
