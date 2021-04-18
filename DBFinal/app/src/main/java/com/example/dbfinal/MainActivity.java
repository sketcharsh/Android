package com.example.dbfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fn,ln,pw;
RadioGroup rg;
RadioButton rb;
Button insert,update,show,delete,search;
Spinner sp;
SQLiteDatabase database;
String tablename = "Students";
String createTable,gender,country;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        pw = findViewById(R.id.pw);
        insert = findViewById(R.id.btnInsert);
        rg = findViewById(R.id.rg);
        sp = findViewById(R.id.country);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);
        show = findViewById(R.id.show);
        search = findViewById(R.id.search);

        database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        try {
            createTable = "CREATE TABLE IF NOT EXISTS " + tablename + "(id integer PRIMARY KEY AUTOINCREMENT,firstname text,lastname text,password text,gender text,country text)";
            database.execSQL(createTable);
            Toast.makeText(getApplicationContext(),"CREATED",Toast.LENGTH_LONG).show();
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
        }
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateData.class);
                startActivity(intent);
            }
        });
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ShowData.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Search.class));
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Delete.class);
                startActivity(intent);
            }
        });
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int id = rg.getCheckedRadioButtonId();
                    rb = findViewById(id);
                    gender = rb.getText().toString();
                    country = sp.getSelectedItem().toString();
                    InsertData(fn.getText().toString(),ln.getText().toString(),pw.getText().toString(),gender,country);
                    Toast.makeText(getApplicationContext(),"INSERTED",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,ShowData.class);
                    startActivity(intent);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_LONG).show();
                }
           }
        });
    }
    public void InsertData(String fn,String ln,String pw,String gender,String country){
        ContentValues values = new ContentValues();
        values.put("firstname",fn);
        values.put("lastname",ln);
        values.put("password",pw);
        values.put("gender",gender);
        values.put("country",country);
        database.insert(tablename,null,values);
    }
}
