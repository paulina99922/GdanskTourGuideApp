package com.example.android.gdansktourguideapp;

/**
 * Created by Paulina on 6-6-2017.
 */

public class Place {

    private String mName;
    private int mImageView;
    private String mDescription;
    private String mAddress;
    private String mLink;

    public Place(String name, int image, String description, String address, String link) {
        mName = name;
        mImageView = image;
        mAddress = address;
        mDescription = description;
        mLink = link;
    }

    public String getName() { return mName; }
    public int getImageResource() {return mImageView; }
    public String getDescription() {return mDescription; }
    public String getAddress() {return mAddress; }
    public String getLink() {return mLink;}

}



