package com.teddycathy.msinjection4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Popup extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pop_up);
		Button done;
		done=(Button)findViewById(R.id.bt_injectiondone);
	    Intent i= getIntent();
	    String position = i.getStringExtra("position");
	    
	    TextView pos;
	    pos=(TextView)findViewById(R.id.tv_position);
	    pos.setText(position);
	    
	    done.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Popup.this,Report_Issues.class);
				startActivity(intent);
			}
		});
	    
	   
	}
	

}
