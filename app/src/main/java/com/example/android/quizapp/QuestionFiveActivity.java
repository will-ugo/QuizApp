package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class QuestionFiveActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_five);

    }

    public void startQuestionSix(View v) {

        String fiName = getIntent().getStringExtra("name4");

        rb1 = (RadioButton) findViewById(R.id.countyeastern_radio_button);
        rb2 = (RadioButton) findViewById(R.id.kingdomnorthern_radio_button);
        rb3 = (RadioButton) findViewById(R.id.landsouthern_radio_button);
        rb4 = (RadioButton) findViewById(R.id.countywestern_radio_button);


        int qFourScore = getIntent().getIntExtra("GFS", 0);
        if (rb4.isChecked()) {
            qFourScore = qFourScore + 1;
        }
        int qFiveScore = qFourScore;

        Intent myIntent = new Intent(QuestionFiveActivity.this, QuestionSixActivity.class);
        myIntent.putExtra("name5", fiName);
        myIntent.putExtra("GFIS", qFiveScore);
        startActivity(myIntent);
    }

}
