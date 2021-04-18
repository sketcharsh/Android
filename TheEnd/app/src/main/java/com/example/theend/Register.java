package com.example.theend;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Register extends AppCompatActivity {
EditText un,pw;
RadioGroup rg;
RadioButton rb;
Spinner sp;
Button insert;
SQLiteDatabase database;
String tableName ="Empl";
String createTable;
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        un = findViewById(R.id.un);
        pw = findViewById(R.id.pw);
        sp = findViewById(R.id.spinner);
        rg = findViewById(R.id.rg);
        insert = findViewById(R.id.btnSave);
        database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        try {
            createTable = "CREATE TABLE IF NOT EXISTS "+ tableName+"(id integer PRIMARY KEY AUTOINCREMENT,username text,password text,gender text,city text)";
            database.execSQL(createTable);
            Toast.makeText(getApplicationContext(),"CREATED",Toast.LENGTH_SHORT);
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT);
        }
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = rg.getCheckedRadioButtonId();
                rb = findViewById(id);
                insertData(un.getText().toString(),pw.getText().toString(),rb.getText().toString(),sp.getSelectedItem().toString());
                Toast.makeText(getApplicationContext(),"INSERTED",Toast.LENGTH_SHORT);
            }
        });
    }
    public void insertData(String un,String pw,String gender,String city){
        ContentValues values = new ContentValues();
        values.put("username",un);
        values.put("password",pw);
        values.put("username",gender);
        values.put("username",city);
        database.insert(tableName,null,values);
    }
}
