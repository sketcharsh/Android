package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Set3 extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set3);

        img = findViewById(R.id.img1);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.set3menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.alpha:
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                img.startAnimation(alpha);
                break;
            case R.id.rotate:
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img.startAnimation(rotate);
                break;

            case R.id.scale:
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                img.startAnimation(scale);
                break;

            case R.id.transform:
                Animation transform = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.transform);
                img.startAnimation(transform);
                break;
        }
        return true;
    }
}
