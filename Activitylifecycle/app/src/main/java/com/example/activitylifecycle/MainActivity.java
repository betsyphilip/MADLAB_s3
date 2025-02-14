package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("State","onStart() is invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("State","onResume() is invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("State","onPause() is invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("State","onStop() is invoked");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("State","onRestart() is invoked");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("State","onDestroy() is invoked");

    }
}