package com.example.diceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button dnd=findViewById(R.id.button2);
        final Button dg=findViewById(R.id.button3);
        TextView txt=findViewById(R.id.textView3);

        txt.setText("DICE");
        dnd.setText("ROLL");
        dnd.setTextColor(Color.parseColor("#612929"));
        dg.setText("MINI-GAME");
        dg.setTextColor(Color.parseColor("#612929"));


        dnd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,DiceActivity.class);
                        startActivity(intent);
                    }
                }
        );
        dg.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this,DiceGame.class);
                        startActivity(intent);
                    }
                }
        );

    }


}
