package com.example.testingstuff;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Panel extends SurfaceView implements SurfaceHolder.Callback {
    int localScore;
    Paint paint;
    private CanvasThread canvasthread;
    CardDraw currentDraw;

    public Panel(Context context, AttributeSet attrs) {
        super(context, attrs);
        getHolder().addCallback(this);
        canvasthread = new CanvasThread(getHolder(), this);
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

        if(GetterSetter.startingHand == 0) {}
        else {
            // Dealer Hand
            for(int i = 0; i <= 1; i++) {
                if((i == 0) && (GetterSetter.dealerHit < 3)) {
                    currentDraw.deal(canvas, 501, 80 * i, -600);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, -600);
                }

                if (GetterSetter.buttonPressed == 1) {
                    score(i, true, false);
                }
            }

            // Player Hand
            for(int i = 2; i <= GetterSetter.hit; i++) {
                if(i == GetterSetter.hit) {
                    if(GetterSetter.fly < 81) {
                        GetterSetter.fly = GetterSetter.fly + 4;
                        GetterSetter.vertfly = GetterSetter.vertfly - 20;
                    }
                    if(GetterSetter.vertfly < 0) {
                        GetterSetter.vertfly = 0;
                    }
                    currentDraw.deal(canvas, i, GetterSetter.fly * i, 0);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, 0);
                }
                if(GetterSetter.buttonPressed == 1) {
                    score(i, false, true);
                }
            }

            for(int i = GetterSetter.hit + 1; i <= GetterSetter.dealerHit; i++) {
                if(i > 2) {
                    currentDraw.deal(canvas, i, 80 * (i - (GetterSetter.hit - 1)), -600);
                }
                else {
                    currentDraw.deal(canvas, i, 80 * i, -600);
                }
                if(GetterSetter.buttonPressed == 1) {
                    score(i, true, false);
                }
            }

            GetterSetter.buttonPressed = 0;
        }
    }

    public void score(int i, boolean dealer, boolean player) {
        if((i == 0) && GetterSetter.dealerHit < 3) {
            localScore = 0;
        }
        else {
            if (GetterSetter.card[i].value == 12) {
                if (player) {
                    if (GetterSetter.playerScore > 10) {
                        localScore = 1;
                    } else {
                        localScore = 11;
                    }
                }
                if (dealer) {
                    if (GetterSetter.dealerScore > 10) {
                        localScore = 1;
                    } else {
                        localScore = 11;
                    }
                }
            } else if ((GetterSetter.card[i].value >= 8) && (GetterSetter.card[i].value < 12)) {
                localScore = 10;
            } else {
                localScore = GetterSetter.card[i].value + 2;
            }

            if (player) {
                GetterSetter.playerScore = GetterSetter.playerScore + localScore;
            }
            if (dealer) {
                GetterSetter.dealerScore = GetterSetter.dealerScore + localScore;
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
