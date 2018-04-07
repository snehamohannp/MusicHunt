package com.example.student.musichunt;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class lyrichindi extends AppCompatActivity {
    SQLiteDatabase dbh;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrichindi);
        t1 = (TextView) findViewById(R.id.tv1);

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        Toast.makeText(getApplicationContext(), "Song is  : "+name, Toast.LENGTH_SHORT).show();

        dbh = openOrCreateDatabase("Music", MODE_PRIVATE, null);
        dbh.execSQL("CREATE TABLE IF NOT EXISTS hindi (id Integer primary key,name varchar,description varchar);");
        Cursor cur = dbh.rawQuery("SELECT * from hindi where name='" + name + "'", null);
        String x=String.valueOf(cur.getCount());
        Toast.makeText(getApplicationContext(),x,Toast.LENGTH_SHORT);
        if (cur.getCount() != 0) {
            cur.moveToFirst();
            // Toast.makeText(getApplicationContext(),c.getString(c.getColumnIndex("description")),Toast.LENGTH_SHORT);
            t1.setText(cur.getString(cur.getColumnIndex("description")));
        }
        else{
            Toast.makeText(getApplicationContext(),"Not", Toast.LENGTH_SHORT);
        }

    }
}
