package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class QuestionSevenActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_seven);


    }

    public void startQuestionEight(View v) {

        String seName = getIntent().getStringExtra("name6");

        rb1 = (RadioButton) findViewById(R.id.one_radio_button);
        rb2 = (RadioButton) findViewById(R.id.two_radio_button);
        rb3 = (RadioButton) findViewById(R.id.three_radio_button);
        rb4 = (RadioButton) findViewById(R.id.four_radio_button);

        int qSixScore = getIntent().getIntExtra("GSS", 0);
        if (rb1.isChecked()) {
            qSixScore = qSixScore + 1;
        }
        int qSevenScore = qSixScore;

        Intent myIntent = new Intent(QuestionSevenActivity.this, QuestionEightActivity.class);
        myIntent.putExtra("name7", seName);
        myIntent.putExtra("GSES", qSevenScore);
        startActivity(myIntent);
    }

}
