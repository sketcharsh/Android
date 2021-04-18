package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
TextView fn,ln,gender,hobby,city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        fn = (TextView) findViewById(R.id.fn);
        ln = (TextView) findViewById(R.id.ln);
        gender = (TextView) findViewById(R.id.gender);
        hobby = (TextView) findViewById(R.id.hobby);
        city = (TextView) findViewById(R.id.city);

        Intent intent = this.getIntent();
        Bundle bundle = getIntent().getExtras();
        fn.setText(bundle.getString("fn"));
        ln.setText(bundle.getString("ln"));
        gender.setText(bundle.getString("gender"));
        hobby.setText(bundle.getString("hobby"));
        city.setText(bundle.getString("city"));
    }
}
