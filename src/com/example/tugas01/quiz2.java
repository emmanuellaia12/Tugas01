package com.example.tugas01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class quiz2 extends Activity{
	
	EditText eangka21;
	EditText eangka22;
	EditText eangka23;
	Button bbanding2;
	TextView thasilbanding2;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_quiz2);
        
        eangka21 = (EditText)findViewById(R.id.etquiz21);
        eangka22 = (EditText)findViewById(R.id.etquiz22);
        eangka23 = (EditText)findViewById(R.id.etquiz23);
        bbanding2 = (Button)findViewById(R.id.btnbanding2);
        thasilbanding2 = (TextView)findViewById(R.id.tvhasilbanding2);
        
        bbanding2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(eangka21.getText().toString());
				int b = Integer.parseInt(eangka22.getText().toString());
				int c = Integer.parseInt(eangka23.getText().toString());
				
				if (a>b && a>c && b>c)
				{ thasilbanding2.setText("Nilai A = "+a+" Nilai Yang Paling Besar\nNilai C = "+c+" Nilai Yang Paling Kecil");}
				else if (a>b && a>c && c>b)
				{ thasilbanding2.setText("Nilai A = "+a+"Nilai Yang Paling Besar\nNilai B = "+b+" Nilai Yang Paling Kecil");}
				else if (b>a && b>c && a>c)
				{ thasilbanding2.setText("Nilai B = "+b+" Nilai Yang Paling Besar\nNilai C = " +c+" Nilai Yang Paling Kecil");}
				else if (b>a && b>c && c>a)
				{ thasilbanding2.setText("Nilai B = "+b+" Nilai Yang Paling Besar\nNilai A = "+a+" Nilai Yang Paling Kecil");}
				else if (c>a && c>b && a>b)
				{ thasilbanding2.setText("Nilai C = "+c+" Nilai Yang Paling Besar\nNilai B = "+b+" Nilai Yang Paling Kecil");}
				else if (c>a && c>b && b>a)
				{ thasilbanding2.setText("Nilai C = "+c+" Nilai Yang Paling Besar\nNilai A = "+a+" Nilai Yang Paling Kecil");}
				else if (a>b && a>c && b==c)
				{ thasilbanding2.setText("Nilai A = "+a+" Nilai Yang Paling Besar\nNilai B = "+b+" dan Nilai C = "+c+" Sama Kecilnya");}
				else if (b>a && b>c && a==c)
				{ thasilbanding2.setText("Nilai B = "+b+" Nilai Yang Paling Besar\nNilai A = "+a+" dan Nilai C = "+c+" Sama Kecilnya");}
				else if (c>a && c>b && a==b)
				{ thasilbanding2.setText("Nilai C = "+c+" Nilai Yang Paling Besar\nNilai A = "+a+" dan Nilai B = "+b+" Sama Kecilnya");}
				else if (a>c && b>c && a==b)
				{ thasilbanding2.setText("Nilai A = "+a+" dan Nilai B = "+b+" Sama Besar \nDan Nilai C = "+c+" Adalah Nilai Yang Paling Kecil");}
				else if (b>a && c>a && b==c)
				{ thasilbanding2.setText("Nilai B = "+b+" dan Nilai C = "+c+" Sama Besar \nDan Nilai A = "+a+" Adalah Nilai Yang Paling Kecil");}
				else if (c>b && a>b && c==a)
				{ thasilbanding2.setText("Nilai C = "+c+" dan Nilai A = "+a+" Sama Besar \nDan Nilai C = "+b+" Adalah Nilai Paling Kecilnya");}
				else
				{ thasilbanding2.setText("Nilai A = "+a+"\nNilai B = "+b+"\nNilai C = "+c+"\nHasilnya Nilai A,B dan C Sama");}
			}
		});

}}
