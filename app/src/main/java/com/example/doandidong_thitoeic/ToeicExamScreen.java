package com.example.doandidong_thitoeic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class ToeicExamScreen extends AppCompatActivity {
    private Button number_one;
    private  Button number_six;
    final static String KEY_DATA = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toeic_exam_screen_layout);
        number_one = findViewById(R.id.btn_number_1);
        number_six = findViewById(R.id.btn_number_6);


        number_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle data = new Bundle();
                Intent intent = new Intent(ToeicExamScreen.this, ToeicNumberOne.class);
                intent.putExtra(KEY_DATA, data);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
        number_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle data = new Bundle();
                Intent intent = new Intent(ToeicExamScreen.this, ToeicNumberSix.class);
                intent.putExtra(KEY_DATA, data);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        });
    }

}