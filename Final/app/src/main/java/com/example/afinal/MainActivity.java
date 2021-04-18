package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btnSave,start,stop;
    ImageView iv;
    AnimationDrawable ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnSave = findViewById(R.id.btnSave);
        start = findViewById(R.id.start);
        stop = findViewById(R.id.stop);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle b = new Bundle();
                b.putString("un",username.getText().toString());
                b.putString("pw",password.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });

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
}
