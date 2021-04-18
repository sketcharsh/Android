package com.example.set3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
EditText c1;
Button b1,b2,b3;
TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        c1 = (EditText) findViewById(R.id.cur1);
        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        display = (TextView) findViewById(R.id.display);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currency1 = Integer.parseInt(c1.getText().toString());
                float rtod = currency1 / 70;
                display.setText(rtod + "Dollar");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currency1 = Integer.parseInt(c1.getText().toString());
                float rtod = (float) (currency1 * 1.58);
                display.setText(rtod + "Yen");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float currency1 = Integer.parseInt(c1.getText().toString());
                float rtod =currency1 / 230;
                display.setText(rtod + "Dinar");
            }
        });
    }
}
