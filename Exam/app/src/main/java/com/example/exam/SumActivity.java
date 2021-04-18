package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SumActivity extends AppCompatActivity {
EditText num;
TextView result;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum);

        num = (EditText) findViewById(R.id.num);
        result = (TextView) findViewById(R.id.result);
        b1 = (Button) findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum=0,x;
                int number = Integer.parseInt(num.getText().toString());
                while (number>0)
                {
                    x = number%10;
                    sum = sum+ x;
                    number = number / 10;
                }
                result.setText(sum+"");
            }
        });
    }
}
