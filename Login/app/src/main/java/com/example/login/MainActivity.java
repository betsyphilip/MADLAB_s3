package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button) findViewById(R.id.button);
        e1=(EditText) findViewById(R.id.editTextText);
        e2=(EditText) findViewById(R.id.editTextTextPassword);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                if(s1.equals("admin")&&s2.equals("admin@123"))
                {
                    Toast.makeText(getApplicationContext(),"Successfully Login ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity.this, Welcome.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Invalid Credentials ",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}