package com.example.cfuri.busserotabbedapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetailActivity extends AppCompatActivity {

    // from: https://news.ebscer.com/2015/06/how-to-treat-androids-up-button-like-a-back-button/
    // "How to treat Android’s up button like a back button"
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the Activity to use the activity_place_detail.xml layout file
        setContentView(R.layout.activity_place_detail);

        // Find Views in mp3_place_detail XML
        ImageView drawableImageView = findViewById(R.id.detail_activity_place_image);
        TextView nameTextView = findViewById(R.id.detail_activity_place_name);
        TextView coordinatesTextView = findViewById(R.id.detail_activity_place_coordinates);

        // Retrieve the data passed via placeDetailIntent intent
        int placeDetailName = getIntent().getIntExtra("place_name", 0);
        int placeDetailImage = getIntent().getIntExtra("place_image", 0);
        int placeDetailCoordinates = getIntent().getIntExtra("place_address", 0);

        // Some Places in Move category have no address (corresponding String in strings.xml is empty).
        if (TextUtils.isEmpty(getString(placeDetailCoordinates))) {
            // In that case, coordinatesTextView shall not show
            coordinatesTextView.setVisibility(View.GONE);
        }
        else{
            // Show coordinatesTextView
            coordinatesTextView.setVisibility(View.VISIBLE);

            // Get placeDetailCoordinates string content (longitude and latitude)
            final String coordinates = getString(placeDetailCoordinates);

            // Assign variable content to View
            coordinatesTextView.setText(getString(R.string.find_place_on_map));

            // Set listener on coordinatesTextView to open map location
            coordinatesTextView.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the coordinatesTextView is clicked on.
                @Override
                public void onClick(View view) {
                    // Parse map location and send intent
                    String uri = getString(R.string.geo_coordinates_prefix) + coordinates;
                    Intent coordinatesIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(coordinatesIntent);
                }
            });

        }

        // Assign variable content to other views in activity_place_detail XML
        nameTextView.setText(getString(placeDetailName));
        drawableImageView.setImageResource(placeDetailImage);
    }

}
