package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondSet8 extends AppCompatActivity {

    TextView name,display;
    EditText num;
    Button salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set8);

        name = findViewById(R.id.ename);
        num = findViewById(R.id.eSalary);
        salary = findViewById(R.id.salary);
        display = findViewById(R.id.displaySal);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        name.setText(bundle.getString("fn") + " " + bundle.getString("ln"));

        salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(num.getText().toString());
                int HRA = (n*35)/100;
                int DA = (n*80)/100;
                int total = n+14000+HRA+DA+10000+15000;
                display.setText("Total Salary is : " + total);
            }
        });
    }
}
