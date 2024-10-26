package com.example.checkkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox mca,bca,others;
    Button button;
    String a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mca=(CheckBox)findViewById(R.id.mca);
        bca=(CheckBox)findViewById(R.id.bca);
        others=(CheckBox)findViewById(R.id.others);

    }
    public void message_view(View view){
        if(mca.isChecked())
        {
            a=mca.getText().toString();
        }
        else
            a="null";
        if(bca.isChecked())
        {
            b=bca.getText().toString();
        }
        else
            b="null";
        if(others.isChecked())
        {
            c=others.getText().toString();
        }
        else
            c="null";
        Toast.makeText(this,a+" "+b+" "+c+" ", Toast.LENGTH_SHORT).show();
    }
}