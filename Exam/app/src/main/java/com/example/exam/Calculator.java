package com.example.exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {
EditText num1,num2;
TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        num1 =(EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView)findViewById(R.id.result);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.calc,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    int id = item.getItemId();
    int n1 = Integer.parseInt(num1.getText().toString());
    int n2 = Integer.parseInt(num2.getText().toString());
    int ans;
        switch (id)
        {
            case(R.id.add):
                ans = n1 + n2;
                result.setText(ans+"");
                return true;
            case(R.id.sub):
                ans = n1 - n2;
                result.setText(ans+"");
                return true;
            case(R.id.mul):
                ans = n1 * n2;
                result.setText(ans+"");
                return true;
            case(R.id.div):
                ans = n1 / n2;
                result.setText(ans+"");
                return true;
        }
        return true;
    }
}
