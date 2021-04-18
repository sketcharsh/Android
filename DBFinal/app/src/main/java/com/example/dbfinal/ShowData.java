package com.example.dbfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ShowData extends AppCompatActivity {
ListView listView;
SQLiteDatabase database;
String tableName = "Students";
String data[];
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        listView = findViewById(R.id.listView);
        try {
            database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
            Cursor cursor = database.query(tableName, null, null, null, null, null, null);
            data = new String[cursor.getCount()];
            int i = 0;
            cursor.moveToNext();

            while (cursor.isAfterLast() == false){
                String str = cursor.getInt(0) + " " + cursor.getString(1) + " " + cursor.getString(2)+ " " + cursor.getString(3)
                        + " " + cursor.getString(4)+ " " + cursor.getString(5);
                data[i++]=str;
                cursor.moveToNext();

                ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
                listView.setAdapter(adapter);
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
}
