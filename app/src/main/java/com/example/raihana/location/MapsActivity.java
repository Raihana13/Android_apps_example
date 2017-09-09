package com.example.raihana.location;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;


import static com.example.raihana.location.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(map);
        mapFragment.getMapAsync(this);
    }



    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        // Add a marker in Sydney and move the camera
        LatLng dhaka = new LatLng(23.8103, 90.4125);
        mMap.addMarker(new MarkerOptions().position(dhaka).title("Dhaka, Bangladesh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dhaka,1f));


        LatLng seoul = new LatLng(37, 126);
        mMap.addMarker(new MarkerOptions().position(seoul).title("Seoul, South Korea"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(seoul));

        LatLng australia = new LatLng(-25.274398,133.775136);
        mMap.addMarker(new MarkerOptions().position(australia).title("Australia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(australia));

        LatLng bhutan = new LatLng(27.514162, 90.433601);
        mMap.addMarker(new MarkerOptions().position(bhutan).title("Bhutan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bhutan));

        LatLng croatia = new LatLng(45.1, 15.2);
        mMap.addMarker(new MarkerOptions().position(croatia).title("Croatia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(croatia));


        LatLngBounds BANGLADESH = new LatLngBounds(
                new LatLng(23, 90), new LatLng(23.8103, 90.4125));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BANGLADESH.getCenter(), 10));


    }


}
