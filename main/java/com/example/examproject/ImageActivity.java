package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;

public class ImageActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        spinner = findViewById(R.id.spinner);
        img = findViewById(R.id.image);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                        img.startAnimation(alpha);
                        break;

                    case 1:
                        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                        img.startAnimation(scale);
                        break;

                    case 2:
                        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                        img.startAnimation(rotate);
                        break;

                    case 3:
                        Animation translate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                        img.startAnimation(translate);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
