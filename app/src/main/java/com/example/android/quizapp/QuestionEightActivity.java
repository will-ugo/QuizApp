package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class QuestionEightActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_eight);
    }

    public void startQuestionNine(View v) {

        String eName = getIntent().getStringExtra("name7");

        rb1 = (RadioButton) findViewById(R.id.u2_radio_button);
        rb2 = (RadioButton) findViewById(R.id.sr71_radio_button);
        rb3 = (RadioButton) findViewById(R.id.f111_radio_button);
        rb4 = (RadioButton) findViewById(R.id.c130_radio_button);

        int qSevenScore = getIntent().getIntExtra("GSES", 0);
        if (rb1.isChecked()) {
            qSevenScore = qSevenScore + 1;
        }
        int qEightScore = qSevenScore;

        Intent myIntent = new Intent(QuestionEightActivity.this, QuestionNineActivity.class);
        myIntent.putExtra("name8", eName);
        myIntent.putExtra("GES", qEightScore);
        startActivity(myIntent);
    }

}
