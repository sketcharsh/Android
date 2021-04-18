package com.example.set3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText usrname,pswd;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usrname = (EditText) findViewById(R.id.usrname);
        pswd = (EditText) findViewById(R.id.pswd);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usrname.getText().toString().equals("admin") && pswd.getText().toString().equals("admin"))
                {
                    String action;
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"FAIL",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
