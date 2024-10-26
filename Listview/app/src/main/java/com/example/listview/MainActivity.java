package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView ls;
    String cartype[]={"BMW","Skoda","Chevrolet","Ford","Range Rover"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ls=findViewById(R.id.listview);
        ArrayAdapter adapter =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cartype);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"I will buy "+adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }
        });
    }
}