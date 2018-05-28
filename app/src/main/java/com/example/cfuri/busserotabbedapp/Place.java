package com.example.cfuri.busserotabbedapp;

/*
{@link Place} represents a single place of interest.
 */
class Place {

    // State: Variable declaration
    private final int mPlaceNameId;
    private final int mPlaceDescriptionId;
    private final int mPlaceImageId;
    private final int mPlaceDetailImageId;
    private final int mPlaceCoordinatesId;

    /**
    Constructor: create a new Place object.
     @param placeNameId identifies the name of current place in strings.xml
     @param placeDescriptionId identifies the short description of current place in strings.xml
     @param placeImageId identifies the icon image of current place in drawable folder
     @param placeDetailImageId identifies the descriptive (bigger) image of current place in drawable folder
     @param placeAddressId identifies the location of current place in strings.xml

    */
    Place(int placeNameId, int placeDescriptionId, int placeImageId,
          int placeDetailImageId, int placeAddressId) {
        mPlaceNameId = placeNameId;
        mPlaceDescriptionId = placeDescriptionId;
        mPlaceImageId = placeImageId;
        mPlaceDetailImageId = placeDetailImageId;
        mPlaceCoordinatesId = placeAddressId;
    }

    /** Method getPlaceNameId()
     * @return current place name string ID
     */
    public int getPlaceNameId() {
        return mPlaceNameId;
    }

    /** Method getPlaceDescriptionId()
     * @return current place description string ID
     */
    public int getPlaceDescriptionId() {
        return mPlaceDescriptionId;
    }

    /** Method ImageId()
     * @return current place drawable ID
     */
    public int getPlaceImageId() {
        return mPlaceImageId;
    }

    /** Method getPlaceDetailImageId()
     * @return current place detail drawable ID
     */
    public int getPlaceDetailImageId() {
        return mPlaceDetailImageId;
    }

    /** Method getPlaceCoordinatesId()
     * @return current place location string ID
     */
    public int getPlaceCoordinatesId() {
        return mPlaceCoordinatesId;
    }

}
