package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditTex
public class biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }
    public void submit()
    {
        Intent intent = new Intent(this, DisplayScreen.class);
        intent.putExtra("uname", ((EditText)findViewById(R.id.uname)).getText().toString());
        intent.putExtra("age", ((EditText)findViewById(R.id.age)).getText().toString());
        intent.putExtra("collge", ((EditText)findViewById(R.id.college)).getText().toString());
        intent.putExtra("edu", ((EditText)findViewById(R.id.edu)).getText().toString());
        startActivity(intent);
    }
}