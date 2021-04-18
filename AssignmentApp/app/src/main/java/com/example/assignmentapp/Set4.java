package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Set4 extends AppCompatActivity {

    EditText fn,ln,sid;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set4);

        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        sid = findViewById(R.id.sid);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Set4.this,SecondSet4.class);
                Bundle bundle = new Bundle();
                bundle.putString("fn",fn.getText().toString());
                bundle.putString("ln",ln.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
