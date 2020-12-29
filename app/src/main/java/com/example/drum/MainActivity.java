package com.example.drum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.skyfishjy.library.RippleBackground;

import static android.view.animation.AnimationUtils.loadAnimation;

public class MainActivity extends AppCompatActivity {


    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView seven;
    private ImageView eight;
    private ImageView nine;
    private RippleBackground ripple;
    private ConstraintLayout layout;

    MediaPlayer songone,songtwo,songthree,songfour,songfive,songsix,songseven,songeight,songnine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        ripple=findViewById(R.id.ripple);
        layout=findViewById(R.id.layout);

        songone=MediaPlayer.create(getApplicationContext(),R.raw.sound00);
        songtwo=MediaPlayer.create(getApplicationContext(),R.raw.sound1);
        songthree=MediaPlayer.create(getApplicationContext(),R.raw.sound2);
        songfour=MediaPlayer.create(getApplicationContext(),R.raw.sound3);
        songfive=MediaPlayer.create(getApplicationContext(),R.raw.sound4);
        songseven= MediaPlayer.create(getApplicationContext(),R.raw.sound5);
        songsix=MediaPlayer.create(getApplicationContext(),R.raw.sound7);
        songeight=MediaPlayer.create(getApplicationContext(),R.raw.sound8);
        songnine=MediaPlayer.create(getApplicationContext(),R.raw.sound9);


       final Animation anim= loadAnimation(getApplicationContext(),R.anim.zoom);

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                    one.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.red));


                    songone.start();}catch(Exception e){

                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                two.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.blue));

                songtwo.start();}catch (Exception e)
                {

                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{

                three.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.green));
                songthree.start();}catch (Exception e){

                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                four.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.yellow));

                songfour.start();}catch (Exception e){

                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                five.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.greenes));

                songfive.start();}catch (Exception e){

                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                six.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.pink));

                songseven.start();}catch (Exception e){

                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                seven.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.brown));

                songeight.start();}catch (Exception e){

                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try {
                eight.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.abstruc));

                songsix.start();}catch (Exception e){

                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                try{
                nine.startAnimation(anim);
                    ripple.startRippleAnimation();
                    layout.setBackgroundColor(getResources().getColor(R.color.brownred));

                songnine.start();}catch (Exception e){

                }
            }
        });
        ripple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ripple.stopRippleAnimation();
            }
        });


    }

    public void timer(int time)
    {
        int count=0;
        while(time>0)
        {
            count+=1;
        }
    }
}