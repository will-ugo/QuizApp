package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FinalScreen extends AppCompatActivity {

    TextView txt1, txt2;
    String finalName;
    int totalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);

        txt1 = (TextView) findViewById(R.id.second_name);
        txt2 = (TextView) findViewById(R.id.score_number);

        finalName = getIntent().getStringExtra("name10");
        totalScore = getIntent().getIntExtra("ScoreUser", 0);

        Toast.makeText(FinalScreen.this, finalName + ":" + totalScore, Toast.LENGTH_LONG).show();

        txt1.setText(finalName);
        txt2.setText(String.valueOf(totalScore));
    }

    public void sendMail(View view) {
        String mailBody = "Name: " + finalName + "\nNarration: You Scored " + totalScore + " out of 10." +
                "\nThank You!";

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz App Score for " + finalName);
        intent.putExtra(Intent.EXTRA_TEXT, mailBody);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }
}
