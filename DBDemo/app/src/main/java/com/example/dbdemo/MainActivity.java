package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
EditText usrname,pswd;
Button insert,update,delete,search;
SQLiteDatabase database;
String createTable;
String tableName= "Stud";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        database = openOrCreateDatabase("Stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        usrname = findViewById(R.id.usrname);
        pswd = findViewById(R.id.pswd);
        insert = findViewById(R.id.insert);
        update = findViewById(R.id.update);
        search = findViewById(R.id.search);
        try{

            createTable = "CREATE TABLE IF NOT EXISTS "+ tableName + "(id integer PRIMARY KEY AUTOINCREMENT,usrname text,pswd text)";
            database.execSQL(createTable);
            Toast.makeText(MainActivity.this,"CREATED",Toast.LENGTH_LONG).show();
        }
        catch (Exception e){
            Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
        }
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,UpdateActivity.class));
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Search.class));
            }
        });
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertData(usrname.getText().toString(),pswd.getText().toString());
                Toast.makeText(MainActivity.this,"INSERTED",Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this,ViewDataActivity.class));
            }
        });
    }

    public  void  insertData(String usrname,String pswd){
        ContentValues values = new ContentValues();
        values.put("usrname",usrname);
        values.put("pswd",pswd);
        database.insert(tableName,null,values);
    }
}
