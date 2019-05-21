package com.user.discoverfood.Repartidor;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.user.discoverfood.R;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        double latitud = Double.parseDouble(RepartidorActivity.latitudAux);
        double longitud = Double.parseDouble(RepartidorActivity.longitudAux);

        mMap = googleMap;
        LatLng principal = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(principal).title(RepartidorActivity.nombreAux).snippet("Cliente"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(principal,15));
    }
}