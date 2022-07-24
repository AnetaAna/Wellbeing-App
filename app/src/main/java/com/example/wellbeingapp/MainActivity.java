package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // take to Mindfulness screen
        Button mindfulness = (Button) findViewById(R.id.mindfulness);

        mindfulness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Mindfulness.class));
            }
        });

        // take to Quotes screen
        Button quotes = (Button) findViewById(R.id.quotes);

        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Quotes.class));
            }
        });

        // take to Meditation screen
        Button meditation = (Button) findViewById(R.id.meditation);

        meditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meditation.class));
            }
        });

        // take to Workout screen
        Button workout = (Button) findViewById(R.id.workout);

        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Workout.class));
            }
        });

        // take to Recipes screen
        Button recipes = (Button) findViewById(R.id.recipes);

        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Recipes.class));
            }
        });
    }
}