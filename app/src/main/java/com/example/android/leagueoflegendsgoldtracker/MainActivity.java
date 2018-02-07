package com.example.android.leagueoflegendsgoldtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int goldTeamA = 0;
    int goldTeamB = 0;
// Buttons for Team A (Left side)

    public void killButtonA(View view){
        goldTeamA += 300;
        displayForTeamA(goldTeamA);
    }
    public void minionButtonA(View view) {
        goldTeamA += 18;
        displayForTeamA(goldTeamA);
    }
    public void dragonButtonA(View view) {
        goldTeamA +=150;
        displayForTeamA(goldTeamA);
    }

    public void baronButtonA(View view) {
        goldTeamA +=300;
        displayForTeamA(goldTeamA);
    }
    public void wardButtonA(View view) {
        goldTeamA +=10;
        displayForTeamA(goldTeamA);
    }
    public void towerButtonA(View view) {
        goldTeamA +=300;
        displayForTeamA(goldTeamA);
    }

// Buttons for Team B (Right side)

    public void killButtonB(View view){
    goldTeamB += 300;
    displayForTeamB(goldTeamB);
    }
    public void minionButtonB(View view) {
        goldTeamB += 18;
        displayForTeamB(goldTeamB);
    }
    public void dragonButtonB(View view) {
        goldTeamB +=150;
        displayForTeamB(goldTeamB);
    }
    public void baronButtonB(View view) {
        goldTeamB +=300;
        displayForTeamB(goldTeamB);
    }
    public void wardButtonB(View view) {
        goldTeamB +=10;
        displayForTeamB(goldTeamB);
    }
    public void towerButtonB(View view) {
        goldTeamB +=300;
        displayForTeamB(goldTeamB);
    }

 // Reset Button

    public void resetButton(View view) {
        goldTeamA = 0;
        goldTeamB = 0;
        displayForTeamB(goldTeamB);
        displayForTeamA(goldTeamA);
    }

 // Gold text view methods
    public void displayForTeamA(int gold) {
        TextView goldView = (TextView) findViewById(R.id.team_a_gold);
        goldView.setText("" + gold);
    }
    public void displayForTeamB(int gold) {
        TextView goldView = (TextView) findViewById(R.id.team_b_gold);
        goldView.setText("" + gold);
    }
}
