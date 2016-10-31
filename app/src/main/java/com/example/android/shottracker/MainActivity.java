package com.example.android.shottracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    * Increase score for three
    * */
    public void display3(View v) {
        displayForTeamA(3);
    }

    /*
    * Increase score for two
    * */
    public void display2(View v) {
        displayForTeamA(2);
    }

    /*
    * Increase score for one
    * */
    public void display1(View v) {
        displayForTeamA(1);
    }

}
