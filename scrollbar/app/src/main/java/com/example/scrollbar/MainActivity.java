package com.example.scrollbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox mca,bca,others;
    RadioButton male,female,others2;
    Button button,button1;
    String a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mca=(CheckBox)findViewById(R.id.mca);
        bca=(CheckBox)findViewById(R.id.bca);
        others=(CheckBox)findViewById(R.id.others);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton) findViewById(R.id.female);
        others2=(RadioButton) findViewById(R.id.others2);

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

    public void message_view1(View view){
        if(male.isChecked())
        {
            d=male.getText().toString();
        }
        else if(female.isChecked())
        {
            d=female.getText().toString();
        }
        else if(others.isChecked())
        {
            d=others.getText().toString();
        }
        else
            d="null";
        Toast.makeText(this,d, Toast.LENGTH_SHORT).show();
    }
}