package com.example.discographyp6;

public class Songs {
    /**
     * Song title.
     */
    private String mSongTitle;
    /**
     * Artist's name.
     */
    private String mWriters;

    /**
     * Create a new Song object.
     *
     * @param writers   represents the name of the writer(s).
     * @param songTitle song's name.
     */
    public Songs(String songTitle, String writers) {
        mWriters = writers;
        mSongTitle = songTitle;
    }

    /**
     * Get the name of the Writer(s).
     */
    public String getWriters() {
        return mWriters;
    }

    /**
     * Get the name of the song.
     */
    public String getSongTitle() {
        return mSongTitle;
    }
}
