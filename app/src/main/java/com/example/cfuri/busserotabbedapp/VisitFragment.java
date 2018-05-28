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
public class VisitFragment extends Fragment {

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
        //  5. the address of current place in strings.xml
        //  (see Place.class)
        places.add(new Place(R.string.visit_name_escape_room, R.string.visit_description_escape_room,
                R.drawable.visit_escape_room_icon, R.drawable.visit_escape_room, R.string.visit_coordinates_escape_room));
        places.add(new Place(R.string.visit_name_molgora_park, R.string.visit_description_molgora_park,
                R.drawable.visit_molgora_park_icon, R.drawable.visit_molgora_park, R.string.visit_coordinates_molgora_park));
        places.add(new Place(R.string.visit_name_sports_park, R.string.visit_description_sports_park,
                R.drawable.visit_sports_park_icon, R.drawable.visit_sports_park, R.string.visit_coordinates_sports_park));
        places.add(new Place(R.string.visit_name_park_donatori, R.string.visit_description_park_donatori,
                R.drawable.visit_park_donatori_icon, R.drawable.visit_park_donatori, R.string.visit_coordinates_park_donatori));
        places.add(new Place(R.string.visit_name_library, R.string.visit_description_library,
                R.drawable.visit_library_icon, R.drawable.visit_library, R.string.visit_coordinates_library));
        places.add(new Place(R.string.visit_name_martesana, R.string.visit_description_martesana,
                R.drawable.visit_martesana_icon, R.drawable.visit_martesana, R.string.visit_coordinates_martesana));
        places.add(new Place(R.string.visit_name_church, R.string.visit_description_church,
                R.drawable.visit_church_icon, R.drawable.visit_church, R.string.visit_coordinates_church));
        places.add(new Place(R.string.visit_name_bed_and_breakfast, R.string.visit_description_bed_and_breakfast,
                R.drawable.visit_bed_and_breakfast_icon, R.drawable.visit_bed_and_breakfast, R.string.visit_coordinates_bed_and_breakfast));

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
