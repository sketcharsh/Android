package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText no1,no2;
    Button addBtn,subBtn,mulBtn,divBtn;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.num1);
        no2 = findViewById(R.id.num2);
        addBtn = findViewById(R.id.btn1);
        subBtn = findViewById(R.id.btn2);
        mulBtn = findViewById(R.id.btn3);
        divBtn = findViewById(R.id.btn4);
        display = findViewById(R.id.result);

        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);
        mulBtn.setOnClickListener(this);
        divBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
            int nm1,nm2;
            switch (view.getId())
            {
                case R.id.btn1:
                    nm1 = Integer.parseInt(no1.getText().toString());
                    nm2 = Integer.parseInt(no2.getText().toString());
                    display.setText(nm1 + nm2 + "");
                    break;

                case R.id.btn2:
                    nm1 = Integer.parseInt(no1.getText().toString());
                    nm2 = Integer.parseInt(no2.getText().toString());
                    display.setText(nm1 - nm2 + "");
                    break;

                case R.id.btn3:
                    nm1 = Integer.parseInt(no1.getText().toString());
                    nm2 = Integer.parseInt(no2.getText().toString());
                    display.setText(nm1 * nm2 + "");
                    break;

                case R.id.btn4:
                    nm1 = Integer.parseInt(no1.getText().toString());
                    nm2 = Integer.parseInt(no2.getText().toString());
                    display.setText(nm1 / nm2 + "");
                    break;
            }
        }
        catch(Exception e){
            e.getMessage();
        }
    }
}
