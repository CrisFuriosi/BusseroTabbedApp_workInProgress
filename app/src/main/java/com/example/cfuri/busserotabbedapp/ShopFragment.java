package com.example.cfuri.busserotabbedapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShopFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create an ArrayList of places
        final ArrayList<Place> places = new ArrayList<>();

        // Create an ArrayList of Place objects, where each Place contains:
        // 1. name of current place in strings.xml
        //  2. the short description of current place in strings.xml
        //  3. the icon image of current place in drawable folder
        //  4. the descriptive (bigger) image of current place in drawable folder
        //  5. the address of current place in strings.xml
        //  (see Place.class)
        places.add(new Place(R.string.shop_name_pharmacy_europa, R.string.shop_description_pharmacy_europa, R.drawable.shop_pharmacy_europa_icon,
                R.drawable.shop_pharmacy_europa, R.string.shop_coordinates_pharmacy_europa));
        places.add(new Place(R.string.shop_name_supermarket, R.string.shop_description_supermarket,
                R.drawable.shop_supermarket_icon, R.drawable.shop_supermarket, R.string.shop_coordinates_supermarket));
        places.add(new Place(R.string.shop_name_art, R.string.shop_description_art,
                R.drawable.shop_art_icon, R.drawable.shop_art, R.string.shop_coordinates_art));
        places.add(new Place(R.string.shop_name_oilstation, R.string.shop_description_oilstation,
                R.drawable.shop_oilstation_icon, R.drawable.shop_oilstation, R.string.shop_coordinates_oilstation));
        places.add(new Place(R.string.shop_name_bikes, R.string.shop_description_bikes,
                R.drawable.shop_bikes_icon, R.drawable.shop_bikes, R.string.shop_coordinates_bikes));
        places.add(new Place(R.string.shop_name_herbalist, R.string.shop_description_herbalist,
                R.drawable.shop_herbalist_icon, R.drawable.shop_herbalist, R.string.shop_coordinates_herbalist));
        places.add(new Place(R.string.shop_name_milk, R.string.shop_description_milk,
                R.drawable.shop_milk_icon, R.drawable.shop_milk, R.string.shop_coordinates_milk));
        places.add(new Place(R.string.shop_name_farmhouse, R.string.shop_description_farmhouse,
                R.drawable.shop_farmhouse_icon, R.drawable.shop_farmhouse, R.string.shop_coordinates_farmhouse));

        // Create an {@link ArrayAdapter}.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        // Return the completed View to render on screen
        return rootView;
    }

}
