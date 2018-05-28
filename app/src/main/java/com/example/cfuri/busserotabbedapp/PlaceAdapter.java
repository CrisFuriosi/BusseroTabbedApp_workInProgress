package com.example.cfuri.busserotabbedapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// constructor
class PlaceAdapter extends ArrayAdapter<Place> {

    private final Context context = getContext();

    /* @param context: the current context. Used to inflate the layout file.
     * @param placeArrayList: a list of Place objects to display
     */
    PlaceAdapter(@NonNull FragmentActivity context, @NonNull ArrayList<Place> placeArrayList) {

        // The adapter is not using the second argument: so, it can be any value (e.g.: 0).
        super(context, 0, placeArrayList);
    }

    /**
     * @param position: the position in the list of data that should be displayed in the list item view.
     * @param view: the recycled view to populate.
     * @param parent: the parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     **/
    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (view == null) {

            // The parent View is our ListView.
            // As we don't want to attach the ListView to the parent ListView yet, attachToRoot is set to false.
            view = LayoutInflater.from(getContext()).inflate(R.layout.place, parent, false);
        }

        // Get the Place data item for this position in the list.
        // getItem() method is inherited from the ArrayAdapter superClass.
        final Place currentPlace = getItem(position);

        // Lookup Views in the places_list.xml layout for data population
        TextView nameTextView = view.findViewById(R.id.place_name);
        TextView descriptionTextView = view.findViewById(R.id.place_description);
        ImageView iconImageView = view.findViewById(R.id.place_icon);

        // Populate the data into the template view using the data object
        nameTextView.setText(currentPlace.getPlaceNameId());
        descriptionTextView.setText(currentPlace.getPlaceDescriptionId());
        iconImageView.setImageResource(currentPlace.getPlaceImageId());

        // Create an implicit Intent to open PlaceDetailActivity
        final Intent placeIntent = new Intent(context, PlaceDetailActivity.class);

        //Set a ClickListener in case the user taps on a place
        view.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when a place is clicked on
            @Override
            public void onClick(View v) {

                // Name variables to send via placeIntent
                int currentPlaceDetailImageId = currentPlace.getPlaceDetailImageId();
                int currentPlaceNameId = currentPlace.getPlaceNameId();
                int currentPlaceAddressId = currentPlace.getPlaceCoordinatesId();

                // Send Variable contents to Detail Activity
                placeIntent.putExtra("place_name", currentPlaceNameId);
                placeIntent.putExtra("place_image", currentPlaceDetailImageId);
                placeIntent.putExtra("place_address", currentPlaceAddressId);

                context.startActivity(placeIntent);
            }
        });

        // Return the completed View to render on screen
        return view;
    }
}


