package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import pl.droidsonroids.gif.GifImageView;

public class Exercise extends AppCompatActivity {


    private Button mButtonStart;
    private Button mButtonTime;
    private boolean mTimerRunning;
    private static final long START_TIME_IN_MILLIS = 60000;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private CountDownTimer mCountDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);


        TextView description = findViewById(R.id.description);
        GifImageView gif = findViewById(R.id.gif);
        Intent newIntent = getIntent();


        /* get intent and set the right description and image of exercise depending on the click from the activity Workout */

        int intValue = newIntent.getIntExtra("about", 0);
        if (intValue == 0) {
            description.setText("No text!");

        } else if
        (intValue == (R.id.pose1)) {
            description.setText(R.string.mountain);
            gif.setImageResource(R.drawable.exersice_1);

        } else if
        (intValue == (R.id.pose2)) {
            description.setText(R.string.crunches);
            gif.setImageResource(R.drawable.exersice_2);

        } else if
        (intValue == (R.id.pose3)) {
            description.setText(R.string.bench);
            gif.setImageResource(R.drawable.exersice_3);

        } else if
        (intValue == (R.id.pose4)) {
            description.setText(R.string.bicycle);
            gif.setImageResource(R.drawable.exersice_4);

        } else if
        (intValue == (R.id.pose5)) {
            description.setText(R.string.leg);
            gif.setImageResource(R.drawable.exersice_5);

        } else if
        (intValue == (R.id.pose6)) {
            description.setText(R.string.alternate);
            gif.setImageResource(R.drawable.exersice_6);

        } else if
        (intValue == (R.id.pose7)) {
            description.setText(R.string.leg_up);
            gif.setImageResource(R.drawable.exersice_7);

        } else if
        (intValue == (R.id.pose8)) {
            description.setText(R.string.sit_up);
            gif.setImageResource(R.drawable.exersice_8);

        } else if
        (intValue == (R.id.pose9)) {
            description.setText(R.string.v);
            gif.setImageResource(R.drawable.exersice_9);

        } else if
        (intValue == (R.id.pose10)) {
            description.setText(R.string.rotations);
            gif.setImageResource(R.drawable.exersice_10);

        } else if
        (intValue == (R.id.pose11)) {
            description.setText(R.string.left);
            gif.setImageResource(R.drawable.exersice_11);

        } else if
        (intValue == (R.id.pose12)) {
            description.setText(R.string.russian);
            gif.setImageResource(R.drawable.exersice_12);

        } else if
        (intValue == (R.id.pose13)) {
            description.setText(R.string.bridge);
            gif.setImageResource(R.drawable.exersice_13);

        } else if
        (intValue == (R.id.pose14)) {
            description.setText(R.string.vertical);
            gif.setImageResource(R.drawable.exersice_14);

        } else if
        (intValue == (R.id.pose15)) {
            description.setText(R.string.windmill);
            gif.setImageResource(R.drawable.exersice_15);


    }

    /* create countdown timer for 15 minutes with start/pause and reset buttons */

    mButtonTime = findViewById(R.id.time);

    mButtonStart = findViewById(R.id.start);


    mButtonStart.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            if (mTimerRunning) {
                resetTimer();
            } else {
               startTimer();
            }
        }
    });

        mButtonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
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
                mButtonStart.setText("Start");
                // inform about finishing the exercise - make sound and show Toast message
                Toast.makeText(Exercise.this, Html.fromHtml("<big>DONE - go to the next exercise or finish.</big>"), Toast.LENGTH_LONG).show();
                final MediaPlayer alert = MediaPlayer.create(Exercise.this, R.raw.bell);
                alert.start();

            }
        }.start();

        mTimerRunning = true;
        mButtonStart.setText("Reset");

    }

    private void pauseTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;

    }

    private void resetTimer() {
        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStart.setText("Start");
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();


    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        mButtonTime.setText(timeLeftFormatted);
    }
}



