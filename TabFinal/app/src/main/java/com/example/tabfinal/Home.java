package com.example.tabfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
TextView un,pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        un = findViewById(R.id.un);
        pw = findViewById(R.id.pw);

        SharedPreferences prefs = getSharedPreferences("sp",MODE_PRIVATE);

        un.setText(prefs.getString("un",""));
        pw.setText(prefs.getString("pw",""));
    }
    public void onResume(){
        super.onResume();
            un = findViewById(R.id.un);
            pw = findViewById(R.id.pw);

            SharedPreferences prefs = getSharedPreferences("sp",MODE_PRIVATE);

            un.setText(prefs.getString("un",""));
            pw.setText(prefs.getString("pw",""));
    }
}
