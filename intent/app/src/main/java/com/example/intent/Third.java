package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class Third extends AppCompatActivity {
    TextView t1;
    TimePicker p1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        t1=(TextView) findViewById(R.id.text);
        p1=(TimePicker) findViewById(R.id.time);

        p1.setIs24HourView(false);
        p1.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(getApplicationContext(),"Time="+hourOfDay+":"+minute,Toast.LENGTH_SHORT).show();

            }
        });




    }
}