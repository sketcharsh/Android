package com.example.afinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
TextView un,pw;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        un = findViewById(R.id.unText);
        pw = findViewById(R.id.pwText);
        img = findViewById(R.id.img1);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        un.setText(bundle.getString("un"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.item1:
                Context context;
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                img.startAnimation(alpha);
                Toast.makeText(SecondActivity.this,"Alpha",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                img.startAnimation(rotate);
                Toast.makeText(SecondActivity.this,"Rotate",Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                img.startAnimation(scale);
                Toast.makeText(SecondActivity.this,"Scale",Toast.LENGTH_LONG).show();
                break;
            case R.id.item4:
                Animation transform = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.transform);
                img.startAnimation(transform);
                Toast.makeText(SecondActivity.this,"Transform",Toast.LENGTH_LONG).show();
                break;
        }
        return true;
    }
}
