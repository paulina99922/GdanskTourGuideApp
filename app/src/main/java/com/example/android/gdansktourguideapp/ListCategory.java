package com.example.android.gdansktourguideapp;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import static com.example.android.gdansktourguideapp.R.id.address;
import static com.example.android.gdansktourguideapp.R.id.link;

public class ListCategory extends ArrayAdapter<Place> {
    ListCategory(@NonNull Activity context, ArrayList<Place> places) {
        super(context, 0 ,places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_description, parent, false);
        }

        Place nPlace = getItem(position);

        TextView mName = (TextView) listView.findViewById(R.id.name);
        mName.setText(nPlace.getName());

        ImageView mImageView = (ImageView) listView.findViewById(R.id.image);
        mImageView.setImageResource(R.drawable.image);

        TextView mDescription = (TextView) listView.findViewById(R.id.description);
        mDescription.setText(nPlace.getDescription());

        TextView mAddress = (TextView) listView.findViewById(address);
        mAddress.setText(nPlace.getAddress());

        TextView mLink = (TextView) listView.findViewById(link);
        mLink.setText(nPlace.getLink());

        return listView;
    }

}