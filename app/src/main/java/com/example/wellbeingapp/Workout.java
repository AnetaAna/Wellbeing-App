package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Workout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

    }

    /* send intent with extra (description and image of exercise in Exercise activity) depending on chosen button */

    public void ImageButtonClicked(View view) {


        Intent intent = new Intent(Workout.this, Exercise.class);

        if (view.getId() == R.id.pose1) {
            intent.putExtra("about", R.id.pose1);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose2) {
            intent.putExtra("about", R.id.pose2);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose3) {
            intent.putExtra("about", R.id.pose3);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose4) {
            intent.putExtra("about", R.id.pose4);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose5) {
            intent.putExtra("about", R.id.pose5);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose6) {
            intent.putExtra("about", R.id.pose6);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose7) {
            intent.putExtra("about", R.id.pose7);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose8) {
            intent.putExtra("about", R.id.pose8);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose9) {
            intent.putExtra("about", R.id.pose9);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose10) {
            intent.putExtra("about", R.id.pose10);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose11) {
            intent.putExtra("about", R.id.pose11);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose12) {
            intent.putExtra("about", R.id.pose12);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose13) {
            intent.putExtra("about", R.id.pose13);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose14) {
            intent.putExtra("about", R.id.pose14);
            startActivity(intent);

            } else if
            (view.getId() == R.id.pose15) {
            intent.putExtra("about", R.id.pose15);
            startActivity(intent);


        }

    }
}
