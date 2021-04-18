package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class ImageActivity extends AppCompatActivity {
Spinner sp;
ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        iv = (ImageView) findViewById(R.id.iv);
        sp = (Spinner) findViewById(R.id.spinner);

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                        iv.startAnimation(alpha);
                        break;
                    case 1:
                        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                        iv.startAnimation(rotate);
                        break;
                    case 2:
                        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                        iv.startAnimation(scale);
                        break;
                    case 3:
                        Animation translate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                        iv.startAnimation(translate);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
