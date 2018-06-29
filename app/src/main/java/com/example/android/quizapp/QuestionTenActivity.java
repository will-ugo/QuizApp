package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class QuestionTenActivity extends AppCompatActivity {

    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ten);
    }

    public void startFinalScreen(View v) {

        text = (EditText) findViewById(R.id.edit_text_view_answer);
        String ansString = text.getText().toString();
        String teName = getIntent().getStringExtra("name9");
        int qNineScore = getIntent().getIntExtra("GNS", 0);
        String answer = "William Shakespeare";
        if (answer.equals(ansString)) {
            qNineScore = qNineScore + 1;
        }
        int finalScore = qNineScore;

        Intent myIntent = new Intent(QuestionTenActivity.this, FinalScreen.class);
        myIntent.putExtra("name10", teName);
        myIntent.putExtra("ScoreUser", finalScore);
        startActivity(myIntent);
    }
}
