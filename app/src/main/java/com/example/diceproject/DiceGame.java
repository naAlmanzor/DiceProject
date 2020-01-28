package com.example.diceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class DiceGame extends AppCompatActivity {


    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicegame);

        final Button roll=findViewById(R.id.button5);
        final Button reset=findViewById(R.id.button);
        final TextView text=findViewById(R.id.textView7);
        final TextView rolltxt=findViewById(R.id.textView8);
        final TextView dscore=findViewById(R.id.textView9);
        final ImageView s1=findViewById(R.id.s1);
        final ImageView s2=findViewById(R.id.s2);
        final ImageView s3=findViewById(R.id.s3);
        final ImageView s4=findViewById(R.id.s4);
        final ImageView s5=findViewById(R.id.s5);
        final ImageView s6=findViewById(R.id.s6);


        rolltxt.setText("ROLL MINI-GAME");

        text.setText("AVOID THE NUMBER 6 TO GET THE HIGHEST SCORE POSSIBLE!");
        text.setTextSize(15);
        roll.setText("FEELING LUCKY!");

        s1.setVisibility(View.GONE);
        s2.setVisibility(View.GONE);
        s3.setVisibility(View.GONE);
        s4.setVisibility(View.GONE);
        s5.setVisibility(View.GONE);
        s6.setVisibility(View.GONE);

        reset.setVisibility(View.GONE);

        dscore.setText("SCORE: "+score);

            roll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int min = 1;
                    int max = 6;
                    int random = ThreadLocalRandom.current().nextInt(min, max + 1);

                    text.setText(new StringBuilder().append(random));
                    text.setTextSize(30);
                    roll.setText("ROLL AGAIN!");
                    rolltxt.setText("YOU ROLLED");
                    dscore.setText("SCORE: "+ (score+1));

                    if(random==1){
                        s1.setVisibility(View.VISIBLE);
                        s2.setVisibility(View.GONE);
                        s3.setVisibility(View.GONE);
                        s4.setVisibility(View.GONE);
                        s5.setVisibility(View.GONE);
                        s6.setVisibility(View.GONE);
                    }
                    else if (random==2) {
                        s1.setVisibility(View.GONE);
                        s2.setVisibility(View.VISIBLE);
                        s3.setVisibility(View.GONE);
                        s4.setVisibility(View.GONE);
                        s5.setVisibility(View.GONE);
                        s6.setVisibility(View.GONE);
                    }
                    else if (random==3) {
                        s1.setVisibility(View.GONE);
                        s2.setVisibility(View.GONE);
                        s3.setVisibility(View.VISIBLE);
                        s4.setVisibility(View.GONE);
                        s5.setVisibility(View.GONE);
                        s6.setVisibility(View.GONE);
                    }
                    else if (random==4) {
                        s1.setVisibility(View.GONE);
                        s2.setVisibility(View.GONE);
                        s3.setVisibility(View.GONE);
                        s4.setVisibility(View.VISIBLE);
                        s5.setVisibility(View.GONE);
                        s6.setVisibility(View.GONE);
                    }
                    else if (random==5) {
                        s1.setVisibility(View.GONE);
                        s2.setVisibility(View.GONE);
                        s3.setVisibility(View.GONE);
                        s4.setVisibility(View.GONE);
                        s5.setVisibility(View.VISIBLE);
                        s6.setVisibility(View.GONE);
                    }
                    else if (random==6) {
                        s1.setVisibility(View.GONE);
                        s2.setVisibility(View.GONE);
                        s3.setVisibility(View.GONE);
                        s4.setVisibility(View.GONE);
                        s5.setVisibility(View.GONE);
                        s6.setVisibility(View.VISIBLE);
                    }

                    if(random==max){
                        roll.setEnabled(false);
                        roll.setText("");
                        reset.setVisibility(View.VISIBLE);
                        reset.setText("RE-ROLL");
                        reset.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent restart=getIntent();
                                finish();
                                startActivity(restart);
                                reset.setEnabled(false);
                            }
                        });
                    }
                    else{
                        roll.setEnabled(true);
                        score++;
                    }

                }
            });






    }

}
