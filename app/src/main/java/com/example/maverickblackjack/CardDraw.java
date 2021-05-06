package com.example.maverickblackjack;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.example.testingstuff.GetterSetter;

public class CardDraw {
    int x, y;
    Bitmap redback;
    Bitmap twoclubs, twodiamonds, twohearts, twospades;
    Bitmap threeclubs, threediamonds, threehearts, threespades;
    Bitmap fourclubs, fourdiamonds, fourhearts, fourspades;
    Bitmap fiveclubs, fivediamonds, fivehearts, fivespades;
    Bitmap sixclubs, sixdiamonds, sixhearts, sixspades;
    Bitmap sevenclubs, sevendiamonds, sevenhearts, sevenspades;
    Bitmap eightclubs, eightdiamonds, eighthearts, eightspades;
    Bitmap nineclubs, ninediamonds, ninehearts, ninespades;
    Bitmap tenclubs, tendiamonds, tenhearts, tenspades;
    Bitmap jackclubs, jackdiamonds, jackhearts, jackspades;
    Bitmap queenclubs, queendiamonds, queenhearts, queenspades;
    Bitmap kingclubs, kingdiamonds, kinghearts, kingspades;
    Bitmap aceclubs, acediamonds, acehearts, acespades;
    
    public CardDraw(Context context) {
        redback = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.redback);
        redback = Bitmap.createScaledBitmap(redback, redback.getWidth()/4, redback.getHeight()/4, false);

        twoclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.twoclubs);
        twoclubs = Bitmap.createScaledBitmap(twoclubs, twoclubs.getWidth()/4, twoclubs.getHeight()/4, false);
        twodiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.twodiamonds);
        twodiamonds = Bitmap.createScaledBitmap(twodiamonds, twoclubs.getWidth()/4, twodiamonds.getHeight()/4, false);
        twohearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.twohearts);
        twohearts = Bitmap.createScaledBitmap(twohearts, twohearts.getWidth()/4, twohearts.getHeight()/4, false);
        twospades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.twospades);
        twospades = Bitmap.createScaledBitmap(twospades, twospades.getWidth()/4, twospades.getHeight()/4, false);

        threeclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.threeclubs);
        threeclubs = Bitmap.createScaledBitmap(threeclubs, threeclubs.getWidth()/4, threeclubs.getHeight()/4, false);
        threediamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.threediamonds);
        threediamonds = Bitmap.createScaledBitmap(threediamonds, threediamonds.getWidth()/4, threediamonds.getHeight()/4, false);
        threehearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.threehearts);
        threehearts = Bitmap.createScaledBitmap(threehearts, threehearts.getWidth()/4, threehearts.getHeight()/4, false);
        threespades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.threespades);
        threespades = Bitmap.createScaledBitmap(threespades, threespades.getWidth()/4, threespades.getHeight()/4, false);

        fourclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fourclubs);
        fourclubs = Bitmap.createScaledBitmap(fourclubs, fourclubs.getWidth()/4, fourclubs.getHeight()/4, false);
        fourdiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fourdiamonds);
        fourdiamonds = Bitmap.createScaledBitmap(fourdiamonds, fourdiamonds.getWidth()/4, fourdiamonds.getHeight()/4, false);
        fourhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fourhearts);
        fourhearts = Bitmap.createScaledBitmap(fourhearts, fourhearts.getWidth()/4, fourhearts.getHeight()/4, false);
        fourspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fourspades);
        fourspades = Bitmap.createScaledBitmap(fourspades, fourspades.getWidth()/4, fourspades.getHeight()/4, false);

        fiveclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fiveclubs);
        fiveclubs = Bitmap.createScaledBitmap(fiveclubs, fiveclubs.getWidth()/4, fiveclubs.getHeight()/4, false);
        fivediamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fivediamonds);
        fivediamonds = Bitmap.createScaledBitmap(fivediamonds, fivediamonds.getWidth()/4, fivediamonds.getHeight()/4, false);
        fivehearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fivehearts);
        fivehearts = Bitmap.createScaledBitmap(fivehearts, fivehearts.getWidth()/4, fivehearts.getHeight()/4, false);
        fivespades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.fivespades);
        fivespades = Bitmap.createScaledBitmap(fivespades, fivespades.getWidth()/4, fivespades.getHeight()/4, false);

        sixclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sixclubs);
        sixclubs = Bitmap.createScaledBitmap(sixclubs, sixclubs.getWidth()/4, sixclubs.getHeight()/4, false);
        sixdiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sixdiamonds);
        sixdiamonds = Bitmap.createScaledBitmap(sixdiamonds, sixdiamonds.getWidth()/4, sixdiamonds.getHeight()/4, false);
        sixhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sixhearts);
        sixhearts = Bitmap.createScaledBitmap(sixhearts, sixhearts.getWidth()/4, sixhearts.getHeight()/4, false);
        sixspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sixspades);
        sixspades = Bitmap.createScaledBitmap(sixspades, sixspades.getWidth()/4, sixspades.getHeight()/4, false);

        sevenclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sevenclubs);
        sevenclubs = Bitmap.createScaledBitmap(sevenclubs, sevenclubs.getWidth()/4, sevenclubs.getHeight()/4, false);
        sevendiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sevendiamonds);
        sevendiamonds = Bitmap.createScaledBitmap(sevendiamonds, sevendiamonds.getWidth()/4, sevendiamonds.getHeight()/4, false);
        sevenhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sevenhearts);
        sevenhearts = Bitmap.createScaledBitmap(sevenhearts, sevenhearts.getWidth()/4, sevenhearts.getHeight()/4, false);
        sevenspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.sevenspades);
        sevenspades = Bitmap.createScaledBitmap(sevenspades, sevenspades.getWidth()/4, sevenspades.getHeight()/4, false);

        eightclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.eightclubs);
        eightclubs = Bitmap.createScaledBitmap(eightclubs, eightclubs.getWidth()/4, eightclubs.getHeight()/4, false);
        eightdiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.eightdiamonds);
        eightdiamonds = Bitmap.createScaledBitmap(eightdiamonds, eightdiamonds.getWidth()/4, eightdiamonds.getHeight()/4, false);
        eighthearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.eighthearts);
        eighthearts = Bitmap.createScaledBitmap(eighthearts, eighthearts.getWidth()/4, eighthearts.getHeight()/4, false);
        eightspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.eightspades);
        eightspades = Bitmap.createScaledBitmap(eightspades, eightspades.getWidth()/4, eightspades.getHeight()/4, false);

        nineclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.nineclubs);
        nineclubs = Bitmap.createScaledBitmap(nineclubs, nineclubs.getWidth()/4, nineclubs.getHeight()/4, false);
        ninediamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.ninediamonds);
        ninediamonds = Bitmap.createScaledBitmap(ninediamonds, ninediamonds.getWidth()/4, ninediamonds.getHeight()/4, false);
        ninehearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.ninehearts);
        ninehearts = Bitmap.createScaledBitmap(ninehearts, ninehearts.getWidth()/4, ninehearts.getHeight()/4, false);
        ninespades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.ninespades);
        ninespades = Bitmap.createScaledBitmap(ninespades, ninespades.getWidth()/4, ninespades.getHeight()/4, false);

        tenclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.tenclubs);
        tenclubs = Bitmap.createScaledBitmap(tenclubs, tenclubs.getWidth()/4, tenclubs.getHeight()/4, false);
        tendiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.tendiamonds);
        tendiamonds = Bitmap.createScaledBitmap(tendiamonds, tendiamonds.getWidth()/4, tendiamonds.getHeight()/4, false);
        tenhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.tenhearts);
        tenhearts = Bitmap.createScaledBitmap(tenhearts, tenhearts.getWidth()/4, tenhearts.getHeight()/4, false);
        tenspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.tenspades);
        tenspades = Bitmap.createScaledBitmap(tenspades, tenspades.getWidth()/4, tenspades.getHeight()/4, false);

        jackclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.jackclubs);
        jackclubs = Bitmap.createScaledBitmap(jackclubs, jackclubs.getWidth()/4, jackclubs.getHeight()/4, false);
        jackdiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.jackdiamonds);
        jackdiamonds = Bitmap.createScaledBitmap(jackdiamonds, jackdiamonds.getWidth()/4, jackdiamonds.getHeight()/4, false);
        jackhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.jackhearts);
        jackhearts = Bitmap.createScaledBitmap(jackhearts, jackhearts.getWidth()/4, jackhearts.getHeight()/4, false);
        jackspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.jackspades);
        jackspades = Bitmap.createScaledBitmap(jackspades, jackspades.getWidth()/4, jackspades.getHeight()/4, false);

        queenclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.queenclubs);
        queenclubs = Bitmap.createScaledBitmap(queenclubs, queenclubs.getWidth()/4, queenclubs.getHeight()/4, false);
        queendiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.queendiamonds);
        queendiamonds = Bitmap.createScaledBitmap(queendiamonds, queendiamonds.getWidth()/4, queendiamonds.getHeight()/4, false);
        queenhearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.queenhearts);
        queenhearts = Bitmap.createScaledBitmap(queenhearts, queenhearts.getWidth()/4, queenhearts.getHeight()/4, false);
        queenspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.queenspades);
        queenspades = Bitmap.createScaledBitmap(queenspades, queenspades.getWidth()/4, queenspades.getHeight()/4, false);

        kingclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.kingclubs);
        kingclubs = Bitmap.createScaledBitmap(kingclubs, kingclubs.getWidth()/4, kingclubs.getHeight()/4, false);
        kingdiamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.kingdiamonds);
        kingdiamonds = Bitmap.createScaledBitmap(kingdiamonds, kingdiamonds.getWidth()/4, kingdiamonds.getHeight()/4, false);
        kinghearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.kinghearts);
        kinghearts = Bitmap.createScaledBitmap(kinghearts, kinghearts.getWidth()/4, kinghearts.getHeight()/4, false);
        kingspades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.kingspades);
        kingspades = Bitmap.createScaledBitmap(kingspades, kingspades.getWidth()/4, kingspades.getHeight()/4, false);

        aceclubs = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.aceclubs);
        aceclubs = Bitmap.createScaledBitmap(aceclubs, aceclubs.getWidth()/4, aceclubs.getHeight()/4, false);
        acediamonds = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.acediamonds);
        acediamonds = Bitmap.createScaledBitmap(acediamonds, acediamonds.getWidth()/4, acediamonds.getHeight()/4, false);
        acehearts = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.acehearts);
        acehearts = Bitmap.createScaledBitmap(acehearts, acehearts.getWidth()/4, acehearts.getHeight()/4, false);
        acespades = BitmapFactory.decodeResource(context.getResources(), com.example.testingstuff.R.drawable.acespades);
        acespades = Bitmap.createScaledBitmap(acespades, acespades.getWidth()/4, acespades.getHeight()/4, false);
    }

    public void getCanvasDimensions(Canvas canvas) {
        x = canvas.getWidth();
        y = canvas.getHeight();
    }

    public void deal(Canvas canvas, int cardNum, int xdistance, int ydistance) {
        getCanvasDimensions(canvas);
        // Dealer card down
        if(cardNum == 501) {
            canvas.drawBitmap(redback, ((x/2) - 500) + xdistance, (y/2) + ydistance, null);
        }
        else {
            if (GetterSetter.card[cardNum].suit == 0) {
                if (GetterSetter.card[cardNum].value == 0) {
                    canvas.drawBitmap(twoclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 1) {
                    canvas.drawBitmap(threeclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 2) {
                    canvas.drawBitmap(fourclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 3) {
                    canvas.drawBitmap(fiveclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 4) {
                    canvas.drawBitmap(sixclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 5) {
                    canvas.drawBitmap(sevenclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 6) {
                    canvas.drawBitmap(eightclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 7) {
                    canvas.drawBitmap(nineclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 8) {
                    canvas.drawBitmap(tenclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 9) {
                    canvas.drawBitmap(jackclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 10) {
                    canvas.drawBitmap(queenclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 11) {
                    canvas.drawBitmap(kingclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 12) {
                    canvas.drawBitmap(aceclubs, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }
            if (GetterSetter.card[cardNum].suit == 1) {
                if (GetterSetter.card[cardNum].value == 0) {
                    canvas.drawBitmap(twodiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 1) {
                    canvas.drawBitmap(threediamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 2) {
                    canvas.drawBitmap(fourdiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 3) {
                    canvas.drawBitmap(fivediamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 4) {
                    canvas.drawBitmap(sixdiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 5) {
                    canvas.drawBitmap(sevendiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 6) {
                    canvas.drawBitmap(eightdiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 7) {
                    canvas.drawBitmap(ninediamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 8) {
                    canvas.drawBitmap(tendiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 9) {
                    canvas.drawBitmap(jackdiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 10) {
                    canvas.drawBitmap(queendiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 11) {
                    canvas.drawBitmap(kingdiamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 12) {
                    canvas.drawBitmap(acediamonds, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }
            if (GetterSetter.card[cardNum].suit == 2) {
                if (GetterSetter.card[cardNum].value == 0) {
                    canvas.drawBitmap(twohearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 1) {
                    canvas.drawBitmap(threehearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 2) {
                    canvas.drawBitmap(fourhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 3) {
                    canvas.drawBitmap(fivehearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 4) {
                    canvas.drawBitmap(sixhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 5) {
                    canvas.drawBitmap(sevenhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 6) {
                    canvas.drawBitmap(eighthearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 7) {
                    canvas.drawBitmap(ninehearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 8) {
                    canvas.drawBitmap(tenhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 9) {
                    canvas.drawBitmap(jackhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 10) {
                    canvas.drawBitmap(queenhearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 11) {
                    canvas.drawBitmap(kinghearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 12) {
                    canvas.drawBitmap(acehearts, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }
            if (GetterSetter.card[cardNum].suit == 3) {
                if (GetterSetter.card[cardNum].value == 0) {
                    canvas.drawBitmap(twospades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 1) {
                    canvas.drawBitmap(threespades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 2) {
                    canvas.drawBitmap(fourspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 3) {
                    canvas.drawBitmap(fivespades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 4) {
                    canvas.drawBitmap(sixspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 5) {
                    canvas.drawBitmap(sevenspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 6) {
                    canvas.drawBitmap(eightspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 7) {
                    canvas.drawBitmap(ninespades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 8) {
                    canvas.drawBitmap(tenspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 9) {
                    canvas.drawBitmap(jackspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 10) {
                    canvas.drawBitmap(queenspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 11) {
                    canvas.drawBitmap(kingspades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
                if (GetterSetter.card[cardNum].value == 12) {
                    canvas.drawBitmap(acespades, ((x / 2) - 500) + xdistance, (y / 2) + ydistance, null);
                }
            }
        }
    }
}
