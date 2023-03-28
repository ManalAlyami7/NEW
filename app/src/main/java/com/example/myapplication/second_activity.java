package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {
TextView received;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        received  = (TextView) findViewById(R.id.received_value_id);
        Intent intent = getIntent();
        String str = intent.getStringExtra("PersonName");
        received.setText("Hello, "+str+" !");
    }
}