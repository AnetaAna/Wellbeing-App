package com.example.wellbeingapp;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Meditation extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);


        Button prana = (Button) findViewById(R.id.prana);
        Button dhyana = (Button) findViewById(R.id.dhyana);
        Button shuni = (Button) findViewById(R.id.shuni);
        Button gyana = (Button) findViewById(R.id.gyana);
        Button anjali = (Button) findViewById(R.id.anjali);

        prana.setOnClickListener(this);
        dhyana.setOnClickListener(this);
        shuni.setOnClickListener(this);
        gyana.setOnClickListener(this);
        anjali.setOnClickListener(this);

    }

    /* send intent with extra (description and image of mudra in Mudra activity) depending on chosen button */

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Meditation.this, Mudra.class);

                    if (v.getId() == R.id.prana) {
                        intent.putExtra("about", R.id.prana);
                        startActivity(intent);

                    } else if
                        (v.getId() == R.id.dhyana) {
                        intent.putExtra("about", R.id.dhyana);
                        startActivity(intent);

                    } else if
                    (v.getId() == R.id.shuni) {
                        intent.putExtra("about", R.id.shuni);
                        startActivity(intent);

                    } else if
                    (v.getId() == R.id.gyana) {
                        intent.putExtra("about", R.id.gyana);
                        startActivity(intent);

                    } else if
                    (v.getId() == R.id.anjali) {
                        intent.putExtra("about", R.id.anjali);
                        startActivity(intent);

                    }
            }
}