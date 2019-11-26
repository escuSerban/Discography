package com.example.discographyp6;

public class Albums {
    /**
     * Album image cover.
     */
    private int mImage;
    /**
     * Title of the album.
     */
    private String mCollection;
    /**
     * Album release year.
     */
    private String mReleased;

    /**
     * Create a new Albums object.
     *
     * @param imageCover     represents the image cover for each album.
     * @param songCollection album's title.
     * @param yearReleased   release year of each album.
     */
    public Albums(int imageCover, String songCollection, String yearReleased) {

        mImage = imageCover;
        mCollection = songCollection;
        mReleased = yearReleased;
    }

    /**
     * Get the rght cover album.
     */
    public int getCover() {
        return mImage;
    }

    /**
     * Get the name of the Album.
     */
    public String getTitle() {
        return mCollection;
    }

    /**
     * Get the album release year.
     */
    public String getYear() {
        return mReleased;
    }
}
