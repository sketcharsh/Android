package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class Set6 extends AppCompatActivity {

    ImageView gif;
    AnimationDrawable ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set6);

        gif = findViewById(R.id.image1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.set6menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.img1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.img2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.img3);

        ad =new AnimationDrawable();
        ad.addFrame(frame1,500);
        ad.addFrame(frame2,500);
        ad.addFrame(frame3,500);

        gif.setImageDrawable(ad);

        switch (id){
            case R.id.gif1:
                ad.start();
                ad.setOneShot(false);
                return true;

            case R.id.gif2:
                ad.stop();
                return true;
        }
        return true;
    }
}
