package com.example.cfuri.busserotabbedapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.widget.AdapterView.OnItemClickListener;

public class EatFragment extends Fragment {

    // Define Fragment Listener
    private OnFragmentInteractionListener mListener;

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    private Place currentPlace;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create an ArrayList of places
        final ArrayList<Place> places = new ArrayList<>();

        // Create an ArrayList of Place objects
        places.add(new Place(R.string.eat_name_baker_1, R.string.eat_description_baker_1, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_baker_2, R.string.eat_description_baker_2, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_icecream, R.string.eat_description_icecream, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_pizza_takeaway_1, R.string.eat_description_pizza_takeaway_1, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_pizza_takeaway_2, R.string.eat_description_pizza_takeaway_2, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_pizza_takeaway_3, R.string.eat_description_pizza_takeaway_3, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_pizza_restaurant, R.string.eat_description_pizza_restaurant, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_fish_restaurant, R.string.eat_description_fish_restaurant, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_beer, R.string.eat_description_beer, R.drawable.bussero_villasiolilegnani_small));
        places.add(new Place(R.string.eat_name_wine, R.string.eat_description_wine, R.drawable.bussero_villasiolilegnani_small));

        // Create an {@link ArrayAdapter}.
        final PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = rootView.findViewById(R.id.place_in_list);

        // Make the {@link ListView} use the {@link ArrayAdapter}.
        listView.setAdapter(placeAdapter);

        // Set OnItemClickListener: open ItemDetailActivity when item is clicked
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PlaceDetailFragment detailFragment = new PlaceDetailFragment();

                // Find current item
                currentPlace = placeAdapter.getItem(position);

                //

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.viewpager, detailFragment);
                // Inflate the layout for this fragment
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        });
        return rootView;
    }

}
