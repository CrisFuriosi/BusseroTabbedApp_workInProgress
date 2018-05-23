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
public class RelaxFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create an ArrayList of places
        final ArrayList<Place> places = new ArrayList<>();

        // Create an ArrayList of Place objects
        places.add(new Place(R.string.relax_name_escape_room, R.string.relax_description_escape_room, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_big_park, R.string.relax_description_big_park, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_park_carabinieri, R.string.relax_description_park_carabinieri, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_park_donatori, R.string.relax_description_park_donatori, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_library, R.string.relax_description_library, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_cascina, R.string.relax_description_cascina, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_villa, R.string.relax_description_villa, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_cani, R.string.relax_description_cani, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_parrocchia, R.string.relax_description_parrocchia, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.relax_name_fuoco, R.string.relax_description_fuoco, R.drawable.bussero_villasiolilegnani_small));

        // Create an {@link ArrayAdapter}.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
