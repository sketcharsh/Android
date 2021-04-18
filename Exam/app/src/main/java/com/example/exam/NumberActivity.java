package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class NumberActivity extends AppCompatActivity {

    EditText num1,num2,num3,num4;
    Button done;
    TextView result;
    ArrayList<Integer> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        result = findViewById(R.id.display);
        done = findViewById(R.id.btnDone);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(num1.getText().toString());
                int n2 = Integer.parseInt(num2.getText().toString());
                int n3 = Integer.parseInt(num3.getText().toString());
                int n4 = Integer.parseInt(num4.getText().toString());

                arrayList = new ArrayList();
                arrayList.add(n1);
                arrayList.add(n2);
                arrayList.add(n3);
                arrayList.add(n4);

//                -------------For ODD and EVEN------------

//                ArrayList<Integer> oddNum = new ArrayList<Integer>();
//                ArrayList<Integer> evenNum = new ArrayList<Integer>();
//
//                for(int i=0; i<arrayList.size();i++){
//                    if(arrayList.get(i)%2!=0){
//                        oddNum.add(arrayList.get(i));
//                    }
//                    else{
//                        evenNum.add(arrayList.get(i));
//                    }
//                }
//                result.setText("ODD: " + oddNum +" \n" + "EVEN: " + evenNum);

//                -------------For Max and Min (both in one) Value--------

//                int min = Collections.min(arrayList);
//                int max = Collections.max(arrayList);
//
//                result.setText(min + "\n" + max);

//                -------------For Max Value--------
//                result.setText(Collections.max(arrayList)+"");

//                -------------For Min Value--------
//                result.setText(Collections.min(arrayList)+"");

//                -------------For acending order-------
//                Collections.sort(arrayList);

//                -------------For descending order------
//                Collections.sort(arrayList, Collections.<Integer>reverseOrder());
//
//                for (int i = 0; i < arrayList.size(); i++)
//                {
//                    System.out.println(arrayList.get(i));
//                    result.setText(arrayList + "");
//                }
            }
        });
    }
}
