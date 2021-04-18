package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSet7 extends AppCompatActivity {

    TextView display;
    EditText num1,num2,num3,num4;
    Button btn1,btn2,btn3,btn4;
    ArrayList<Integer> arrList;
    int n1,n2,n3,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set7);

        display = findViewById(R.id.result);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        btn1 = findViewById(R.id.max);
        btn2 = findViewById(R.id.min);
        btn3 = findViewById(R.id.sort);
        btn4 = findViewById(R.id.sum);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                n3 = Integer.parseInt(num3.getText().toString());
                n4 = Integer.parseInt(num4.getText().toString());
                arrList = new ArrayList();
                arrList.add(n1);
                arrList.add(n2);
                arrList.add(n3);
                arrList.add(n4);
                int max = Collections.max(arrList);
                display.setText("Max number is : " + max);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                n3 = Integer.parseInt(num3.getText().toString());
                n4 = Integer.parseInt(num4.getText().toString());
                arrList = new ArrayList();
                arrList.add(n1);
                arrList.add(n2);
                arrList.add(n3);
                arrList.add(n4);
                int min = Collections.min(arrList);
                display.setText("Min number is : " + min);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                n3 = Integer.parseInt(num3.getText().toString());
                n4 = Integer.parseInt(num4.getText().toString());
                arrList = new ArrayList();
                arrList.add(n1);
                arrList.add(n2);
                arrList.add(n3);
                arrList.add(n4);
                Collections.sort(arrList);
                for (int i=0;i<arrList.size();i++){
                    display.setText("Sorting : " + arrList);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                n3 = Integer.parseInt(num3.getText().toString());
                n4 = Integer.parseInt(num4.getText().toString());
                int sum = n1+n2+n3+n4;
                display.setText("Sum is : " + sum+"");
            }
        });
    }
}
