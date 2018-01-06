package com.xi.emma.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        //R refers to recourse
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceArray = {R.drawable.dice1,
                           R.drawable.dice2,
                           R.drawable.dice3,
                           R.drawable.dice4,
                           R.drawable.dice5,
                           R.drawable.dice6
        };


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //dot d means this is a debug message
//                Log.d("Dice", "The button has been pressed");

                Random randomNumberGenerator = new Random();
                //since we want to generate num between 0 to 5
                int number = randomNumberGenerator.nextInt(6);
//                Log.d("Dice", "The random number is " + number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
