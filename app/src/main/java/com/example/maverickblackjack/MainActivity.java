package com.example.maverickblackjack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button underAge;
    Button ofAge;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Maps button to push a toast notification-BEGIN
        underAge = findViewById(R.id.underAge);
        underAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Please get an adult/guardian!",Toast.LENGTH_SHORT).show();
            }
        });
        //Maps button to push a toast notification-END


        //Maps button to send you to login screen-BEGIN
        ofAge = findViewById(R.id.ofAge);
        ofAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent (getApplicationContext(),Login.class);
                startActivity(login);
            }
        });
        //Maps button to send you to login screen-END

    }
}