package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class QuestionSixActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_six);

    }

    public void startQuestionSeven(View v) {

        String sName = getIntent().getStringExtra("name5");

        rb1 = (RadioButton) findViewById(R.id.lancashire_radio_button);
        rb2 = (RadioButton) findViewById(R.id.leicestershire_radio_button);
        rb3 = (RadioButton) findViewById(R.id.liverpoolshire_radio_button);
        rb4 = (RadioButton) findViewById(R.id.lincolnshire_radio_button);


        int qFiveScore = getIntent().getIntExtra("GFIS", 0);
        if (rb3.isChecked()) {
            qFiveScore = qFiveScore + 1;
        }
        int qSixScore = qFiveScore;

        Intent myIntent = new Intent(QuestionSixActivity.this, QuestionSevenActivity.class);
        myIntent.putExtra("name6", sName);
        myIntent.putExtra("GSS", qSixScore);
        startActivity(myIntent);
    }

}
