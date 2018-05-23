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
public class MoveFragment extends Fragment {

    public MoveFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create an ArrayList of places
        final ArrayList<Place> places = new ArrayList<>();

        // Create an ArrayList of Place objects
        places.add(new Place(R.string.move_name_subway, R.string.move_description_move_name_subway, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.move_name_bus, R.string.move_description_bus, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.move_name_bike_lane, R.string.move_description_bike_lane, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.move_name_footpaths, R.string.move_description_footpaths, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.move_name_camper, R.string.move_description_camper, R.drawable.bussero_villasiolilegnani_small));

        // Create an {@link ArrayAdapter}.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
