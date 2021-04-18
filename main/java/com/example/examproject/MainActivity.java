package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usr,pwd;
    Button login;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usr = findViewById(R.id.usr);
        pwd = findViewById(R.id.pwd);
        login = findViewById(R.id.btn);
        error = findViewById(R.id.error);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(usr.getText().toString().equals("Admin") && pwd.getText().toString().equals("admin")){
                    String name = usr.getText().toString();
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("user",usr.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                else{
                    error.setText("Enter valid UserName & Password");
                }
            }
        });
    }
}
