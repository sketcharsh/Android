package com.example.tabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        final TabHost tabHost = getTabHost();
        tabHost.addTab(tabHost.newTabSpec("Register").setContent(new Intent(MainActivity.this,Register.class)).setIndicator("Register"));
        tabHost.addTab(tabHost.newTabSpec("Home").setContent(new Intent(MainActivity.this,Home.class)).setIndicator("Home"));
        tabHost.addTab(tabHost.newTabSpec("Rating").setContent(new Intent(this,Rating.class)).setIndicator("Rating"));
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                if(s.equals("Register")){
                    tabHost.setBackgroundColor(Color.RED);
                }
                else if(s.equals("Home")){
                    tabHost.setBackgroundColor(Color.BLUE);
                }
                else{
                    tabHost.setBackgroundColor(Color.WHITE);
                }
            }
        });
        tabHost.setCurrentTab(0);
    }
}
