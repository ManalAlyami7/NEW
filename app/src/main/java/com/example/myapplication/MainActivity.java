package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b;
EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b = (Button) findViewById(R.id.send_button_id);
e = findViewById(R.id.send_text_id);
b.setOnClickListener(view -> {
    String s= e.getText().toString();
    Intent intent = new Intent(getApplicationContext(), second_activity.class);
    intent.putExtra("PersonName",s);
    startActivity(intent);
});
    }
}
