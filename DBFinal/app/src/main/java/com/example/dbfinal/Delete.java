package com.example.dbfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete extends AppCompatActivity {
EditText deleteID;
Button deleteBtn;
SQLiteDatabase database;
String tableName = "Students";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        deleteBtn = findViewById(R.id.deleteBtn);
        deleteID = findViewById(R.id.deleteID);

        database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        deleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deleteData(Integer.parseInt(deleteID.getText().toString()));
                Toast.makeText(getApplicationContext(),"DELETED",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(Delete.this,ShowData.class));
            }
        });
    }
    public void deleteData(int id){
        ContentValues values = new ContentValues();
        values.put("id",id);
        database.delete(tableName,"id ="+id,null);
    }
}
