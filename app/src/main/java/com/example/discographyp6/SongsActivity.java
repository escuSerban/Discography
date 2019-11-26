package com.example.discographyp6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the songs_list.xml layout file.
        setContentView(R.layout.songs_list);
        // This enables UpButton on my SongsActivity AppBar.
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
/**
 * Creating a new ArrayList "Songs" and defining the elements within it.
 */
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("♪1.1 Radioactive", "Imagine Dragons & Alexander GrantJosh & Mosser"));
        songs.add(new Songs("♪1.2 Tiptoe", "Dan Reynolds & Wayne Sermon & Ben McKee & Brittany Tolman & Andrew Tolman"));
        songs.add(new Songs("♪1.3 It's Time", "Imagine Dragons & Brandon Darner"));
        songs.add(new Songs("♪1.4 Demons", "Imagine Dragons & Grant & Mosser"));
        songs.add(new Songs("♪1.5 On Top of the World", "Imagine Dragons & Grant"));
        songs.add(new Songs("♪1.6 Amsterdam", "Imagine Dragons & Grant & Darner"));
        songs.add(new Songs("♪1.7 Hear Me", "Dan Reynolds & Wayne Sermon & Ben McKee & Brittany Tolman & Andrew Tolman"));
        songs.add(new Songs("♪1.8 Every Night", "Imagine Dragons"));
        songs.add(new Songs("♪1.9 Bleeding Out", "Imagine Dragons & Grant & Mosser & Devon Roars & Jack Reid & Jay Pow"));
        songs.add(new Songs("♪1.10 Underdog", "Imagine Dragons"));
        songs.add(new Songs("♪1.11 Nothing Left to Say / Rocks", "Imagine Dragons"));
        songs.add(new Songs("♫2.1 Shots", "Imagine Dragons"));
        songs.add(new Songs("♫2.2 Gold", "Alexander Grant & Imagine Dragons"));
        songs.add(new Songs("♫2.3 Smoke and Mirrors", "Imagine Dragons"));
        songs.add(new Songs("♫2.4 I'm So Sorry", "Imagine Dragons"));
        songs.add(new Songs("♫2.5 I Bet My Life", "Imagine Dragons"));
        songs.add(new Songs("♫2.6 Polaroid", "Imagine Dragons"));
        songs.add(new Songs("♫2.7 Friction", "Imagine Dragons"));
        songs.add(new Songs("♫2.8 It Comes Back to You", "Imagine Dragons"));
        songs.add(new Songs("♫2.9 Dream", "Grant & Imagine Dragons"));
        songs.add(new Songs("♫2.10 Trouble", "Imagine Dragons"));
        songs.add(new Songs("♫2.11 Summer", "Imagine Dragons"));
        songs.add(new Songs("♫2.12 Hopeless Opus", "Imagine Dragons"));
        songs.add(new Songs("♫2.13 The Fall", "Imagine Dragons"));
        songs.add(new Songs("♪♫3.1 I Don't Know Why", "Imagine Dragons & Robin Fredriksson & Mattias Larsson & Justin Tranter"));
        songs.add(new Songs("♪♫3.2 Whatever It Takes", "Imagine Dragons & Joel Little"));
        songs.add(new Songs("♪♫3.3 Believer", "Imagine Dragons & Fredriksson & Larsson & Tranter"));
        songs.add(new Songs("♪♫3.4 Walking the Wire", "Imagine Dragons & Fredriksson & Larsson & Tranter"));
        songs.add(new Songs("♪♫3.5 Rise Up", "Imagine Dragons & John Hill"));
        songs.add(new Songs("♪♫3.6 I'll Make It Up to You", "Imagine Dragons & Tim Randolph"));
        songs.add(new Songs("♪♫3.7 Yesterday", "Imagine Dragons & Alexander Grant & Jayson DeZuzio"));
        songs.add(new Songs("♪♫3.8 Mouth of the River", "Imagine Dragons & Randolph"));
        songs.add(new Songs("♪♫3.9 Thunder", "Imagine Dragons & Grant & DeZuzio"));
        songs.add(new Songs("♪♫3.10 Start Over", "Imagine Dragons & Fredriksson & Larsson & Tranter"));
        songs.add(new Songs("♪♫3.11 Dancing in the Dark", "Imagine Dragons & Grant"));
        songs.add(new Songs("♪♫♪4.1 Natural", "Imagine Dragons & Mattman + Robin & Justin Tranter"));
        songs.add(new Songs("♪♫♪4.2 Boomerang", "Imagine Dragons & Jorgen Odegard"));
        songs.add(new Songs("♪♫♪4.3 Machine", "Imagine Dragons & Alex Da Kid"));
        songs.add(new Songs("♪♫♪4.4 Cool Out", "Imagine Dragons & Timothy Randolph"));
        songs.add(new Songs("♪♫♪4.5 Bad Liar", "Imagine Dragons & Aja Volkman & Odegard"));
        songs.add(new Songs("♪♫♪4.6 West Coast", "Imagine Dragons"));
        songs.add(new Songs("♪♫♪4.7 Zero", "Imagine Dragons & John Hill"));
        songs.add(new Songs("♪♫♪4.8 Bullet In A Gun", "Imagine Dragons & Da Kid & Jayson DeZuzio"));
        songs.add(new Songs("♪♫♪4.9 Digital", "Imagine Dragons & Ryan & Da Kid"));
        songs.add(new Songs("♪♫♪4.10 Only", "Imagine Dragons & Mattman + Robin & Tranter"));
        songs.add(new Songs("♪♫♪4.11 Stuck", "Imagine Dragons & Da Kid & DeZuzio"));
        songs.add(new Songs("♪♫♪4.12 Love", "Reynolds & McKee & Sermon & Ido Zmishlany"));
/**
 * Calling the adapter for our ArrayList.
 */
        SongsAdapter adapter = new SongsAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SongsActivity.this, TrackPlayerActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * Creating an adapter to display our list of songs.
     */
    private class SongsAdapter extends ArrayAdapter<Songs> {
        public SongsAdapter(Context context, ArrayList<Songs> songs) {
            super(context, 0, songs);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view.
            View listItemView = convertView;
            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            Songs currentSong = getItem(position);
            TextView songTextView = listItemView.findViewById(R.id.song_text_view);
            songTextView.setText(currentSong.getSongTitle());
            TextView writerTextView = listItemView.findViewById(R.id.writer_text_view);
            writerTextView.setText(currentSong.getWriters());
            return listItemView;
        }
    }
}
