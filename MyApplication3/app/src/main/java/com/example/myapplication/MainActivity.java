package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3;
    Button button;
    Spinner sp;
    String spresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.e1);
        ed2 = findViewById(R.id.e2);
        ed3 = findViewById(R.id.e3);
        button = findViewById(R.id.b1);
        sp = findViewById(R.id.s1);
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Domestic");
        arrlist.add("Industrial");
        arrlist.add("Business");
        ArrayAdapter<String> arradp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrlist);
        arradp.setDropDownViewResource(android.R.layout.simple_list_item_1);
        sp.setAdapter(arradp);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                spresult = arrlist.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void display(View view) {
        String Name = ed1.getText().toString();
        String spinnerval = spresult;
        String Unit = ed2.getText().toString();
        String billDateStr = ed3.getText().toString();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        Calendar billDate = Calendar.getInstance();

        try {
            billDate.setTime(dateFormat.parse(billDateStr));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("NAme", Name);
        i.putExtra("Type", spinnerval);
        i.putExtra("Unit", Unit);
        i.putExtra("billDate", billDate);
        startActivity(i);

        finish();
    }
}