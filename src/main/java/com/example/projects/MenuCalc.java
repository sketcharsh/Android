package com.example.projects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MenuCalc extends AppCompatActivity {

    EditText num1,num2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_calc);

        num1=findViewById(R.id.txt1);
        num2=findViewById(R.id.txt2);
        result=findViewById(R.id.display);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int ans;

        switch (id){
            case R.id.add:
                ans = n1+n2;
                result.setText(ans+"");
                return true;

            case R.id.sub:
                ans = n1-n2;
                result.setText(ans+"");
                return true;

            case R.id.multi:
                ans = n1*n2;
                result.setText(ans+"");
                return true;

            case R.id.divi:
                ans = n1/n2;
                result.setText(ans+"");
                return true;
        }
        return true;
    }
}
