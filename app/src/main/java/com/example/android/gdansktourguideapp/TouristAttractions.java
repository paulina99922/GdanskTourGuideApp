package com.example.android.gdansktourguideapp;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Context;

public class TouristAttractions extends android.support.v4.app.Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.zuraw_name), R.drawable.image, getString(R.string.zuraw_description), getString(R.string.zuraw_address),
                getString(R.string.zuraw_website)));

        ListView locationsList = (ListView) getView().findViewById(R.id.locations_list);

        ListCategory adapter = new ListCategory(getActivity(), places);

        locationsList.setAdapter(adapter);

        return rootView;
    }

}



