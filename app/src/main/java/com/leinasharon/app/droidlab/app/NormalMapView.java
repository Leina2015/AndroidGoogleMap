package com.leinasharon.app.droidlab.app;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;

/**
 * Created by Student on 9/28/2015.
 */
public class NormalMapView {
    private GoogleApiClient mGoogleApiClient;
    private Location mCurrentLocation;
//declaring types of maps
    protected final int[]
            MAP_TYPES = { GoogleMap.MAP_TYPE_SATELLITE,
            GoogleMap.MAP_TYPE_NORMAL,
            GoogleMap.MAP_TYPE_HYBRID,
            GoogleMap.MAP_TYPE_TERRAIN,
            GoogleMap.MAP_TYPE_NONE };
    private int curMapTypeIndex = 0;
}
