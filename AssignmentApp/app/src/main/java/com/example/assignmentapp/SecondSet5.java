package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondSet5 extends AppCompatActivity {

    EditText num;
    Button btn1,btn2,btn3,btn4;
    TextView display;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set5);

        num = findViewById(R.id.num);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        display = findViewById(R.id.display);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                n = Integer.parseInt(num.getText().toString());
                int f = 0;
                for(int i=2; i<n; i++)
                {
                    if (n % i == 0)
                        f = 1;
                }
                if(f==0){
                    display.setText(n + " is prime number.");
                }
                else{
                    display.setText(n + " is prime not number.");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = Integer.parseInt(num.getText().toString());
                if (n%2==1){
                    display.setText(n + " is odd number.");
                }
                else{
                    display.setText(n + " is even number.");
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer s = new StringBuffer(num.getText().toString());
                display.setText(s + " reverse is " + s.reverse());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=0,x;
                n = Integer.parseInt(num.getText().toString());
                while (n>0){
                    x = n%10;
                    sum = sum+x;
                    n = n/10;
                }
                display.setText(num.getText().toString() + " sum is " + sum);
            }
        });
    }
}
