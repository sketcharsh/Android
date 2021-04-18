package com.example.sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
SeekBar sb;
EditText txt;
Button saveBtn;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = findViewById(R.id.seekBar);
        txt = findViewById(R.id.txtView);
        saveBtn = findViewById(R.id.saveBtn);

        sharedPreferences = getSharedPreferences("prefName",MODE_PRIVATE);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences("prefName",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putFloat("fontSize",txt.getTextSize());
                editor.putString("txtValue",txt.getText().toString());

                editor.commit();
            }
        });
        float fontSize = sharedPreferences.getFloat("fontSize",12);

        sb.setProgress((int)fontSize);
        txt.setText(sharedPreferences.getString("txtValue"," "));
        txt.setTextSize(sb.getProgress());

   sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
       @Override
       public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            txt.setTextSize(i);
       }

       @Override
       public void onStartTrackingTouch(SeekBar seekBar) {

       }

       @Override
       public void onStopTrackingTouch(SeekBar seekBar) {

       }
   });
    }
}
