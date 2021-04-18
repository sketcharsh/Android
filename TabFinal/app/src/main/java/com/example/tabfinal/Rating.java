package com.example.tabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class Rating extends AppCompatActivity {
RatingBar ratingBar;
SeekBar sb;
Button saveBtn;
TextView TexttRB,TextSB;
String rbValue;
String sbValue;
Float rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        TexttRB = findViewById(R.id.RBText);
        saveBtn = findViewById(R.id.btnSave);
        ratingBar = findViewById(R.id.ratingBar);
        sb = findViewById(R.id.seekBar);
        TextSB = findViewById(R.id.SBText);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                sbValue =String.valueOf(i);
                TextSB.setText(sbValue);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                rbValue = String.valueOf(v);
                TexttRB.setText(rbValue);
            }
        });
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("rb",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putString("rbValue",rbValue);
                editor.putString("sbValue",sbValue);
//                editor.putFloat("rate",ratingBar.getRating());
                editor.apply();
            }
        });
    }
    public void onResume(){
        super.onResume();

        SharedPreferences prefs = getSharedPreferences("rb",MODE_PRIVATE);
        TexttRB.setText(prefs.getString("rbValue",""));
        TextSB.setText(prefs.getString("sbValue",""));
//        ratingBar.setRating(prefs.getFloat("rate",0f));
    }
}
