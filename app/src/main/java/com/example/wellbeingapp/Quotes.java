package com.example.wellbeingapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        // get a random quote from the array
        String[] quotes_array = getResources().getStringArray(R.array.quotes_array);
        Random random = new Random();
        int index = random.nextInt(quotes_array.length);

        // set a random quote which user can see after opening the page
        TextView your_quote = (TextView) findViewById(R.id.your_quote);
        your_quote.setText(quotes_array[index]);

        // change the quote after the click
        Button next_quote = (Button) findViewById(R.id.next_quote);
        next_quote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(quotes_array.length);
                your_quote.setText(quotes_array[index]);
            }
        });
    }
}