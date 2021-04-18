package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class Logic extends AppCompatActivity {
EditText num1,num2,num3,num4;
Button display;
TextView label;
ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logic);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);
        num4 = (EditText) findViewById(R.id.num4);
        label = (TextView) findViewById(R.id.label);
        display = (Button) findViewById(R.id.display);


        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int n3 = Integer.parseInt(num3.getText().toString());
                int n4 = Integer.parseInt(num4.getText().toString());

                final ArrayList arrayList = new ArrayList();
                arrayList.add(n1);
                arrayList.add(n2);
                arrayList.add(n3);
                arrayList.add(n4);

                ArrayList odd = new ArrayList();
//                int min = (int) Collections.min(arrayList);
                for(int i=1;i<arrayList.size();i++)
                {
                    if(i%2==1)
                    {
                        odd.add(i);
                    }
                }
//                Collections.sort(arrayList,Collections.reverseOrder());
                label.setText(odd.toString());

            }
        });
    }
}
