package com.example.tabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText un,pw;
Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        un = findViewById(R.id.username);
        pw = findViewById(R.id.password);
        save= findViewById(R.id.btnSave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    SharedPreferences prefs = getSharedPreferences("sp",MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();

                    editor.putString("un",un.getText().toString());
                    editor.putString("pw",pw.getText().toString());
                    editor.apply();
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
