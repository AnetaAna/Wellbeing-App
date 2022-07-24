package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Recipes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        Button vegetarian = (Button) findViewById(R.id.vegeterian);
        vegetarian.setOnClickListener(this::onClick);

        Button gluten = (Button) findViewById(R.id.gluten);
        gluten.setOnClickListener(this::onClick);

        Button quick = (Button) findViewById(R.id.quick);
        quick.setOnClickListener(this::onClick);

        Button fruity = (Button) findViewById(R.id.fruity);
        fruity.setOnClickListener(this::onClick);

        Button meat = (Button) findViewById(R.id.meat);
        meat.setOnClickListener(this::onClick);

        Button indian = (Button) findViewById(R.id.indian);
        indian.setOnClickListener(this::onClick);

        Button italian = (Button) findViewById(R.id.italian);
        italian.setOnClickListener(this::onClick);

    }




    public void ImageButtonClicked(View view) {

        if (view.getId() == R.id.breakfast) {
            startActivity(new Intent(Recipes.this, FoodOne.class));

        } else if
        (view.getId() == R.id.dinner) {
            startActivity(new Intent(Recipes.this, FoodTwo.class));
        }
    }
        private void onClick(View view) {
       Intent newIntent = new Intent(Recipes.this, FoodTag.class);

        if (view.getId() == R.id.vegeterian) {
            newIntent.putExtra("about", R.id.vegeterian);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.gluten) {
            newIntent.putExtra("about", R.id.gluten);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.quick) {
            newIntent.putExtra("about", R.id.quick);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.fruity) {
            newIntent.putExtra("about", R.id.fruity);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.meat) {
            newIntent.putExtra("about", R.id.meat);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.indian) {
            newIntent.putExtra("about", R.id.indian);
            startActivity(newIntent);

        } else if
        (view.getId() == R.id.italian) {
            newIntent.putExtra("about", R.id.italian);
            startActivity(newIntent);

        }
    }
}