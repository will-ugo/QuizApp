package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuestionOneActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rb1, rb2, rb3, rb4;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);


    }

    public void startQuestionTwo(View v) {

        String oName = getIntent().getStringExtra("Username");

        rb1 = (RadioButton) findViewById(R.id.car_radio_button);
        rb2 = (RadioButton) findViewById(R.id.plane_radio_button);
        rb3 = (RadioButton) findViewById(R.id.boat_radio_button);
        rb4 = (RadioButton) findViewById(R.id.tube_radio_button);

        if (rb3.isChecked()) {
            score = score + 1;
        } else {
            score = 0;
        }

        Intent myIntent = new Intent(QuestionOneActivity.this, QuestionTwoActivity.class);
        myIntent.putExtra("name1", oName);
        myIntent.putExtra("GOS", score);
        startActivity(myIntent);
    }

}
