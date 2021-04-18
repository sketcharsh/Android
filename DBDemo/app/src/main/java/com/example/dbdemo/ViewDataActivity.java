package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewDataActivity extends AppCompatActivity {
ListView listView;
String data[];
SQLiteDatabase database;
String tableName= "Stud";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);
        listView = findViewById(R.id.listView);
        database = openOrCreateDatabase("Stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

        Cursor cursor = database.query(tableName, null, null, null, null, null, null);
        data = new  String[cursor.getCount()];
        cursor.moveToNext();
        int i=0;
        while(cursor.isAfterLast() == false){
            String str = cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2);
            data[i++]=str;
            cursor.moveToNext();

            ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
            listView.setAdapter(adapter);
        }
    }
}
