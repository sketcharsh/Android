package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class GifActivity extends AppCompatActivity {

    ImageView gif;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gif);

        gif = findViewById(R.id.gif);
        b1 = findViewById(R.id.btnStart);
        b2 = findViewById(R.id.btnStop);



        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.pgif1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.pgif2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.pgif3);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.pgif4);

        final AnimationDrawable ad = new AnimationDrawable();
        ad.addFrame(frame1,500);
        ad.addFrame(frame2,500);
        ad.addFrame(frame3,500);
        ad.addFrame(frame4,500);

        gif.setImageDrawable(ad);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.start();
                ad.setOneShot(false);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ad.stop();
            }
        });

    }
}
