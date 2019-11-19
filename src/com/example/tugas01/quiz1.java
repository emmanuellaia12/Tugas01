package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quiz1 extends Activity{
	
	EditText eangka1;
	EditText eangka2;
	Button bbanding1;
	TextView thasilbanding;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz1);
	
        eangka1 = (EditText)findViewById(R.id.etquiz11);
        eangka2 = (EditText)findViewById(R.id.etquiz12);
        bbanding1 = (Button)findViewById(R.id.btnbanding);
        thasilbanding = (TextView)findViewById(R.id.tvhasilbanding);
        
        bbanding1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(eangka1.getText().toString());
				int b = Integer.parseInt(eangka2.getText().toString());
				
				if(a>b)
				{thasilbanding.setText("Nilai A = "+a+" lebih besar dari Nilai B = "+b);}
				else if (b>a)
				{thasilbanding.setText("Nilai B = "+b+" lebih besar dari Nilai A = "+a);}
				else
				{thasilbanding.setText(" Nilai A = "+a+"\nNilai B = "+b+"\nNilai A dan B sama ");}
			}
		});
        
	}}
