package com.example.student.musichunt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class song extends AppCompatActivity {
    Button bhindi,btamil,bmalayalam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        bhindi = (Button) findViewById(R.id.bhindi);
        btamil = (Button) findViewById(R.id.btamil);

        bmalayalam = (Button) findViewById(R.id.bmalayalam);
        bhindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(song.this, hindi.class);
                startActivity(in);

            }
        });

        bmalayalam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(song.this, malayalam.class);
                startActivity(in);

            }
        });
        btamil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in = new Intent(song.this,tamil.class);
                startActivity(in);

            }
        });




    }
}
