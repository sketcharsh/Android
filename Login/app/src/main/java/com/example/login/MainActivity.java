package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usrname,pwd;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname = findViewById(R.id.usrname);
        pwd = findViewById(R.id.pwd);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usrname.getText().toString().equals("admin") && pwd.getText().toString().equals("admin"))
                {
                    System.out.println("Success");
                    Intent intent = new Intent(MainActivity.this,Home.class);
//                  intent.putExtra("usr",usrname.getText().toString());
                    Bundle b = new Bundle();
                    b.putString("usr",usrname.getText().toString());
                    b.putString("pwd",pwd.getText().toString());
                    intent.putExtras(b);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Try again",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
