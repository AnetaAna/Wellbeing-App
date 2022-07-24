package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Mindfulness extends AppCompatActivity {


private MediaPlayer music;
private MediaPlayer music2;
private MediaPlayer music3;
private MediaPlayer music4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindfulness);

        /* set the right music from raw folder to switch buttons and make them play and pause on check */

        Switch wind = (Switch) this.findViewById(R.id.wind);
        MediaPlayer music = MediaPlayer.create(this, R.raw.wind);
        wind.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {


                if (isChecked) {
                    music.start();
                } else {
                    music.pause();
                }

            }
        });

        Switch birds = (Switch) this.findViewById(R.id.birds);
        MediaPlayer music2 = MediaPlayer.create(this, R.raw.birds);
        birds.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {

                if (isChecked) {
                    music2.start();
                } else {
                    music2.pause();
                }
            }
        });

        Switch stream = (Switch) this.findViewById(R.id.stream);
        MediaPlayer music3 = MediaPlayer.create(this, R.raw.stream);
        stream.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {

                if (isChecked) {
                    music3.start();
                } else {
                    music3.pause();
                }
            }
        });

        Switch rain = (Switch) this.findViewById(R.id.rain);
        MediaPlayer music4 = MediaPlayer.create(this, R.raw.rain);
        rain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {

                if (isChecked) {
                    music4.start();
                } else {
                    music4.pause();
                }
            }
        });
    }

    /* stop background music if back button is pressed */

        @Override
        public void onBackPressed() {

            if (music.isPlaying()) {
                music.stop();
                music.release();
            } else if (music2.isPlaying()) {
                music2.stop();
                music2.release();
            } else if (music3.isPlaying()) {
                music3.stop();
                music3.release();
            } else if (music4.isPlaying()) {
                music4.stop();
                music4.release();
            }
    }
}



