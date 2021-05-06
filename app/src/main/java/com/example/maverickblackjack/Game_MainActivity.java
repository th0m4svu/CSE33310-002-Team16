package com.example.maverickblackjack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.maverickblackjack.GetterSetter;
import com.example.maverickblackjack.Game_MainActivityFragment;

import java.util.Random;

public class Game_MainActivity extends AppCompatActivity {

    Button button;
    FragmentManager fm;
    Game_MainActivityFragment fragment;
    TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.testingstuff.R.layout.activity_main);
        button = (Button)findViewById(com.example.testingstuff.R.id.reDeal);
        fm = getSupportFragmentManager();
        fragment = (Game_MainActivityFragment) fm.findFragmentById(com.example.testingstuff.R.id.fragment);
        button.setText("Deal");
        tv = fragment.tv;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.example.testingstuff.R.menu.menu_main, menu);
        return true;
    }

    public void hit(View view) {
        if(!GetterSetter.isStanding) {
            GetterSetter.playerScore = 0;
            GetterSetter.dealerScore = 0;
            GetterSetter.hit++;
            GetterSetter.buttonPressed = 1;
            GetterSetter.fly = 0;
            GetterSetter.vertfly = 400;
        }
    }

    public void stand(View view) {
        GetterSetter.playerScore = 0;
        GetterSetter.dealerScore = 0;
        GetterSetter.dealerHit = GetterSetter.hit;
        GetterSetter.buttonPressed = 1;
        GetterSetter.isStanding = true;
    }

    public void reDeal(View view) {
        if(GetterSetter.startingHand == 1) {
            GetterSetter.startingHand = 0;
            button.setText("Deal");
            fragment.seeker.setEnabled(true);
        }
        else {
            GetterSetter.playerScore = 0;
            GetterSetter.dealerScore = 0;
            GetterSetter.hit = 3;
            GetterSetter.dealerHit = 1;
            GetterSetter.buttonPressed = 1;
            GetterSetter.isStanding = false;
            fragment.shuffleDeck(GetterSetter.card);
            button.setText("Re-Deal");
            GetterSetter.startingHand = 1;
            fragment.seeker.setEnabled(false);
        }
    }

}