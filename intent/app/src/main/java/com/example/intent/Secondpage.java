package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class Secondpage extends AppCompatActivity {

    Button b1,b2;
    TextView t1;
    DatePicker d1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        t1=(TextView) findViewById(R.id.text);
        d1=(DatePicker)findViewById(R.id.date);
        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String day="Day="+d1.getDayOfMonth();
                String month="Month="+(d1.getMonth()+1);
                String year="Year="+d1.getYear();
                t1.setText(day+month+year);
            }
        });
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(Secondpage.this,Third.class);
                startActivity(in);
            }
        });


    }
}