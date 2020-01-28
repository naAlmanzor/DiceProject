package com.example.diceproject;

import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class DiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice);

        final TextView text=findViewById(R.id.textView);
        final Button roll=findViewById(R.id.button4);
        final Button d6=findViewById(R.id.button6);
        final Button d8=findViewById(R.id.button8);
        final Button d20=findViewById(R.id.button20);
        final TextView wow=findViewById(R.id.textView5);
        final TextView rolltxt=findViewById(R.id.textView4);
        final ImageView id6=findViewById(R.id.imageView2);
        final ImageView id8=findViewById(R.id.imageView8);
        final ImageView id20=findViewById(R.id.imageView);
        final TextView txt=findViewById(R.id.textView2);

        id6.setVisibility(View.GONE);
        id8.setVisibility(View.GONE);
        id20.setVisibility(View.GONE);

        wow.setText("FEELING LUCKY?");
        txt.setText("SELECT A DIE");
        roll.setText("ROLL");

        roll.setEnabled(false);

        d6.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               id6.setVisibility(View.VISIBLE);
               id8.setVisibility(View.GONE);
               id20.setVisibility(View.GONE);
               wow.setVisibility(View.GONE);
               txt.setText("I'M FEELING LUCKY");
               roll.setEnabled(true);
               roll.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       roll.setEnabled(false);
                       d6.setEnabled(false);
                       d8.setEnabled(false);
                       d20.setEnabled(false);
                       final Timer btime=new Timer();
                       btime.schedule(new TimerTask() {
                           @Override
                           public void run() {
                               runOnUiThread(new Runnable() {
                                   @Override
                                   public void run() {
                                       roll.setEnabled(true);
                                       d6.setEnabled(true);
                                       d8.setEnabled(true);
                                       d20.setEnabled(true);
                                   }
                               });
                           }
                       },2000);

                       int min=1;
                       int max=6;
                       int random= ThreadLocalRandom.current().nextInt(min,max+1);
                       text.setText(new StringBuilder().append(random));
                       rolltxt.setText("YOU ROLLED THE NUMBER");

                   }
               });
           }
        });

        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                id6.setVisibility(View.GONE);
                id8.setVisibility(View.VISIBLE);
                id20.setVisibility(View.GONE);
                wow.setVisibility(View.GONE);
                roll.setEnabled(true);
                roll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        roll.setEnabled(false);
                        d6.setEnabled(false);
                        d8.setEnabled(false);
                        d20.setEnabled(false);
                        final Timer btime=new Timer();
                        btime.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        roll.setEnabled(true);
                                        d6.setEnabled(true);
                                        d8.setEnabled(true);
                                        d20.setEnabled(true);
                                    }
                                });
                            }
                        },2000);

                        int min=1;
                        int max=8;
                        int random= ThreadLocalRandom.current().nextInt(min,max+1);
                        text.setText(new StringBuilder().append(random));
                        rolltxt.setText("YOU ROLLED THE NUMBER");

                    }
                });
            }
        });

        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                id6.setVisibility(View.GONE);
                id8.setVisibility(View.GONE);
                id20.setVisibility(View.VISIBLE);
                wow.setVisibility(View.GONE);
                roll.setEnabled(true);
                roll.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        roll.setEnabled(false);
                        d6.setEnabled(false);
                        d8.setEnabled(false);
                        d20.setEnabled(false);
                        final Timer btime=new Timer();
                        btime.schedule(new TimerTask() {
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        roll.setEnabled(true);
                                        d6.setEnabled(true);
                                        d8.setEnabled(true);
                                        d20.setEnabled(true);
                                    }
                                });
                            }
                        },2000);

                        int min=1;
                        int max=20;
                        int random= ThreadLocalRandom.current().nextInt(min,max+1);
                        text.setText(new StringBuilder().append(random));
                        rolltxt.setText("YOU ROLLED THE NUMBER");

                    }
                });
            }
        });
    }
}
