package com.example.maverickblackjack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.testingstuff.CanvasThread;
import com.example.testingstuff.CardDraw;
import com.example.testingstuff.GetterSetter;

public class Panel extends SurfaceView implements SurfaceHolder.Callback {
    int localScore;
    Paint paint;
    private com.example.testingstuff.CanvasThread canvasthread;
    com.example.testingstuff.CardDraw currentDraw;

    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        getHolder().addCallback(this);
        canvasthread = new com.example.testingstuff.CanvasThread(getHolder(), this);
        setFocusable(true);
        paint = new Paint();
        currentDraw = new CardDraw(context);
    }

    public Panel(Context context) {
        super(context);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
        setFocusable(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(Color.BLACK);

        if(com.example.testingstuff.GetterSetter.startingHand == 0) {}
        else {
            // Dealer Hand
            for(int i = 0; i <= 1; i++) {
                if((i == 0) && (com.example.testingstuff.GetterSetter.dealerHit < 3)) {
                    currentDraw.deal(canvas, 501, 80 * i, -600);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, -600);
                }

                if (com.example.testingstuff.GetterSetter.buttonPressed == 1) {
                    score(i, true, false);
                }
            }

            // Player Hand
            for(int i = 2; i <= com.example.testingstuff.GetterSetter.hit; i++) {
                if(i == com.example.testingstuff.GetterSetter.hit) {
                    if(com.example.testingstuff.GetterSetter.fly < 81) {
                        com.example.testingstuff.GetterSetter.fly = com.example.testingstuff.GetterSetter.fly + 4;
                        com.example.testingstuff.GetterSetter.vertfly = com.example.testingstuff.GetterSetter.vertfly - 20;
                    }
                    if(com.example.testingstuff.GetterSetter.vertfly < 0) {
                        com.example.testingstuff.GetterSetter.vertfly = 0;
                    }
                    currentDraw.deal(canvas, i, com.example.testingstuff.GetterSetter.fly * i, 0);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, 0);
                }
                if(com.example.testingstuff.GetterSetter.buttonPressed == 1) {
                    score(i, false, true);
                }
            }

            for(int i = com.example.testingstuff.GetterSetter.hit + 1; i <= com.example.testingstuff.GetterSetter.dealerHit; i++) {
                if(i > 2) {
                    currentDraw.deal(canvas, i, 80 * (i - (com.example.testingstuff.GetterSetter.hit - 1)), -600);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, -600);
                }
                if(com.example.testingstuff.GetterSetter.buttonPressed == 1) {
                    score(i, true, false);
                }
            }

            com.example.testingstuff.GetterSetter.buttonPressed = 0;
        }
    }

    public void score(int i, boolean dealer, boolean player) {
        if((i == 0) && com.example.testingstuff.GetterSetter.dealerHit < 3) {
            localScore = 0;
        }
        else {
            if (com.example.testingstuff.GetterSetter.card[i].value == 12) {
                if (player) {
                    if (com.example.testingstuff.GetterSetter.playerScore > 10) {
                        localScore = 1;
                    } else {
                        localScore = 11;
                    }
                }
                if (dealer) {
                    if (com.example.testingstuff.GetterSetter.dealerScore > 10) {
                        localScore = 1;
                    } else {
                        localScore = 11;
                    }
                }
            } else if ((com.example.testingstuff.GetterSetter.card[i].value >= 8) && (com.example.testingstuff.GetterSetter.card[i].value < 12)) {
                localScore = 10;
            } else {
                localScore = com.example.testingstuff.GetterSetter.card[i].value + 2;
            }

            if (player) {
                com.example.testingstuff.GetterSetter.playerScore = com.example.testingstuff.GetterSetter.playerScore + localScore;
            }
            if (dealer) {
                com.example.testingstuff.GetterSetter.dealerScore = GetterSetter.dealerScore + localScore;
            }
        }
    }

    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    public void surfaceCreated(SurfaceHolder holder) {
        canvasthread.setRunning(true);
        canvasthread.start();
    }

    public void surfaceDestroyed(SurfaceHolder holder) {
        boolean retry = true;
        canvasthread.setRunning(false);
        while(retry) {
            try {
                canvasthread.join();
                retry = false;
            } catch(InterruptedException e) {}
        }
    }
}
