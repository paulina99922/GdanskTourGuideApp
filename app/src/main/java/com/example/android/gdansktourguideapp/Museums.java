package com.example.android.gdansktourguideapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import static android.R.attr.id;
import static java.security.AccessController.getContext;

public class Museums extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.national_museum_name), (R.drawable.image), getString(R.string.national_museum_address),
                getString(R.string.national_museum_description), getString(R.string.national_museum_website)));
        places.add(new Place(getString(R.string.amber_museum_name), (R.drawable.image), getString(R.string.amber_museum_address),
                getString(R.string.amber_museum_description), getString(R.string.amber_museum_website)));

        ListCategory adapter = new ListCategory(getActivity(), places);
        ListView locationsList = (ListView) getView().findViewById(R.id.locations_list);
        locationsList.setAdapter(adapter);

        return rootView;
    }

}

