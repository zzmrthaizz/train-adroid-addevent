package com.example.trainning_android_sukien;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Inlinelistenerctivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inlinelistenerctivity);
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				String can = "";
				String chi = "";
				EditText namduong = (EditText) findViewById(R.id.namduong);
				int a = Integer.parseInt(namduong.getText()+"");
				TextView checka = (TextView) findViewById(R.id.checka);
				checka.setText(a%10+""+a%12);
				
				switch(a%10)
				{
					case 0:			can = "Canh";
					break;
					case 1:			can = "Tan";
					break;
					case 2:			can = "Nham";	
					break;
					case 3:			can = "Quy";
					break;
					case 4:			can = "Giap";
					break;
					case 5:			can = "At";
					break;
					case 6:			can = "Binh";
					break;
					case 7:			can = "Dinh";
					break;
					case 8:			can = "Dau";
					break;
					case 9:			can = "Ky";
					break;
				}	
				switch(a%12)
				{
					case 0:			chi = "Than";
					break;
					case 1:			chi = "Dau";
					break;
					case 2:			chi = "Tuat";
					break;
					case 3:			chi = "Hoi";
					break;
					case 4:			chi = "Ty";
					break;
					case 5:			chi = "Suu";
					break;
					case 6:			chi = "Dan";
					break;
					case 7:			chi = "Meo";
					break;
					case 8:			chi = "Thin";
					break;
					case 9:			chi = "Ti";
					break;
					case 10:		chi = "Ngo";
					break;
					case 11:		chi = "Mui";
					break;
				}	
				TextView namam = (TextView) findViewById(R.id.namam);
				namam.setText(can+" "+chi);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inlinelistenerctivity, menu);
		return true;
	}

}
