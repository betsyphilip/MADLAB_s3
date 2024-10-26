package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cal(View view)
    {
        Intent intent = new Intent(this,calculator.class);
        startActivity(intent);

    }
    public void bio(View view)
    {
        Intent intent = new Intent(this,biodata.class);
        startActivity(intent);

    }
}