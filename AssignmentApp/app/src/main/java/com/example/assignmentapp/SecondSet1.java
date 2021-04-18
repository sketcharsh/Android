package com.example.assignmentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class SecondSet1 extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4;
    TextView name,sgpa1,sgpa2,cgpa,per;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set1);

        name = findViewById(R.id.name);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        sgpa1 = findViewById(R.id.sgpa1);
        sgpa2 = findViewById(R.id.sgpa2);
        cgpa = findViewById(R.id.cgpa);
        per = findViewById(R.id.per);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        name.setText(bundle.getString("fn") + " " + bundle.getString("ln"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.set1menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        int n1 = Integer.parseInt(txt1.getText().toString());
        int n2 = Integer.parseInt(txt2.getText().toString());
        int n3 = Integer.parseInt(txt3.getText().toString());
        int n4 = Integer.parseInt(txt4.getText().toString());
        int ans1 = n1+n2;
        int ans2 = n3+n4;
        int ansCGPA = ans1+ans2/2;
        int ansPer = ansCGPA*10;

        switch (id){
            case R.id.sgpa:
                sgpa1.setText("SGPA of Sem1 : " + ans1 +".");
                sgpa2.setText("SGPA of Sem2 : " + ans2 +".");
                break;

            case R.id.cgpa:
                cgpa.setText("CGPA : " + ansCGPA +".");
                break;

            case R.id.per:
                per.setText("Percentage : " + ansPer +".");
                break;
        }

        return true;
    }
}
