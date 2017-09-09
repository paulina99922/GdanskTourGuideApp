package com.example.android.gdansktourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class List extends FragmentPagerAdapter {

    public Context mContext;

    public List(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Museums();
        } else if (position == 1) {
            return new RestaurantsAndCafes();
        } else {
            return new TouristAttractions();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

