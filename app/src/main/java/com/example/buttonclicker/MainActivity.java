package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up instance variable bc its usually in this
        // not like an actual constructor
        timesClicked = 0;

        // wiring widgets link the xml to java
        buttonClickerButton = findViewById(R.id.button_main_clicker);

        textViewScore = findViewById(R.id.textview_main_score);

        constraintLayout = findViewById(R.id.contraint_layout_main);;
    }

    public void onClickerClicks(View view) {
        if(timesClicked % 15 == 0) {
            Toast.makeText(this, "Congrats bro. You clicked the bro.", Toast.LENGTH_LONG).show();
        }
        if(timesClicked == 68)
        {
            Toast.makeText(this, "Nice.", Toast.LENGTH_LONG).show();
        }
        // increase times clicked
        timesClicked++;

        // show the value
        textViewScore.setText("Score: " + timesClicked);

        changeBackgroundColor();
    }

    private void changeBackgroundColor() {
         int r = (int)(Math.random() * 256);
         int g = (int)(Math.random() * 256);
         int b = (int)(Math.random() * 256);
         int color = Color.rgb(r, g, b);

         constraintLayout.setBackgroundColor(color);

         textViewScore.setTextColor(Color.rgb(255 - r, 255 - g, 255 - b));
    }
}