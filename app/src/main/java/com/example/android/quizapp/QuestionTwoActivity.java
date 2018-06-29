package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class QuestionTwoActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
    }

    public void startQuestionThree(View v) {

        String tName = getIntent().getStringExtra("name1");

        rb1 = (RadioButton) findViewById(R.id.demonstrator_radio_button);
        rb2 = (RadioButton) findViewById(R.id.eliminator_radio_button);
        rb3 = (RadioButton) findViewById(R.id.investigator_radio_button);
        rb4 = (RadioButton) findViewById(R.id.terminator_radio_button);

        int qOneScore = getIntent().getIntExtra("GOS", 0);

        if (rb4.isChecked()) {
            qOneScore = qOneScore + 1;
        }
        int qTwoScore = qOneScore;

        Intent myIntent = new Intent(QuestionTwoActivity.this, QuestionThreeActivity.class);
        myIntent.putExtra("name2", tName);
        myIntent.putExtra("GTS", qTwoScore);
        startActivity(myIntent);
    }

}
