package com.example.tehtava3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Date> lista = new ArrayList<>();
    private DateAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        adapter = new DateAdapter(this, R.layout.content_main, R.id.listView, lista);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Date aika = Calendar.getInstance().getTime();
                adapter.add(aika);
            }
        });

    }
}
