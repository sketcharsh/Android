package com.example.exam;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t1 = (TextView) findViewById(R.id.hello);
        Intent intent = this.getIntent();
        Bundle b = intent.getExtras();
        t1.setText("Hello " + b.getString("usrname"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homemenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.Calculator:
                Intent intent = new Intent(HomeActivity.this,Calculator.class);
                startActivity(intent);
                return  true;
            case R.id.Signup:
                intent = new Intent(HomeActivity.this,Signup.class);
                startActivity(intent);
                return  true;
            case R.id.Image:
                intent = new Intent(HomeActivity.this,ImageActivity.class);
                startActivity(intent);
                return  true;
            case R.id.Frame:
                String action;
                intent = new Intent(HomeActivity.this,FrameActicity.class);
                startActivity(intent);
                return true;
        }
        return true;
    }
}
