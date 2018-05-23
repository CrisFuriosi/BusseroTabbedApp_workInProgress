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

        //Create an ArrayList of places
        final ArrayList<Place> places = new ArrayList<>();

        // Create an ArrayList of Place objects
        places.add(new Place(R.string.shop_name_pharmacy_1, R.string.shop_description_pharmacy_1, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_supermarket, R.string.shop_description_supermarket, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_bank, R.string.shop_description_bank, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_art, R.string.shop_description_art, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_oilstation, R.string.shop_description_oilstation, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_bikes, R.string.shop_description_bikes, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_pharmacy_2, R.string.shop_description_pharmacy_2, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_herbalist, R.string.shop_description_herbalist, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_milk, R.string.shop_description_milk, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.shop_name_farmhouse, R.string.shop_description_farmhouse, R.drawable.bussero_villasiolilegnani_small));

        // Create an {@link ArrayAdapter}.
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
