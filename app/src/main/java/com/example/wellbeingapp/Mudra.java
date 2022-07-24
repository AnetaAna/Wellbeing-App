package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Mudra extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 900000;

    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;

    private CountDownTimer mCountDownTimer;

    private boolean mTimerRunning;

    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;

    private MediaPlayer sound;
    private MediaPlayer sound_two;
    private MediaPlayer sound_three;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mudra);


        TextView about = findViewById(R.id.mudraAbout);
        TextView name = findViewById((R.id.mudraName));
        ImageView picture = findViewById(R.id.mudraImage);
        Intent newIntent = getIntent();

        /* get intent and set the right description and image of mudra depending on the click from the activity Meditation */

        int intValue = newIntent.getIntExtra("about", 0);
        if (intValue == 0) {
            about.setText("No text!");
            name.setText("No text!");
            picture.setImageDrawable(getDrawable(R.drawable.prana));

        } else if
        (intValue == (R.id.prana)) {
            about.setText(R.string.prana_about);
            name.setText(R.string.prana_name);
            picture.setImageDrawable(getDrawable(R.drawable.prana));

        } else if
        (intValue == (R.id.dhyana)) {
            about.setText(R.string.dhyana_about);
            name.setText(R.string.dhyana_name);
            picture.setImageDrawable(getDrawable(R.drawable.dhyana));

        } else if
        (intValue == (R.id.shuni)) {
            about.setText(R.string.shuni_about);
            name.setText(R.string.shuni_name);
            picture.setImageDrawable(getDrawable(R.drawable.shuni));

        } else if
        (intValue == (R.id.gyana)) {
            about.setText(R.string.gyana_about);
            name.setText(R.string.gyana_name);
            picture.setImageDrawable(getDrawable(R.drawable.gyana));

        } else if
        (intValue == (R.id.anjali)) {
            about.setText(R.string.anjali_about);
            name.setText(R.string.anjali_name);
            picture.setImageDrawable(getDrawable(R.drawable.anjali));

        }

        /* set the right music from raw folder to buttons and make them play or pause on click */

        Button japan = (Button) findViewById(R.id.japan);
        MediaPlayer sound = MediaPlayer.create(this, R.raw.japanese);
        japan.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                if (sound.isPlaying() == true)
                    sound.pause();      // Pause the music player
                else
                    sound.start();      // Resume the music player

            }
        });

        Button tibet = (Button) findViewById(R.id.tibet);
        MediaPlayer sound_two = MediaPlayer.create(this, R.raw.tibetan);
        tibet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                sound_two.setLooping(true);

                if (sound_two.isPlaying() == true)
                    sound_two.pause();
                else
                    sound_two.start();


            }
        });


        Button india = (Button) findViewById(R.id.india);
        MediaPlayer sound_three = MediaPlayer.create(this, R.raw.indian);
        india.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                sound_three.setLooping(true);

                if (sound_three.isPlaying() == true)
                    sound_three.pause();
                else
                    sound_three.start();

            }
        });



            /* create countdown timer for 15 minutes with start/pause and reset buttons */

            mTextViewCountDown = findViewById(R.id.text_view_countdown);

            mButtonStartPause = findViewById(R.id.button_start_pause);
            mButtonReset = findViewById(R.id.button_reset);

            mButtonStartPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTimerRunning) {
                        pauseTimer();
                    } else {
                        startTimer();
                    }
                }
            });


            mButtonReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetTimer();
                }
            });

            updateCountDownText();
        }

        private void startTimer() {
            mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    mTimeLeftInMillis = millisUntilFinished;
                    updateCountDownText();
                }

                @Override
                public void onFinish() {
                    mTimerRunning = false;
                    mButtonStartPause.setText("Start");     // button "Start"/"Pause" changes text according to its function
                    mButtonStartPause.setVisibility(View.INVISIBLE);
                    mButtonReset.setVisibility(View.VISIBLE);
                    final MediaPlayer alert = MediaPlayer.create(Mudra.this, R.raw.bell);
                    alert.start();


                }
            }.start();

            mTimerRunning = true;
            mButtonStartPause.setText("Pause");
            mButtonReset.setVisibility(View.INVISIBLE);
        }

        private void pauseTimer() {
            mCountDownTimer.cancel();
            mTimerRunning = false;
            mButtonStartPause.setText("Start");
            mButtonReset.setVisibility(View.VISIBLE);       // button "reset" appears only after pausing the timer
        }

        private void resetTimer() {
            mTimeLeftInMillis = START_TIME_IN_MILLIS;
            updateCountDownText();
            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setVisibility(View.VISIBLE);
        }

        private void updateCountDownText() {
            int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
            int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

            String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

            mTextViewCountDown.setText(timeLeftFormatted);
        }

    /* stop background music if back button is pressed */

    @Override
    public void onBackPressed(){

        try {

        if (sound.isPlaying()){
            sound.stop();
            sound.release();
        }  else if (sound_two.isPlaying()) {
            sound_two.stop();
            sound_two.release();
        } else if (sound_three.isPlaying()) {
            sound_three.stop();
            sound_three.release();
        }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

}






