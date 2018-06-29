package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuestionThreeActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rb1, rb2, rb3, rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);


    }

    public void startQuestionFour(View v) {

        String thName = getIntent().getStringExtra("name2");

        rb1 = (RadioButton) findViewById(R.id.bestman_radio_button);
        rb2 = (RadioButton) findViewById(R.id.topman_radio_button);
        rb3 = (RadioButton) findViewById(R.id.fineman_radio_button);
        rb4 = (RadioButton) findViewById(R.id.oldman_radio_button);

        int qTwoScore = getIntent().getIntExtra("GTS", 0);

        if (rb1.isChecked()) {
            qTwoScore = qTwoScore + 1;
        }
        int qThreeScore = qTwoScore;

        Intent myIntent = new Intent(QuestionThreeActivity.this, QuestionFourActivity.class);
        myIntent.putExtra("name3", thName);
        myIntent.putExtra("GTHS", qThreeScore);
        startActivity(myIntent);
    }

}
