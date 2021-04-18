package com.example.set4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SecondActivity extends AppCompatActivity {
    TextView fn,ln,display;
    EditText pa,duration,rate;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fn = (TextView) findViewById(R.id.fn);
        ln = (TextView) findViewById(R.id.ln);
        display = (TextView) findViewById(R.id.display);
        pa = (EditText) findViewById(R.id.pa);
        duration = (EditText) findViewById(R.id.duration);
        rate = (EditText) findViewById(R.id.rate);
        b1 = (Button) findViewById(R.id.btn1);

        Bundle b = getIntent().getExtras();
        fn.setText(b.getString("fn"));
        ln.setText(b.getString("ln"));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double priAmount = Integer.parseInt(pa.getText().toString());
                double rateOfInterest= Integer.parseInt(rate.getText().toString());
                double dur = Integer.parseInt(duration.getText().toString());

                double EMI = (priAmount*rateOfInterest*Math. pow(1+rateOfInterest,dur))/(Math. pow(1+rateOfInterest,dur)-1);
                display.setText(EMI + "");
            }
        });
    }
}