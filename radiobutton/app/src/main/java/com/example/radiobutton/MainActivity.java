package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton male,female,others;
    Button button;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton) findViewById(R.id.female);
        others=(RadioButton) findViewById(R.id.others);
    }
    public void message_view(View view){
        if(male.isChecked())
        {
            a=male.getText().toString();
        }
        else if(female.isChecked())
        {
            a=female.getText().toString();
        }
        else if(others.isChecked())
        {
            a=others.getText().toString();
        }
        else
            a="null";
        Toast.makeText(this,a, Toast.LENGTH_SHORT).show();
    }
}