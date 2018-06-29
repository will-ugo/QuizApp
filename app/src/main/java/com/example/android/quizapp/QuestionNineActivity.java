package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class QuestionNineActivity extends AppCompatActivity {

    CheckBox ch1, ch2, ch3, ch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_nine);


    }

    public void startQuestionTen(View v) {

        String nName = getIntent().getStringExtra("name8");

        ch1 = (CheckBox) findViewById(R.id.wales_check_box);
        ch2 = (CheckBox) findViewById(R.id.catalonia_check_box);
        ch3 = (CheckBox) findViewById(R.id.paris_check_box);
        ch4 = (CheckBox) findViewById(R.id.northireland_check_box);

        int qEightScore = getIntent().getIntExtra("GES", 0);

        if (ch1.isChecked() && ch4.isChecked()) {
            qEightScore = qEightScore + 1;
        }
        int qNineScore = qEightScore;

        Intent myIntent = new Intent(QuestionNineActivity.this, QuestionTenActivity.class);
        myIntent.putExtra("name9", nName);
        myIntent.putExtra("GNS", qNineScore);
        startActivity(myIntent);
    }
}
