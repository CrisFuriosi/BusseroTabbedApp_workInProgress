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

        // Create an ArrayList of Place objects, where each Place contains:
        // 1. name of current place in strings.xml
        //  2. the short description of current place in strings.xml
        //  3. the icon image of current place in drawable folder
        //  4. the descriptive (bigger) image of current place in drawable folder
        //  5. the address of current place in strings.xml (warning: in some cases this String is empty!)
        //  (see Place.class)
        places.add(new Place(R.string.move_name_subway, R.string.move_description_subway,
                R.drawable.move_subway_icon, R.drawable.move_subway, R.string.move_coordinates_subway));
        places.add(new Place(R.string.move_name_bus, R.string.move_description_bus,
                R.drawable.move_bus_icon, R.drawable.move_bus, R.string.move_coordinates_bus));
        places.add(new Place(R.string.move_name_bike_lane, R.string.move_description_bike_lane,
                R.drawable.move_bike_lane_icon, R.drawable.move_bike_lane, R.string.move_coordinates_bike_lane));
        places.add(new Place(R.string.move_name_footpaths, R.string.move_description_footpaths,
                R.drawable.move_footpaths_icon, R.drawable.move_footpaths, R.string.move_coordinates_footpaths));
        places.add(new Place(R.string.move_name_camper, R.string.move_description_camper,
                R.drawable.move_camper_icon, R.drawable.move_camper, R.string.move_coordinates_camper));

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
