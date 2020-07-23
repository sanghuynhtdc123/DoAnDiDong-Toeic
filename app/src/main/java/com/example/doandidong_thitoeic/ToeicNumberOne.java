package com.example.doandidong_thitoeic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ToeicNumberOne extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toeic_number_one_layout);
        listView = findViewById(R.id.listView_toeic);
        ArrayList data =new ArrayList<String>();
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        data.add("câu 1");
        data.add("câu 2");
        data.add("câu 3");
        data.add("câu 4");
        data.add("câu 5");
        ArrayAdapter adapter =new ArrayAdapter(this, android.R.layout.simple_list_item_1, data);
        listView.setAdapter(adapter);
    }
}