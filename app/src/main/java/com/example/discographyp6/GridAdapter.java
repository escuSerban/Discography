package com.example.discographyp6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class GridAdapter extends ArrayAdapter<Albums> {
    /**
     * Creating an adapter to display our list of albums.
     */
    public GridAdapter(@NonNull Context context, @NonNull List<Albums> albums) {
        super(context, 0, albums);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.row_grid, parent, false);
        }
        // Getting the object located at this position in the list.
        Albums currentAlbum = getItem(position);
        // Finding Views.
        ImageView albumCoverImageView = convertView.findViewById(R.id.album_cover);
        TextView albumTitleTextView = convertView.findViewById(R.id.album_title);
        TextView albumAuthorTextView = convertView.findViewById(R.id.album_year);
        // Setting values.
        albumCoverImageView.setImageResource(currentAlbum.getCover());
        albumTitleTextView.setText(currentAlbum.getTitle());
        albumAuthorTextView.setText(currentAlbum.getYear());

        return convertView;
    }
}