package com.example.examproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    Button calc,image,gif,form;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        calc = findViewById(R.id.btnCalc);
        image = findViewById(R.id.btnImage);
        gif = findViewById(R.id.btnGif);
        form = findViewById(R.id.btnForm);
        text = findViewById(R.id.tv);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        text.setText(bundle.getString("user"));


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,CalcActivity.class);
                startActivity(intent);
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,ImageActivity.class);
                startActivity(intent);
            }
        });

        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,GifActivity.class);
                startActivity(intent);
            }
        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this,FormActivity.class);
                startActivity(intent);
            }
        });
    }
}
