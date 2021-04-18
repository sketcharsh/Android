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

public class UpdateData extends AppCompatActivity {
EditText id,fn,ln,pw;
Button update;
RadioGroup rg;
RadioButton rb;
Spinner sp;
String gender;
SQLiteDatabase database;
String tableName = "Students";
    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);
        id = findViewById(R.id.updateID);
        fn = findViewById(R.id.fn);
        ln = findViewById(R.id.ln);
        pw = findViewById(R.id.pw);
        sp = findViewById(R.id.country);
        update = findViewById(R.id.updateBtn);
        rg = findViewById(R.id.rg);

        database = openOrCreateDatabase("stud.db",SQLiteDatabase.CREATE_IF_NECESSARY,null);

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int idRadio = rg.getCheckedRadioButtonId();
                    rb = findViewById(idRadio);
                    gender = rb.getText().toString();
                    updateData(Integer.parseInt(id.getText().toString()),fn.getText().toString(),ln.getText().toString(),pw.getText().toString(),gender,sp.getSelectedItem().toString());
                    Toast.makeText(getApplicationContext(),"UPDATED",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(UpdateData.this,ShowData.class);
                }
                catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });
      }
    public void updateData(int id,String fn,String ln,String pw,String gender,String country){
        ContentValues values = new ContentValues();
        values.put("id",id);
        values.put("firstname",fn);
        values.put("lastname",ln);
        values.put("password",pw);
        values.put("gender",gender);
        values.put("country",country);
        database.update(tableName,values,"id ="+id,null);
    }
}
