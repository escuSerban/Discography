package com.example.discographyp6;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TrackPlayerActivity extends AppCompatActivity implements View.OnClickListener {
    // Defining our views.
    Button previousTrack;
    Button nextTrack;
    Button playTrack;
    TextView music;
    Button home;
    Button listing;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the player_menu.xml layout file.
        setContentView(R.layout.player_menu);
// Finding our views by their xml id.
        previousTrack = findViewById(R.id.previous_button);
        nextTrack = findViewById(R.id.next_button);
        playTrack = findViewById(R.id.play_button);
        music = findViewById(R.id.music_text);
        home = findViewById(R.id.home_button);
        listing = findViewById(R.id.list_button);
// Setting click listeners our views.
        previousTrack.setOnClickListener(this);
        playTrack.setOnClickListener(this);
        nextTrack.setOnClickListener(this);
        music.setOnClickListener(this);
        home.setOnClickListener(this);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(TrackPlayerActivity.this, MainActivity.class);
                startActivity(j);
            }
        });
        listing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(TrackPlayerActivity.this, SongsActivity.class);
                startActivity(k);
            }
        });
    }

    /**
     * This method is called to display a toast for each button clicked.
     */
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.previous_button:
                Toast.makeText(this, "Play previous song", Toast.LENGTH_SHORT).show();
                break;
            case R.id.play_button:
                Toast.makeText(this, "Play song", Toast.LENGTH_SHORT).show();
                break;
            case R.id.next_button:
                Toast.makeText(this, "Play next song", Toast.LENGTH_SHORT).show();
                break;
            // Setting an implicit intent to display url for our clickable textView.
            case R.id.music_text:
                String url = "https://whymusicmatters.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
        }
    }
}