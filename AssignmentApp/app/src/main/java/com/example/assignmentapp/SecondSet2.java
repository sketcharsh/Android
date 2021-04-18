package com.example.assignmentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class SecondSet2 extends AppCompatActivity {

    EditText num;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_set2);

        num = findViewById(R.id.num1);
        display = findViewById(R.id.display);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.set2menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        float n1 = Float.parseFloat(num.getText().toString());
        float dollar = (float) (n1*70);
        float yen = (float) (n1*1.58);
        float kuwait = (float) (n1*0.0044);

        switch (id){
            case R.id.m1:
                display.setText(n1 + " Rupee to Dollar " + dollar);
                break;

            case R.id.m2:
                display.setText(n1 + " Rupee to Yen " + yen+"");
                break;

            case R.id.m3:
                display.setText(n1 + " Rupee to Kuwait " + kuwait+"");
                break;
        }

        return true;
    }
}
