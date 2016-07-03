package com.example.alexs.udacmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);

        // Set a click listener on that View
        assert library != null;
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link libraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this, Library.class);

                // Start the new activity
                startActivity(libraryIntent);
            }
        });

        // Find the View that shows the explore category
        TextView explore = (TextView) findViewById(R.id.explore);

        // Set a click listener on that View
        explore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the explore category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link exploreActivity}
                Intent exploreIntent = new Intent(MainActivity.this, Explore.class);

                // Start the new activity
                startActivity(exploreIntent);
            }
        });
        // Find the View that shows the radio category
        TextView radio = (TextView) findViewById(R.id.radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the radio category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link radioActivity}
                Intent radioIntent = new Intent(MainActivity.this, Radio.class);

                // Start the new activity
                startActivity(radioIntent);
            }
        });
        // Find the View that shows the mainActivity category
        TextView mainActivity = (TextView) findViewById(R.id.nowPlaying);

        // Set a click listener on that View
        mainActivity.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the mainActivity category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link mainActivityActivity}
                Intent mainActivityIntent = new Intent(MainActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(mainActivityIntent);
            }
        });
    }
}
