package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Tracks the score for team 1.
     */
    int scoreTeam1 = 0;

    /**
     * Tracks the score for team 2.
     */
    int scoreTeam2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeam1(0);
        displayForTeam2(0);
    }

    /**
     * Increase the score for Team 1 by 6 points.
     */
    public void addSixPointsForTeam1 (View v){
        scoreTeam1 = scoreTeam1 + 6;
        displayForTeam1(scoreTeam1);

    }

    /**
     * Increase the score for Team 1 by  point.
     */
    public void addOnePointForTeam1 (View v){
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);

    }

    /**
     * Increase the score for Team 1 by 3 points.
     */
    public void addThreePointsForTeam1 (View v){
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);

    }

    /**
     * Increase the score for Team 1 by 2 points.
     */
    public void addTwoPointsForTeam1 (View v){
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);

    }
/**
 * START OF TEAM 2 CODE.---------------------------------------------------
 */

    /**
     * Increase the score for Team 2 by 6 points.
     */
    public void addSixPointsForTeam2 (View v){
        scoreTeam2 = scoreTeam2 + 6;
        displayForTeam2(scoreTeam2);

    }

    /**
     * Increase the score for Team 2 by 1 point.
     */
    public void addOnePointForTeam2 (View v){
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);

    }

    /**
     * Increase the score for Team 2 by 3 points.
     */
    public void addThreePointsForTeam2 (View v){
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);

    }

    /**
     * Increase the score for Team 2 by 2 points.
     */
    public void addTwoPointsForTeam2 (View v){
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);

    }

    /**
     * Resets both team a and b scores to 0.
     */
    public void resetScore(View v){
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }
}
