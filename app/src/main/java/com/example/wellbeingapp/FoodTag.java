package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class FoodTag extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tag);

        TextView title = findViewById(R.id.title);

        Button button_one = findViewById(R.id.button_one);
        button_one.setVisibility(View.VISIBLE);
        Button button_two = findViewById(R.id.button_two);
        button_two.setVisibility(View.VISIBLE);
        Button button_three = findViewById(R.id.button_three);
        button_three.setVisibility(View.VISIBLE);
        Button button_four = findViewById(R.id.button_four);
        button_four.setVisibility(View.VISIBLE);
        Button button_five = findViewById(R.id.button_five);
        button_five.setVisibility(View.VISIBLE);
        Button button_six = findViewById(R.id.button_six);
        button_six.setVisibility(View.VISIBLE);
        Button button_seven = findViewById(R.id.button_seven);
        button_seven.setVisibility(View.VISIBLE);

        button_one.setOnClickListener(this); // calling onClick() method
        button_two.setOnClickListener(this);
        button_three.setOnClickListener(this);
        button_four.setOnClickListener(this);
        button_five.setOnClickListener(this);
        button_six.setOnClickListener(this);
        button_seven.setOnClickListener(this);

        Intent newIntent = getIntent();

        /* get intent and set the right description and image of recipe depending on the click from the activities FoodOne and FoodTwo */

        int intValue = newIntent.getIntExtra("about", 0);

        if (intValue == 0) {
            title.setText("No text!");

        } else if
        (intValue == (R.id.vegeterian)) {
            title.setText("VEGETERIAN RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.eggs_smaller),null,null);
            button_one.setText("SILKY MASALA EGGS\n");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.mango_smaller),null,null);
            button_two.setText("Mango &\n yoghurt layer pots");
            button_three.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.pancake_smaller),null,null);
            button_three.setText("Gluten-free\n one-cup pancakes");
            button_four.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.maple_smaller),null,null);
            button_four.setText("Goodness breakfast\n with maple pears");
            button_five.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.waffles_smaller),null,null);
            button_five.setText("Granola Dust\n waffles");
            button_six.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.curry_smaller),null,null);
            button_six.setText("Sweet potato,\n chickpea & spinach curry");
            button_seven.setCompoundDrawablesRelativeWithIntrinsicBounds(null,getDrawable(R.drawable.pizza_smaller),null,null);
            button_seven.setText("Wholemeal-crust pizza rossa");

        } else if
            (intValue == (R.id.gluten)) {
            title.setText("GLUTEN-FREE RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.mango_smaller), null, null);
            button_one.setText("Mango &\n yoghurt layer pots");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.pancake_smaller), null, null);
            button_two.setText("Gluten-free\n one-cup pancakes");
            button_three.setVisibility(View.INVISIBLE);
            button_four.setVisibility(View.INVISIBLE);
            button_five.setVisibility(View.INVISIBLE);
            button_six.setVisibility(View.INVISIBLE);
            button_seven.setVisibility(View.INVISIBLE);

        } else if
        (intValue == (R.id.quick)) {
            title.setText("QUICK AND EASY RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.mango_smaller), null, null);
            button_one.setText("Mango &\n yoghurt layer pots");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.pancake_smaller), null, null);
            button_two.setText("Gluten-free\n one-cup pancakes");
            button_three.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.waffles_smaller), null, null);
            button_three.setText("Granola Dust\n waffles");
            button_four.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.chicken_smaller), null, null);
            button_four.setText("Sesame butterflied\n chicken");
            button_five.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.prawn_smaller), null, null);
            button_five.setText("Prawn & courgette\n spaghetti");
            button_six.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.tuna_smaller), null, null);
            button_six.setText("Tuna fettuccine");
            button_seven.setVisibility(View.INVISIBLE);

        } else if
        (intValue == (R.id.fruity)) {
            title.setText("FRUITY RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.mango_smaller), null, null);
            button_one.setText("Mango &\n yoghurt layer pots");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.maple_smaller), null, null);
            button_two.setText("Goodness breakfast\n with maple pears");
            button_three.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.waffles_smaller), null, null);
            button_three.setText("Granola Dust\n waffles");
            button_four.setVisibility(View.INVISIBLE);
            button_five.setVisibility(View.INVISIBLE);
            button_six.setVisibility(View.INVISIBLE);
            button_seven.setVisibility(View.INVISIBLE);

        }  else if
        (intValue == (R.id.meat)) {
            title.setText("RECIPES WITH MEAT, FISH AND SEAFOOD");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.chicken_smaller), null, null);
            button_one.setText("Sesame butterflied\n chicken");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.prawn_smaller), null, null);
            button_two.setText("Prawn & courgette\n spaghetti");
            button_three.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.tuna_smaller), null, null);
            button_three.setText("Tuna fettuccine");
            button_four.setVisibility(View.INVISIBLE);
            button_five.setVisibility(View.INVISIBLE);
            button_six.setVisibility(View.INVISIBLE);
            button_seven.setVisibility(View.INVISIBLE);

        } else if
        (intValue == (R.id.indian)) {
            title.setText("INDIAN RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.eggs_smaller), null, null);
            button_one.setText("SILKY MASALA EGGS\n");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.curry_smaller), null, null);
            button_two.setText("Sweet potato,\n chickpea & spinach curry");
            button_three.setVisibility(View.INVISIBLE);
            button_four.setVisibility(View.INVISIBLE);
            button_five.setVisibility(View.INVISIBLE);
            button_six.setVisibility(View.INVISIBLE);
            button_seven.setVisibility(View.INVISIBLE);

        } else if
        (intValue == (R.id.italian)) {
            title.setText("ITALIAN RECIPES");
            button_one.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.pizza_smaller), null, null);
            button_one.setText("Wholemeal-crust\n pizza rossa");
            button_two.setCompoundDrawablesRelativeWithIntrinsicBounds(null, getDrawable(R.drawable.tuna_smaller), null, null);
            button_two.setText("Tuna fettuccine");
            button_three.setVisibility(View.INVISIBLE);
            button_four.setVisibility(View.INVISIBLE);
            button_five.setVisibility(View.INVISIBLE);
            button_six.setVisibility(View.INVISIBLE);
            button_seven.setVisibility(View.INVISIBLE);

        }
    }

        public void onClick(View v) {

            /* send intent with extra (description and image of recipe in FoodThree activity) depending on chosen button */


            Intent fru = new Intent(FoodTag.this, FoodThree.class);
            Intent veg = new Intent(FoodTag.this, FoodThree.class);
            Intent glu = new Intent(FoodTag.this, FoodThree.class);
            Intent qui = new Intent(FoodTag.this, FoodThree.class);
            Intent meat = new Intent(FoodTag.this, FoodThree.class);
            Intent ind = new Intent(FoodTag.this, FoodThree.class);
            Intent ita = new Intent(FoodTag.this, FoodThree.class);



            TextView title = findViewById(R.id.title);

            String name = title.getText().toString();

            if (name.equals("FRUITY RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        fru.putExtra("fru", R.id.button_one);
                        startActivity(fru);
                        break;
                    case (R.id.button_two):
                        fru.putExtra("fru", R.id.button_two);
                        startActivity(fru);
                        break;
                    case (R.id.button_three):
                        fru.putExtra("fru", R.id.button_three);
                        startActivity(fru);
                        break;
                }

            } else if (name.equals("VEGETERIAN RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        veg.putExtra("veg", R.id.button_one);
                        startActivity(veg);
                        break;
                    case (R.id.button_two):
                        veg.putExtra("veg", R.id.button_two);
                        startActivity(veg);
                        break;
                    case (R.id.button_three):
                        veg.putExtra("veg", R.id.button_three);
                        startActivity(veg);
                        break;
                    case (R.id.button_four):
                        veg.putExtra("veg", R.id.button_four);
                        startActivity(veg);
                        break;
                    case (R.id.button_five):
                        veg.putExtra("veg", R.id.button_five);
                        startActivity(veg);
                        break;
                    case (R.id.button_six):
                        veg.putExtra("veg", R.id.button_six);
                        startActivity(veg);
                        break;
                    case (R.id.button_seven):
                        veg.putExtra("veg", R.id.button_seven);
                        startActivity(veg);
                        break;
                }
            } else if (name.equals("GLUTEN-FREE RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        glu.putExtra("glu", R.id.button_one);
                        startActivity(glu);
                        break;
                    case (R.id.button_two):
                        glu.putExtra("glu", R.id.button_two);
                        startActivity(glu);
                        break;
                }
            } else if (name.equals("QUICK AND EASY RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        qui.putExtra("qui", R.id.button_one);
                        startActivity(qui);
                        break;
                    case (R.id.button_two):
                        qui.putExtra("qui", R.id.button_two);
                        startActivity(qui);
                        break;
                    case (R.id.button_three):
                        qui.putExtra("qui", R.id.button_three);
                        startActivity(qui);
                        break;
                    case (R.id.button_four):
                        qui.putExtra("qui", R.id.button_four);
                        startActivity(qui);
                        break;
                    case (R.id.button_five):
                        qui.putExtra("qui", R.id.button_five);
                        startActivity(qui);
                        break;
                    case (R.id.button_six):
                        qui.putExtra("qui", R.id.button_six);
                        startActivity(qui);
                        break;
                }
            } else if (name.equals("RECIPES WITH MEAT, FISH AND SEAFOOD")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        meat.putExtra("meat", R.id.button_one);
                        startActivity(meat);
                        break;
                    case (R.id.button_two):
                        meat.putExtra("meat", R.id.button_two);
                        startActivity(meat);
                        break;
                    case (R.id.button_three):
                        meat.putExtra("meat", R.id.button_three);
                        startActivity(meat);
                        break;
                }
            } else if (name.equals("INDIAN RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        ind.putExtra("ind", R.id.button_one);
                        startActivity(ind);
                        break;
                    case (R.id.button_two):
                        ind.putExtra("ind", R.id.button_two);
                        startActivity(ind);
                        break;
                }
            } else if (name.equals("ITALIAN RECIPES")) {
                switch (v.getId()) {
                    case (R.id.button_one):
                        ita.putExtra("ita", R.id.button_one);
                        startActivity(ita);
                        break;
                    case (R.id.button_two):
                        ita.putExtra("ita", R.id.button_two);
                        startActivity(ita);
                        break;
                }
            }
        }
}









