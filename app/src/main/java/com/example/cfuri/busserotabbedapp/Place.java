package com.example.cfuri.busserotabbedapp;

/*
{@link Place} represents a single place of interest.
 */
class Place {

    // State: Variable declaration
    private final int mPlaceNameId;
    private final int mPlaceDescriptionId;
    private final int mPlaceImageId;

    // Constructor : create a new Place object. Assign String 1 (Default language), String 2 (copiadimiwok), and int (Image ID)
    Place(int placeNameId, int placeDescriptionId, int placeImageId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
        mPlaceImageId = placeImageId;
    }

    // Method: Output String  1 (Default)
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    // Method: Output String 2 (copiadimiwok)
    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    // Method: Output int (Image resource ID)
    public int getPlaceImageId() {
        return mPlaceImageId;
    }

}
