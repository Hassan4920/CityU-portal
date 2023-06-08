package com.example.cityuphoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    button = findViewById(R.id.studentportal);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"Welcome to Student Portal", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Portal.class);
            startActivity(intent);
        }
    });


        button = findViewById(R.id.LMS);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"Welcome to LMS", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), LMS.class);
            startActivity(intent);

        }
    });

button = findViewById(R.id.setreminder);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), SetReminder.class);
        startActivity(intent);
    }
});
    }


}

