package com.example.assignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Set8 extends AppCompatActivity {

    EditText fn,ln,eid;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set8);

        fn = findViewById(R.id.efn);
        ln = findViewById(R.id.eln);
        eid = findViewById(R.id.eid);
        submit = findViewById(R.id.register);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Set8.this,SecondSet8.class);
                Bundle bundle = new Bundle();
                bundle.putString("fn",fn.getText().toString());
                bundle.putString("ln",ln.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
