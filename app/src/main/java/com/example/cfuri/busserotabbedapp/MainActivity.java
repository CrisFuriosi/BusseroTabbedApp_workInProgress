package com.example.cfuri.busserotabbedapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Displays a {@link ViewPager} where each page shows a different category fragment.
 */
public class MainActivity extends AppCompatActivity implements EatFragment.OnFragmentInteractionListener {

    // parameters for onFragmentInteraction method
    int arg1;
    int arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TabFragmentAdapter adapter = new TabFragmentAdapter(this, getSupportFragmentManager());

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Give the TabLayout the ViewPager
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    public void onFragmentInteraction(Uri uri) {
        // The user selected a view.
        // Show placeDetailFragment

        PlaceDetailFragment detailFragment = PlaceDetailFragment.newInstance(arg1, arg2);
        {
            Bundle args = new Bundle();
            args.putInt("1", arg1);
            args.putInt("2", arg2);
            detailFragment.setArguments(args);
        }
    }
}


