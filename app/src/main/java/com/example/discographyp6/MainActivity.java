package com.example.discographyp6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file.
        setContentView(R.layout.activity_main);
        /**
         * Creating a new ArrayList "Albums" and defining the elements within it.
         */
        final ArrayList<Albums> albums = new ArrayList<>();
        {
            albums.add(new Albums(R.drawable.first_album, "Night Visions", "2012"));
            albums.add(new Albums(R.drawable.second_album, "Smoke + Mirrors", "2015"));
            albums.add(new Albums(R.drawable.third_album, "Evolve", "2017"));
            albums.add(new Albums(R.drawable.forth_album, "Origins", "2018"));
        }
        /**
         * Calling the adapter for our ArrayList.
         */
        GridAdapter albumAdapter = new GridAdapter(this, albums);
        GridView grid = findViewById(R.id.albumsGrid);
        grid.setAdapter(albumAdapter);
        // The code in this method will be executed when the albums gridView is clicked on.
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // create new intent to open the SongsActivity.
                Intent albumsIntent = new Intent(MainActivity.this, SongsActivity.class);
                // Start the new Activity.
                startActivity(albumsIntent);
            }
        });
    }
}
