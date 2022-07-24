package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_two);

        Button chicken = (Button) findViewById(R.id.chicken);
        chicken.setOnClickListener(this::onClick);

        Button curry = (Button) findViewById(R.id.curry);
        curry.setOnClickListener(this::onClick);

        Button pizza = (Button) findViewById(R.id.pizza);
        pizza.setOnClickListener(this::onClick);

        Button prawn = (Button) findViewById(R.id.prawn);
        prawn.setOnClickListener(this::onClick);

        Button tuna = (Button) findViewById(R.id.tuna);
        tuna.setOnClickListener(this::onClick);
    }

    /* send intent with extra (description and image of recipe in FoodThree activity) depending on chosen button */


    public void onClick(View v) {

        Intent intent = new Intent(FoodTwo.this, FoodThree.class);

        if (v.getId() == R.id.chicken) {
            intent.putExtra("about", R.id.chicken);
            startActivity(intent);

        } else if
        (v.getId() == R.id.curry) {
            intent.putExtra("about", R.id.curry);
            startActivity(intent);

        } else if
        (v.getId() == R.id.pizza) {
            intent.putExtra("about", R.id.pizza);
            startActivity(intent);

        } else if
        (v.getId() == R.id.prawn) {
            intent.putExtra("about", R.id.prawn);
            startActivity(intent);

        } else if
        (v.getId() == R.id.tuna) {
            intent.putExtra("about", R.id.tuna);
            startActivity(intent);

        }
    }
}