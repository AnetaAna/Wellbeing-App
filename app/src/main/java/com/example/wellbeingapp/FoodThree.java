package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_three);

        TextView name = findViewById(R.id.foodName);
        ImageView picture = findViewById(R.id.foodImage);
        TextView details = findViewById((R.id.foodDetails));
        TextView ingredients = findViewById((R.id.ingredients));
        TextView method = findViewById((R.id.method));

        Intent newIntent = getIntent();

        Intent fru = getIntent();
        Intent veg = getIntent();
        Intent glu = getIntent();
        Intent qui = getIntent();
        Intent meat = getIntent();
        Intent ind = getIntent();
        Intent ita = getIntent();



        /* get intent and set the right description and image of recipe depending on the click from the activities FoodOne and FoodTwo */

        int intValue = newIntent.getIntExtra("about", 0);


        /* get intent and set the right description and image of recipe depending on the click from the activity FoodTag */


        int intFruity = fru.getIntExtra("one", 0);
        int intVeggie = veg.getIntExtra("veg",0);
        int intGluten = glu.getIntExtra("glu",0);
        int intQuick = qui.getIntExtra("qui",0);
        int intMeat = meat.getIntExtra("meat",0);
        int intIndia = ind.getIntExtra("ind",0);
        int intItaly = ita.getIntExtra("ita",0);


        if ((intValue == 0) && (intFruity == 0) && (intVeggie == 0) && (intGluten == 0) && (intQuick == 0) && (intMeat == 0) && (intIndia == 0) && (intItaly == 0)){
            name.setText("No text!");

        } else if
        (intValue == (R.id.eggs) || (intVeggie == (R.id.button_one)) || (intIndia == (R.id.button_one))){
            name.setText(R.string.eggs_name);
            picture.setImageDrawable(getDrawable(R.drawable.eggs));
            details.setText(R.string.eggs_details);
            ingredients.setText(R.string.eggs_ing);
            method.setText(R.string.eggs_method);

        } else if
        ((intValue == (R.id.mango) || (intFruity == (R.id.button_one)) || (intVeggie == (R.id.button_two)) || (intGluten == (R.id.button_one)) || (intQuick == (R.id.button_one)))) {
            name.setText(R.string.mango_name);
            picture.setImageDrawable(getDrawable(R.drawable.mango));
            details.setText(R.string.mango_details);
            ingredients.setText(R.string.mango_details);
            method.setText(R.string.mango_method);

        } else if
        ((intValue == (R.id.maple) || (intFruity == (R.id.button_three)) || (intVeggie == (R.id.button_four)))) {
            name.setText(R.string.maple_name);
            picture.setImageDrawable(getDrawable(R.drawable.maple));
            details.setText(R.string.maple_details);
            ingredients.setText(R.string.maple_ing);
            method.setText(R.string.maple_method);

        } else if
        ((intValue == (R.id.pancake)) || (intVeggie == (R.id.button_three)) || (intGluten == (R.id.button_two)) ||  (intQuick == (R.id.button_two))){
            name.setText(R.string.pancake_name);
            picture.setImageDrawable(getDrawable(R.drawable.pancake));
            details.setText(R.string.pancake_details);
            ingredients.setText(R.string.pancake_ing);
            method.setText(R.string.pancake_method);

        } else if
        ((intValue == (R.id.waffle) || (intFruity == (R.id.button_three)) || (intVeggie == (R.id.button_five)) || (intQuick == (R.id.button_three)))){
            name.setText(R.string.waffles_name);
            picture.setImageDrawable(getDrawable(R.drawable.waffles));
            details.setText(R.string.waffles_details);
            ingredients.setText(R.string.waffles_ing);
            method.setText(R.string.waffles_method);

        } else if
        ((intValue == (R.id.chicken)) || (intMeat == (R.id.button_one)) || (intQuick == (R.id.button_four))){
            name.setText(R.string.chicken_name);
            picture.setImageDrawable(getDrawable(R.drawable.chicken));
            details.setText(R.string.chicken_details);
            ingredients.setText(R.string.chicken_ing);
            method.setText(R.string.chicken_method);

        } else if
        ((intValue == (R.id.curry)) || (intVeggie == (R.id.button_six)) || (intIndia == (R.id.button_two))){
            name.setText(R.string.curry_name);
            picture.setImageDrawable(getDrawable(R.drawable.curry));
            details.setText(R.string.curry_details);
            ingredients.setText(R.string.curry_ing);
            method.setText(R.string.curry_method);

        } else if
        ((intValue == (R.id.pizza)) || (intItaly == (R.id.button_one)) || (intVeggie == (R.id.button_seven))) {
            name.setText(R.string.pizza_name);
            picture.setImageDrawable(getDrawable(R.drawable.pizza));
            details.setText(R.string.pizza_details);
            ingredients.setText(R.string.pizza_ing);
            method.setText(R.string.pizza_method);

        } else if
        ((intValue == (R.id.prawn)) || (intQuick == (R.id.button_five)) || (intMeat == (R.id.button_two))){
            name.setText(R.string.prawn_name);
            picture.setImageDrawable(getDrawable(R.drawable.prawn));
            details.setText(R.string.prawn_details);
            ingredients.setText(R.string.prawn_ing);
            method.setText(R.string.prawn_method);

        } else if
        ((intValue == (R.id.tuna)) || (intItaly == (R.id.button_two)) || (intMeat == (R.id.button_three)) || (intQuick == (R.id.button_six))){
            name.setText(R.string.tuna_name);
            picture.setImageDrawable(getDrawable(R.drawable.tuna));
            details.setText(R.string.tuna_details);
            ingredients.setText(R.string.tuna_ing);
            method.setText(R.string.tuna_method);
        }
    }

}