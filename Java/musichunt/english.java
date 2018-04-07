package com.example.student.musichunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class english extends AppCompatActivity {
    ListView lv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        String[] values = new String[] { "SHAPE OF YOU",
                "LOVE ME LIKE YOU",
                "BLANK SPACE",

        };
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        ListView listView = (ListView) findViewById(R.id.lv3);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in=new Intent(english.this,lyrichindi.class);
                in.putExtra("name",(String)parent.getItemAtPosition(position));
                startActivity(in);
            }
        });


    }
}
