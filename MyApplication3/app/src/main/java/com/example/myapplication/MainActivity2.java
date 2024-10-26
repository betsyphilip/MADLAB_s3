package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity2 extends AppCompatActivity {
    TextView nameTextView, typeTextView, unitTextView, billDateTextView, amountTextView,dueDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameTextView = findViewById(R.id.st1);
        typeTextView = findViewById(R.id.st2);
        unitTextView = findViewById(R.id.st3);
        billDateTextView = findViewById(R.id.st4);
        amountTextView = findViewById(R.id.st5);
        dueDateTextView=findViewById(R.id.st6);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAme");
        String type = intent.getStringExtra("Type");
        String unit = intent.getStringExtra("Unit");
        Calendar billDate = (Calendar) intent.getSerializableExtra("billDate");

        nameTextView.setText(name);
        typeTextView.setText(type);
        unitTextView.setText(unit);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedBillDate = dateFormat.format(billDate.getTime());
        billDateTextView.setText(formattedBillDate);

        double amount = calculateAmount(type, Double.parseDouble(unit));
        amountTextView.setText(String.valueOf(amount));

        Calendar dueDate = (Calendar) billDate.clone();
        dueDate.add(Calendar.DAY_OF_MONTH, 7);
        String formattedDueDate = dateFormat.format(dueDate.getTime());
        dueDateTextView.setText(formattedDueDate);





    }

    private double calculateAmount(String type, double unit) {
        double amount = 0.0;
        if (type.equals("Domestic")) {
            if (unit <= 200) {
                amount = unit * 3.0;
            } else {
                amount = 200 * 3.0 + (unit - 200) * 5.0;
            }
        } else if (type.equals("Industrial")) {
            if (unit <= 200) {
                amount = unit * 5.0;
            } else {
                amount = unit * 7.0;
            }
        } else if (type.equals("Business")) {
            if (unit <= 200) {
                amount = unit * 4.0;
            } else {
                amount = unit * 6.0;
            }
        }
        return amount;
    }
}