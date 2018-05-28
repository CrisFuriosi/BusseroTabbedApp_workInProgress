package com.example.cfuri.busserotabbedapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
class TabFragmentAdapter extends FragmentPagerAdapter {

    // Context of the app
    private final Context mContext;

    /**
     * Create a new {@link TabFragmentAdapter} object.
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    TabFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Method returns total number of pages
    @Override
    public int getCount() {
        return 4;
    }

    // Method returns right fragment for each index position
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EatFragment();
            case 1:
                return new ShopFragment();
            case 2:
                return new MoveFragment();
            default:
                return new VisitFragment();
        }
    }

    /** Method returns tab titles.
     * @param position is the index position
     * @return current tab title
     */

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.tab_eat);
            case 1:
                return mContext.getString(R.string.tab_shop);
            case 2:
                return mContext.getString(R.string.tab_move);
            default:
                return mContext.getString(R.string.tab_visit);
        }
    }
}
