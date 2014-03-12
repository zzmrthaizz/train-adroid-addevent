package com.example.trainning_android_sukien;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tinhtong_2 (View v)
    {
    	EditText numa = (EditText) findViewById(R.id.numa);
    	int a = Integer.parseInt(numa.getText()+"");
    	EditText numb = (EditText) findViewById(R.id.numb);
    	int b = Integer.parseInt(numb.getText()+"");
    	TextView textView4 = (TextView) findViewById(R.id.textView4);
    	textView4.setText((a+b)+"");
    }
    


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}