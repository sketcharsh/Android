package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        t1 = findViewById(R.id.lbFN);
        t2 = findViewById(R.id.lbLN);
        t3 = findViewById(R.id.lbGender);
        t4 = findViewById(R.id.lbCity);
        t5 = findViewById(R.id.lbHobby);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        t1.setText(bundle.getString("keyFirst"));
        t2.setText(bundle.getString("keyLast"));
        t3.setText(bundle.getString("keyGender"));
        t4.setText(bundle.getString("keyCity"));
        t5.setText(bundle.getString("keyHobby"));
    }
}
