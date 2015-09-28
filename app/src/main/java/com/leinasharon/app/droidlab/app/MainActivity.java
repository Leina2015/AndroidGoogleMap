package com.leinasharon.app.droidlab.app;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity {
    //declaring google map
    private GoogleMap googleMap;
    private MarkerOptions markerOptions;
    double latitude;
    double longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising google Maps
        googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.mapFragment)).getMap();

        markerOptions = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Nairobi");
        //set marker icon
        markerOptions.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker));

        //animate

        CameraPosition cameraPosition = new CameraPosition.Builder().target(
                new LatLng(17.385044, 78.486671)).zoom(12).build();

        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));


        //enabling application
        googleMap.setMyLocationEnabled(true);

        // Enabling zooming gestures but by default is true
        googleMap.getUiSettings().setZoomGesturesEnabled(false);

        //Enabling compass
        googleMap.getUiSettings().setCompassEnabled(true);
        //add the marker to the map
        googleMap.addMarker(markerOptions);


        //Button onclick to do some action for different type of maps
          /*Normal MAP BUTTON */

        Button mapButton = (Button) findViewById(R.id.normal);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View m) {
                Log.d("DroidLab.Gps", "Loading Map..");
                // Loading Google Map View
                startService(new Intent(MainActivity.this, NormalMapView.class));
            }


        });
    }

}