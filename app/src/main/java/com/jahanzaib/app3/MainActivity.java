package com.jahanzaib.app3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayteamA(0);
        displayteamB(0);
    }

    int scoreA ;
    int scoreB ;

    public void displayteamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.teamAresult);
        scoreView.setText(String.valueOf(score));
    }
    public void displayteamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.teamBresult);
        scoreView.setText(String.valueOf(score));
    }

    public void plus3(View view){
        scoreA = scoreA + 3;
        displayteamA(scoreA);
    }
    public void plus3B(View view){
        scoreB = scoreB + 3;
        displayteamB(scoreB);
    }
    public void plus2(View view){
        scoreA = scoreA + 2;
        displayteamA(scoreA);
    }
    public void plus2B(View view){
        scoreB = scoreB + 2;
        displayteamB(scoreB);
    }
    public void freethrow(View view){
        scoreA = scoreA + 1;
        displayteamA(scoreA);
    }
    public void freethrowB(View view){
        scoreB = scoreB + 1;
        displayteamB(scoreB);
    }

    public void resetAll(View view){
        displayteamA(scoreA = 0);
        displayteamB(scoreB = 0);
    }

}

