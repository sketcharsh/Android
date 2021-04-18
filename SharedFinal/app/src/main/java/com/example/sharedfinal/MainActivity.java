package com.example.sharedfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
RatingBar rb;
Button save;
TextView res;

SharedPreferences prefs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb = findViewById(R.id.ratingBar);
        save = findViewById(R.id.btnSave);
        res = findViewById(R.id.res);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                prefs = getSharedPreferences("MyShared",MODE_PRIVATE);
                SharedPreferences.Editor editor = prefs.edit();

                editor.putFloat("rating",rb.getNumStars());

                editor.commit();
            }
        });

        prefs = getSharedPreferences("MyShared",MODE_PRIVATE);

        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                res.setText(v + "");
            }
        });
    }
}
