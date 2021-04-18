package com.example.finalanimation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView iv,img;
Button start,stop;
AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.imageView);
        start = findViewById(R.id.btnStart);
        stop = findViewById(R.id.btnStop);
        img = findViewById(R.id.img);

        BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.img1);
        BitmapDrawable frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.img2);
        BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.img3);

        ad = new AnimationDrawable();

        ad.addFrame(frame1,2000);
        ad.addFrame(frame2,2000);
        ad.addFrame(frame3,2000);

        iv.setImageDrawable(ad);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.start();
                ad.setOneShot(false);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.stop();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    int id = item.getItemId();
    switch (id){
        case R.id.alpha:
            Context context;
            Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
            img.startAnimation(alpha);
            break;
    }
    return true;
    }
}
