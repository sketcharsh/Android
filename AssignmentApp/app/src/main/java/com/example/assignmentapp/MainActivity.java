package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button set1,set2,set3,set4,set5,set6,set7,set8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        set1 = findViewById(R.id.btn1);
        set2 = findViewById(R.id.btn2);
        set3 = findViewById(R.id.btn3);
        set4 = findViewById(R.id.btn4);
        set5 = findViewById(R.id.btn5);
        set6 = findViewById(R.id.btn6);
        set7 = findViewById(R.id.btn7);
        set8 = findViewById(R.id.btn8);

        set1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Set1.class);
                startActivity(intent);
            }
        });

        set2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Set2.class);
                startActivity(intent);
            }
        });

        set3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Set3.class);
                startActivity(intent);
            }
        });

        set4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Set4.class);
                startActivity(intent);
            }
        });

        set5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Set5.class);
                startActivity(intent);
            }
        });

        set6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Set6.class);
                startActivity(intent);
            }
        });

        set7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Set7.class);
                startActivity(intent);
            }
        });

        set8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Set8.class);
                startActivity(intent);
            }
        });
    }
}
