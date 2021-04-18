package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        t1 = findViewById(R.id.fn);
        t2 = findViewById(R.id.ln);
        t3 = findViewById(R.id.gender);
        t4 = findViewById(R.id.city);
        t5 = findViewById(R.id.hobby);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        t1.setText(bundle.getString("setFN"));
        t2.setText(bundle.getString("setLN"));
        t3.setText(bundle.getString("setGen"));
        t4.setText(bundle.getString("setCity"));
        t5.setText(bundle.getString("setHob"));
    }
}
