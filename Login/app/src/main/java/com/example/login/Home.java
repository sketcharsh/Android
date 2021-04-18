package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    TextView labelView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        labelView = findViewById(R.id.welcome);
//        String usrName = this.getIntent().getStringExtra("usr");
        Intent intent = this.getIntent();
        Bundle b = intent.getExtras();
        labelView.setText("WELCOME " + b.getString("usr"));

    }
}
