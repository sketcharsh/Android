package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Search extends AppCompatActivity {
ListView listView;
EditText searchID;
Button search;
String tableName = "Stud";
SQLiteDatabase database;
String data[];
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        listView = findViewById(R.id.listView);
        searchID = findViewById(R.id.searchid);
        search = findViewById(R.id.search);
        database = openOrCreateDatabase("Stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c = database.query(tableName,null,"usrname=?", new String[] {searchID.getText().toString()},null,null,null);
                c.moveToFirst();
                String str = c.getString(1) + " " + c.getString(2);
                Toast.makeText(Search.this,str,Toast.LENGTH_SHORT).show();
                c.close();
            }
        });
    }
}
