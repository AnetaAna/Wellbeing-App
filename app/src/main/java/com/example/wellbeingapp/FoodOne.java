package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_one);

        Button eggs = (Button) findViewById(R.id.eggs);
        eggs.setOnClickListener(this::onClick);

        Button mango = (Button) findViewById(R.id.mango);
        mango.setOnClickListener(this::onClick);

        Button maple = (Button) findViewById(R.id.maple);
        maple.setOnClickListener(this::onClick);

        Button pancake = (Button) findViewById(R.id.pancake);
        pancake.setOnClickListener(this::onClick);

        Button waffle = (Button) findViewById(R.id.waffle);
        waffle.setOnClickListener(this::onClick);
    }


    /* send intent with extra (description and image of recipe in FoodThree activity) depending on chosen button */


    public void onClick(View v) {

        Intent intent = new Intent(FoodOne.this, FoodThree.class);

        if (v.getId() == R.id.eggs) {
            intent.putExtra("about", R.id.eggs);
            startActivity(intent);

        } else if
        (v.getId() == R.id.mango) {
            intent.putExtra("about", R.id.mango);
            startActivity(intent);

        } else if
        (v.getId() == R.id.maple) {
            intent.putExtra("about", R.id.maple);
            startActivity(intent);

        } else if
        (v.getId() == R.id.pancake) {
            intent.putExtra("about", R.id.pancake);
            startActivity(intent);

        } else if
        (v.getId() == R.id.waffle) {
            intent.putExtra("about", R.id.waffle);
            startActivity(intent);

        }
    }
}