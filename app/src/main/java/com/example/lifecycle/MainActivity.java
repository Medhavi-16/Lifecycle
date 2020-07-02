package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.next);
        System.out.println("Activity 1 created");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , Activity2.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity 1 started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity 1 resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity 1 stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity 1 destroyed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity 1 paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity 1 re-started");
    }
}