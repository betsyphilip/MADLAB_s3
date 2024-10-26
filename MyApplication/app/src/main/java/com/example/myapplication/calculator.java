package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class calculator extends AppCompatActivity {
    TextView tv;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    String d1 = null;
    String op;
    Double a,b,c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tv = (TextView)findViewById(R.id.tv);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        b10 = (Button)findViewById(R.id.b10);
        b11 = (Button)findViewById(R.id.b11);
        b12 = (Button)findViewById(R.id.b12);
        b13 = (Button)findViewById(R.id.b13);
        b14 = (Button)findViewById(R.id.b14);
        b15 = (Button)findViewById(R.id.b15);
        b16 = (Button)findViewById(R.id.b16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                tv.setText(d1+"0");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                a = Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                a = Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                a = Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                a = Double.parseDouble(d1);
                d1=null;
                tv.setText(null);
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1=null;
                tv.setText(null);
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1 = tv.getText().toString();
                b = Double.parseDouble(d1);
                switch(op)
                {
                    case "+":
                        c = a+b;
                        break;
                    case "-":
                        c = a-b;
                        break;
                    case "x":
                        c = a*b;
                        break;
                    case "/":
                        c = a/b;
                        break;
                    default:break;
                }
                a =c;
                tv.setText(String.valueOf(c));
            }
        });
    }
}













