package com.example.animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView iv;
AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.iv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();

        BitmapDrawable b1 = (BitmapDrawable) getResources().getDrawable(R
        .drawable.img1);
        BitmapDrawable b2 =  (BitmapDrawable) getResources().getDrawable(R.drawable.img2);
        BitmapDrawable b3 =  (BitmapDrawable) getResources().getDrawable(R.drawable.img3);

        ad = new AnimationDrawable();
        ad.addFrame(b1,500);
        ad.addFrame(b2,500);
        ad.addFrame(b3,500);

        iv.setImageDrawable(ad);

        switch (id){
            case R.id.start:
                ad.start();
                ad.setOneShot(false);
                return true;
            case R.id.stop:
                ad.stop();
                return true;
        }
        return true;
    }
}
