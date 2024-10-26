package com.example.database;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    TextView t1,t2,t3;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        t3=(TextView) findViewById(R.id.textView3);
        e1=(EditText) findViewById(R.id.editTextText);
        e2=(EditText) findViewById(R.id.editTextText2);
        e3=(EditText) findViewById(R.id.editTextText3);
        b1=(Button) findViewById(R.id.button);

        final databasein db=new databasein(MainActivity.this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();
                db.InsertValues(s1,s2,s3);

                Toast.makeText(getApplicationContext(),"Successfully Inserted",Toast.LENGTH_SHORT).show();
            }
        });
        b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cursor res=db.getAllData();
                StringBuffer buffer=new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Password :"+res.getString(1)+"\n");
                    buffer.append("Place :"+res.getString(2)+"\n");

                }
                showMessage("DATA",buffer.toString());


            }

            private void showMessage(String data, String String) {
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setCancelable(true);
                builder.setTitle(data);
                builder.setMessage(msg);
                builder.show();
            }
        });
    }
}