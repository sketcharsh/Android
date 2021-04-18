package com.example.set4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText fn,ln,sid;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn = (EditText) findViewById(R.id.fn);
        ln = (EditText) findViewById(R.id.ln);
        sid = (EditText) findViewById(R.id.sid);
        b1 = (Button) findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("fn",fn.getText().toString());
                b.putString("ln",ln.getText().toString());
                b.putString("sid",sid.getText().toString());
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}

