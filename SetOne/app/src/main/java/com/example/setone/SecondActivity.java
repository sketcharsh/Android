package com.example.setone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
TextView fn,ln,sgpa1,sgpa2,cgpa,percent;
EditText grade1,credit1,grade2,credit2;
Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        fn = (TextView) findViewById(R.id.fn);
        ln = (TextView) findViewById(R.id.ln);
        sgpa1 = (TextView) findViewById(R.id.sgpa1);
        sgpa2 = (TextView) findViewById(R.id.sgpa2);
        cgpa = (TextView) findViewById(R.id.cgpa);
        percent = (TextView) findViewById(R.id.percent);
        grade1 = (EditText) findViewById(R.id.gr1);
        grade2 = (EditText) findViewById(R.id.gr2);
        credit1 = (EditText) findViewById(R.id.cr1);
        credit2 = (EditText) findViewById(R.id.cr2);
        btn1 = (Button) findViewById(R.id.btn1);

        Bundle b = getIntent().getExtras();
        fn.setText(b.getString("fn"));
        ln.setText(b.getString("ln"));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int g1 = Integer.parseInt(grade1.getText().toString());
                int g2 = Integer.parseInt(grade2.getText().toString());
                int c1 = Integer.parseInt(credit1.getText().toString());
                int c2 = Integer.parseInt(credit2.getText().toString());

                int sem1 = c1/g1;
                sgpa1.setText(sem1+"");
                int sem2 = c2/g2;
                sgpa2.setText(sem2+"");
                int disCGPA = sem1 + sem2 / 2;
                cgpa.setText(disCGPA+"");
                percent.setText((disCGPA*10)+"");
            }
        });
    }
}
