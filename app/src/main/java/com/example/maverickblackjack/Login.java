package com.example.maverickblackjack;

<<<<<<< HEAD
=======
import androidx.appcompat.app.AppCompatActivity;

>>>>>>> e8ce25a9cfb579a79b4a173763fdc485fbda9b0b
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD

import androidx.appcompat.app.AppCompatActivity;
=======
>>>>>>> e8ce25a9cfb579a79b4a173763fdc485fbda9b0b

public class Login extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Maps button to send you to login screen-BEGIN
        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent (getApplicationContext(),home.class);
                startActivity(home);
            }
        });
    }
}