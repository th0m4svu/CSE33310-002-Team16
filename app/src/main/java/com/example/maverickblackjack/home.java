package com.example.maverickblackjack;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.testingstuff.MainActivity;
//com.example.testingstuff.MainActivity Testingstuff = new com.example.testingstuff.MainActivity()

public class home extends AppCompatActivity {

    Button playbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Maps button to send you to login screen-BEGIN
        playbutton = findViewById(R.id.play);
        playbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent play = new Intent (getApplicationContext(), MainActivity.class);
                startActivity(play);
            }
        });
    }
}