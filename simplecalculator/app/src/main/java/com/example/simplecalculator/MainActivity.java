package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private String currentinput = "",operator="";
    private double firstnumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.res);
        View.OnClickListener numberlistner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button=(Button) view;
                currentinput+=button.getText().toString();
                result.setText(currentinput);
            }
        };

        int[] numberIds={R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button0,R.id.button00,R.id.button.}
                for(int id: numberIds)
                {
                    findViewById(id).setOnClickListener(numberlistner);
                }

                findViewById(R.id.add).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        calculate();
                    }
                });

    }
}