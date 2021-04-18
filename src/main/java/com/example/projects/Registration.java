package com.example.projects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Registration extends AppCompatActivity {

    EditText fn,ln;
    RadioGroup rg;
    RadioButton rb;
    Spinner spinner;
    CheckBox cb1,cb2,cb3;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        rg = findViewById(R.id.radiogrp);
        spinner = findViewById(R.id.spinner);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fName = fn.getText().toString();
                String lName = ln.getText().toString();
                int id=rg.getCheckedRadioButtonId();
                rb = findViewById(id);
                String gen = rb.getText().toString();
                String city=spinner.getSelectedItem().toString();
                String hobbie = "";
                if(cb1.isChecked()){
                    hobbie = cb1.getText().toString();
                }
                else if(cb2.isChecked()){
                    hobbie = cb2.getText().toString();
                }
                else if(cb3.isChecked()) {
                    hobbie = cb3.getText().toString();
                }

                Bundle bundle = new Bundle();
                bundle.putString("setFN",fName);
                bundle.putString("setLN",lName);
                bundle.putString("setGen",gen);
                bundle.putString("setCity",city);
                bundle.putString("setHob", hobbie);

                Intent intent = new Intent(Registration.this,Display.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
