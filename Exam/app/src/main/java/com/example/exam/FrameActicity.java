package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FrameActicity extends AppCompatActivity {
Button b1,b2;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_acticity);
        b1 = (Button) findViewById(R.id.btnStart);
        b2 = (Button) findViewById(R.id.btnStop);
        iv  = (ImageView) findViewById(R.id.iv);

        BitmapDrawable frame1 = (BitmapDrawable) getResources().getDrawable(R.drawable.image1);
        BitmapDrawable  frame2 = (BitmapDrawable) getResources().getDrawable(R.drawable.image2);
        BitmapDrawable frame3 = (BitmapDrawable) getResources().getDrawable(R.drawable.image3);
        BitmapDrawable frame4 = (BitmapDrawable) getResources().getDrawable(R.drawable.image4);
        BitmapDrawable frame5 = (BitmapDrawable) getResources().getDrawable(R.drawable.image5);

        final AnimationDrawable ad = new AnimationDrawable();
        ad.addFrame(frame1,200);
        ad.addFrame(frame2,200);
        ad.addFrame(frame3,200);
        ad.addFrame(frame4,200);
        ad.addFrame(frame5,200);

        iv.setImageDrawable(ad);

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
