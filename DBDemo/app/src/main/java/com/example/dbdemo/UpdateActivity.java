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

public class UpdateActivity extends AppCompatActivity {
EditText id,usrname,pswd;
Button update;
SQLiteDatabase database;
String tableName = "Stud";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        id = findViewById(R.id.id);
        usrname = findViewById(R.id.usrname);
        pswd = findViewById(R.id.pswd);
        update = findViewById(R.id.update);
        database = openOrCreateDatabase("Stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int usrID = Integer.parseInt(id.getText().toString());
                updateData(usrID,usrname.getText().toString(),pswd.getText().toString());
                Toast.makeText(UpdateActivity.this,"UPDATED",Toast.LENGTH_LONG).show();
                startActivity(new Intent(UpdateActivity.this,ViewDataActivity.class));
            }
        });
    }
    public void updateData(int id,String usrname,String pswd){
        ContentValues values = new ContentValues();
        values.put("id",id);
        values.put("usrname",usrname);
        values.put("pswd",pswd);
        database.update(tableName,values,"id ="+id,null);
    }
}
