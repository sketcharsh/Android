package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondSet4 extends AppCompatActivity {

    TextView name,display;
    EditText txt1,txt2,txt3;
    Button calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set4);

        name = findViewById(R.id.name);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        calc = findViewById(R.id.calc);
        display = findViewById(R.id.display);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        name.setText(bundle.getString("fn") + " " + bundle.getString("ln"));

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float p = Integer.parseInt(txt1.getText().toString());
                float r = Integer.parseInt(txt2.getText().toString());
                float t = Integer.parseInt(txt3.getText().toString());

                r = r / (12 * 100); // one month interest
                t = t * 12; // one month period
                float emi = (p * r * (float)Math.pow(1 + r, t))
                        / (float)(Math.pow(1 + r, t) - 1);

                display.setText("Monthly EMI is = " + emi);
            }
        });
    }
}
