package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3,b4,b5;
    TextView t1,t2,t3;
    EditText e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);

        e1=(EditText)findViewById(R.id.editTextText);
        e2=(EditText)findViewById(R.id.editTextText2);
        e3=(EditText)findViewById(R.id.editTextText3);


        b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                int c=a+b;

                e3.setText(String.valueOf(c));
            }
        });
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                int c=a-b;

                e3.setText(String.valueOf(c));
            }
        });
        b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                int c=a*b;

                e3.setText(String.valueOf(c));
            }
        });
        b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int a=Integer.parseInt(e1.getText().toString());
                int b=Integer.parseInt(e2.getText().toString());
                int c=a/b;

                e3.setText(String.valueOf(c));
            }
        });
        b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a=e1.getText().toString();
                String b=e2.getText().toString();
                String c=a+b;
                e3.setText(String.valueOf(c));
            }
        });
    }
}