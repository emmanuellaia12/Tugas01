package com.example.tugas01;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView lvmenu;
	String[] menu = {"Profil", "Quiz", "Keluar"};
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	
        lvmenu = (ListView)findViewById(R.id.lvm);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        lvmenu.setAdapter(adapter);
        lvmenu.setOnItemClickListener(listClick);
	}
	
	private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2 ,
				long arg3) {
			// TODO Auto-generated method stub
			if(arg2 == 0)
			{Intent intent = new Intent(MainActivity.this,profile.class);
			startActivity(intent);}
			else if(arg2 == 1)
			{Intent intent = new Intent(MainActivity.this,btnquiz.class);
			startActivity(intent);}
			else if(arg2 >= 2) 
			{System.exit(0);}}
		}
		
	;

}
