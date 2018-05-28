package com.example.cfuri.busserotabbedapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EatFragment extends Fragment {

    // Required empty public constructor
    public EatFragment() {
    }

    /**
     * onCreateView() finds the view to show current Fragment, and inflates its contents
    * */
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the ListView
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
        places.add(new Place(R.string.eat_name_baker_pan, R.string.eat_description_baker_pan, R.drawable.eat_baker_pan_icon,
                R.drawable.eat_baker_pan, R.string.eat_coordinates_baker_pan));
        places.add(new Place(R.string.eat_name_baker_atelier, R.string.eat_description_baker_atelier, R.drawable.eat_baker_atelier_icon,
                R.drawable.eat_baker_atelier, R.string.eat_coordinates_baker_atelier));
        places.add(new Place(R.string.eat_name_icecream, R.string.eat_description_icecream, R.drawable.eat_icecream_icon,
                R.drawable.eat_icecream, R.string.eat_coordinates_icecream));
        places.add(new Place(R.string.eat_name_pizza_takeaway_oasi, R.string.eat_description_pizza_takeaway_oasi,
                R.drawable.eat_pizza_takeaway_oasi_icon, R.drawable.eat_pizza_takeaway_oasi, R.string.eat_coordinates_pizza_takeaway_oasi));
        places.add(new Place(R.string.eat_name_pizzeria_circolo, R.string.eat_description_pizzeria_circolo, R.drawable.eat_pizzeria_circolo_icon,
                R.drawable.eat_pizzeria_circolo, R.string.eat_coordinates_pizzeria_circolo));
        places.add(new Place(R.string.eat_name_lupo_fish_restaurant, R.string.eat_description_lupo_fish_restaurant,
                R.drawable.eat_lupo_fish_restaurant_icon, R.drawable.eat_lupo_fish_restaurant, R.string.eat_coordinates_lupo_fish_restaurant));
        places.add(new Place(R.string.eat_name_zero_pub, R.string.eat_description_zero_pub, R.drawable.eat_zero_pub_icon,
                R.drawable.eat_zero_pub, R.string.eat_coordinates_zero_pub));
        places.add(new Place(R.string.eat_name_bottega, R.string.eat_description_bottega, R.drawable.eat_bottega_icon,
                R.drawable.eat_bottega, R.string.eat_coordinates_bottega));

        // Create an {@link ArrayAdapter}.
        final PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        // Return the completed View to render on screen
        return rootView;
    }

}
