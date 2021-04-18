package com.example.theend;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
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
        tabHost.addTab(tabHost.newTabSpec("Register").setContent(new Intent(this,Register.class)).setIndicator("Register"));
        tabHost.addTab((tabHost.newTabSpec("Login")).setContent(new Intent(this,Login.class)).setIndicator("Login"));

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String s) {
                if(s.equals("Register")){
                    tabHost.setBackgroundColor(Color.RED);
                }
                else {
                    tabHost.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
