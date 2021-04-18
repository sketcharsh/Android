package com.example.dbfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends AppCompatActivity {
EditText userID;
TextView fn;
Button btnSearch;
SQLiteDatabase database;
String tableName="Students";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        userID = findViewById(R.id.userID);
        fn = findViewById(R.id.fn);
        btnSearch = findViewById(R.id.btnSearch);

        database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    searchData(Integer.parseInt(userID.getText().toString()));
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void searchData(int id){
        try {
            Cursor cursor = database.rawQuery("SELECT * FROM " + tableName + " WHERE id = "+ id, null);
            cursor.moveToNext();
            while(cursor.isAfterLast() == false){
                fn.setText(cursor.getString(1));
                cursor.moveToNext();
            }
        }
        catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }

}
