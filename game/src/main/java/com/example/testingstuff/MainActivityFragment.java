package com.example.testingstuff;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Random;

public class MainActivityFragment extends Fragment {

    Handler mHandler;
    TextView tv, tv1, tv2, tv3;
    Cards[] card;
    int i = 0;
    View rootView;
    SeekBar seeker;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        rootView.setBackgroundResource(R.drawable.feltbackground);

        seeker = (SeekBar)rootView.findViewById(R.id.seeker);
        seeker.setMax(GetterSetter.cash);
        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromPlayer) {
                GetterSetter.bet = progress;
            }
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        tv = (TextView)rootView.findViewById(R.id.textView);
        tv.setTextColor(Color.RED);
        tv.setTextSize(24);
        tv1 = (TextView)rootView.findViewById(R.id.textView1);
        tv1.setTextColor(Color.RED);
        tv1.setTextSize(24);
        tv2 = (TextView)rootView.findViewById(R.id.textView2);
        tv2.setTextColor(Color.RED);
        tv2.setTextSize(24);
        tv3 = (TextView)rootView.findViewById(R.id.textView3);
        tv3.setTextColor(Color.RED);
        tv3.setTextSize(14);

        card = new Cards[52];
        for(int suit = 0; suit < 4; suit++) {
            for(int value = 0; value < 13; value++) {
                card[i] = new Cards(suit, value);
                i++;
            }
        }
        card = shuffleDeck(card);
        GetterSetter.card = card;

        mHandler = new Handler();
        mHandler.post(mUpdate);

        return rootView;
    }

    private Runnable mUpdate = new Runnable() {
        public void run() {
            if(GetterSetter.startingHand == 0) {
                tv2.setText("Cash: " + (GetterSetter.cash - GetterSetter.bet) + " ");
                tv3.setText("Place Bet: " + GetterSetter.bet + " ");
            }
            else {
                tv3.setText("Bet: " + GetterSetter.bet + " ");

                if(GetterSetter.playerScore <= 21) {
                    tv.setText("Player: " + GetterSetter.playerScore + " ");
                    tv1.setText("Dealer: " + GetterSetter.dealerScore + " ");
                    tv2.setText("Cash: " + (GetterSetter.cash - GetterSetter.bet) + " ");
                }
                if((GetterSetter.playerScore != 0) && (GetterSetter.playerScore > 21)) {
                    tv.setText("Bust!");
                    removeBet();
                    GetterSetter.isStanding = true;
                    seeker.setProgress(0);
                    GetterSetter.bet = 0;
                }

                if(GetterSetter.buttonPressed == 0) {
                    if(GetterSetter.dealerHit > 1) {
                        if((GetterSetter.dealerScore <= 17) && (GetterSetter.dealerScore != 0)) {
                            GetterSetter.playerScore = 0;
                            GetterSetter.dealerScore = 0;
                            GetterSetter.dealerHit++;
                            GetterSetter.buttonPressed = 1;
                        } else {
                            win();
                        }
                    }
                }
            }
            mHandler.postDelayed(this, 1);
        }
    };

    public void win() {
        if((GetterSetter.playerScore > GetterSetter.dealerScore) || (GetterSetter.dealerScore > 21)) {
            GetterSetter.cash = GetterSetter.cash + (GetterSetter.bet * 2);
            seeker.setProgress(0);
            GetterSetter.bet = 0;
            seeker.setMax(GetterSetter.cash);
        }
        else {
            removeBet();
        }
    }

    public void removeBet() {
        GetterSetter.cash = GetterSetter.cash - GetterSetter.bet;
        seeker.setProgress(0);
        GetterSetter.bet = 0;
        seeker.setMax(GetterSetter.cash);
    }

    public Cards[] shuffleDeck(Cards[] deck) {
        Random rand = new Random();
        Cards temp = new Cards(0,0);
        for(int shuffle = 0; shuffle < 52; shuffle++) {
            int randCard = rand.nextInt(52);
            temp = deck[randCard];
            deck[randCard] = deck[shuffle];
            deck[shuffle] = temp;
        }

        return deck;
    }

}
