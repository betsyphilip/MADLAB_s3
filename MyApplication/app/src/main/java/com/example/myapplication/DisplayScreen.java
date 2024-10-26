package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_screen);
        ((TextView)findViewById(R.id.unamedisplay)).setText(getIntent().getStringExtra("uname"));
        ((TextView)findViewById(R.id.agedisplay)).setText(getIntent().getStringExtra("age"));
        ((TextView)findViewById(R.id.edudisplay)).setText(getIntent().getStringExtra("edu"));
        ((TextView)findViewById(R.id.coldisplay)).setText(getIntent().getStringExtra("college"));

    }

}