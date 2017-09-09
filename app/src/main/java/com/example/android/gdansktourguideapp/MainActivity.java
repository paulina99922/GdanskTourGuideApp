
package com.example.android.gdansktourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView museums = (TextView) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, Museums.class);
                startActivity(museumsIntent);
            }
        });

        TextView restaurants_and_cafes = (TextView) findViewById(R.id.restaurants_and_cafes);

        restaurants_and_cafes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsAndCafesIntent = new Intent(MainActivity.this, RestaurantsAndCafes.class);
                startActivity(restaurantsAndCafesIntent);
            }
        });

        TextView tourist_attractions = (TextView) findViewById(R.id.tourist_attractions);
        tourist_attractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent touristAttractionsIntent= new Intent(MainActivity.this, TouristAttractions.class);
                startActivity(touristAttractionsIntent);
            }
        });
    }
}