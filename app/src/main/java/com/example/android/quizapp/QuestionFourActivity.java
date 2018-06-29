package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class QuestionFourActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_four);

    }

    public void startQuestionFive(View v) {

        String fName = getIntent().getStringExtra("name3");

        rb1 = (RadioButton) findViewById(R.id.johnsonmere_radio_button);
        rb2 = (RadioButton) findViewById(R.id.thompsonpond_radio_button);
        rb3 = (RadioButton) findViewById(R.id.dawsoncreek_radio_button);
        rb4 = (RadioButton) findViewById(R.id.madisonlake_radio_button);

        int qThreeScore = getIntent().getIntExtra("GTHS", 0);
        if (rb3.isChecked()) {
            qThreeScore = qThreeScore + 1;
        }
        int qFourScore = qThreeScore;

        Intent myIntent = new Intent(QuestionFourActivity.this, QuestionFiveActivity.class);
        myIntent.putExtra("name4", fName);
        myIntent.putExtra("GFS", qFourScore);
        startActivity(myIntent);

    }


}
