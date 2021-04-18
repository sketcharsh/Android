package com.example.examproject;

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

public class FormActivity extends AppCompatActivity {

    EditText fn,ln;
    RadioGroup rg;
    RadioButton rb;
    Spinner spinner;
    CheckBox cb1,cb2,cb3;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        rg = findViewById(R.id.rg);
        spinner = findViewById(R.id.spinner);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = fn.getText().toString();
                String last = ln.getText().toString();
                int id = rg.getCheckedRadioButtonId();
                rb = findViewById(id);
                String gender = rb.getText().toString();
                String city = spinner.getSelectedItem().toString();
                String hobby = "";
                if(cb1.isChecked()){
                    hobby = cb1.getText().toString();
                }
                else if(cb2.isChecked()){
                    hobby = cb2.getText().toString();
                }
                else if(cb3.isChecked()){
                    hobby = cb3.getText().toString();
                }

                Bundle bundle = new Bundle();
                bundle.putString("keyFirst",first);
                bundle.putString("keyLast",last);
                bundle.putString("keyGender",gender);
                bundle.putString("keyCity",city);
                bundle.putString("keyHobby",hobby);

                Intent intent = new Intent(FormActivity.this,DisplayActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
