package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Set7 extends AppCompatActivity {

    EditText txt1,txt2;
    Button login;
    TextView e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set7);

        txt1 = findViewById(R.id.user);
        txt2 = findViewById(R.id.pass);
        login = findViewById(R.id.login);
        e1 = findViewById(R.id.e1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt1.getText().toString().equals("admin") && txt2.getText().toString().equals("admin")){
                    Intent intent = new Intent(Set7.this,SecondSet7.class);
                    startActivity(intent);
                }
                else{
                    e1.setText("UserName and Password is 'admin'");
                }
            }
        });
    }
}
