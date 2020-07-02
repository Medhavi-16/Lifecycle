package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        System.out.println("Activity 2 created");
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity2.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity 2 started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity 2 resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity 2 stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity 2 destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity 2 paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity 2 re-started");
    }
}