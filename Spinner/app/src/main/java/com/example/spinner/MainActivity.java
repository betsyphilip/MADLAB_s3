package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String[] state={"Kerala","Karnataka","Tamil Nadu","Maharashtra","Gujarat","Rajasthan","Himachal Pradesh"};
    Button b1;
    Spinner s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button);
        s1=(Spinner) findViewById(R.id.spinner);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayAdapter adapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,state);

                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                s1.setAdapter(adapter);

            }
        });
    }
}