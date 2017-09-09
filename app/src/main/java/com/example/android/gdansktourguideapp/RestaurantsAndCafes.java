package com.example.android.gdansktourguideapp;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantsAndCafes extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locations_list, container, false);

        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place (getString(R.string.pikawa_cafe_name), (R.drawable.image), getString(R.string.pikawa_cafe_description),
                getString(R.string.pikawa_cafe_address), getString(R.string.pikawa_cafe_website)));

        ListCategory adapter = new ListCategory(getActivity(), places);
        ListView locationsList = (ListView) getView().findViewById(R.id.locations_list);
        locationsList.setAdapter(adapter);

        return rootView;
    }
}
