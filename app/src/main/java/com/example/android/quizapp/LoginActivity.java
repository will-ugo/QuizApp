package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText et;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void startQuestionOne(View v) {

        et = (EditText) findViewById(R.id.name_view);

        String loginName = et.getText().toString();

        Intent myIntent = new Intent(LoginActivity.this, QuestionOneActivity.class);
        myIntent.putExtra("Username", loginName);
        startActivity(myIntent);
    }
}
