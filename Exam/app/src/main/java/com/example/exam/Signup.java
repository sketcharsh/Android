package com.example.exam;

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

public class Signup extends AppCompatActivity {
EditText fn,ln;
RadioGroup rg;
RadioButton rb;
Spinner spinner;
CheckBox cb1,cb2,cb3;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fn = (EditText) findViewById(R.id.fn);
        ln = (EditText) findViewById(R.id.ln);
        rg =(RadioGroup) findViewById(R.id.rg);
        spinner = (Spinner) findViewById(R.id.spinner);
        cb1 = (CheckBox) findViewById(R.id.cricket);
        cb2 = (CheckBox) findViewById(R.id.chess);
        cb3 = (CheckBox) findViewById(R.id.dance);
        login = (Button) findViewById(R.id.btn1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname = fn.getText().toString();
                String lastname = ln.getText().toString();
                int id = rg.getCheckedRadioButtonId();
                rb = findViewById(id);
                String gender = rb.getText().toString();
                String city = spinner.getSelectedItem().toString();
                String hobby="";
                if(cb1.isChecked())
                {
                    hobby = cb1.getText().toString();
                }
                else if(cb2.isChecked())
                {
                    hobby = cb2.getText().toString();
                }
                else if(cb3.isChecked())
                {
                    hobby = cb3.getText().toString();
                }
                Bundle bundle = new Bundle();
                bundle.putString("fn",firstname);
                bundle.putString("ln",firstname);
                bundle.putString("gender",gender);
                bundle.putString("city",city);
                bundle.putString("hobby",hobby);

                String action;
                Intent intent =new Intent(Signup.this,Display.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
