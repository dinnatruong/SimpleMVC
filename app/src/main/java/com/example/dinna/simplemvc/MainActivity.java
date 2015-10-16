package com.example.dinna.simplemvc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    String user;
    ImageButton galleryicon, calendaricon, clockicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Bundle getBasket = getIntent().getExtras();
        user = getBasket.getString("userid");
        setTitle("Welcome, " + user + "!");

        galleryicon = (ImageButton) findViewById(R.id.galleryicon);
        galleryicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Gallery.class));
            }
        });

        calendaricon = (ImageButton) findViewById(R.id.calendaricon);
        calendaricon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Calendar.class));
            }
        });

        clockicon = (ImageButton) findViewById(R.id.clockicon);
        clockicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Clock.class));
            }
        });

    }

}
