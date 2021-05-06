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

//import com.example.testingstuff.gameactivity;
=======
//import com.example.testingstuff.MainActivity;
>>>>>>> e8ce25a9cfb579a79b4a173763fdc485fbda9b0b
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