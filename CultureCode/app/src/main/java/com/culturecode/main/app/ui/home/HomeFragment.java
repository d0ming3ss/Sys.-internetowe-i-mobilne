package com.culturecode.main.app.ui.home;

import android.location.Location;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.culturecode.main.app.R;
import com.culturecode.main.app.databinding.FragmentHomeBinding;
import com.google.android.gms.location.*;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import com.culturecode.main.app.ui.home.localisations;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;


import kotlin.Triple;

public class HomeFragment extends Fragment implements OnMapReadyCallback {

    private FragmentHomeBinding binding;
    private GoogleMap gMap;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map_id);
        mapFragment.getMapAsync(this);

        return v;
    }







    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        gMap = googleMap;
        localisations local = new localisations();

        local.initializeLocalizations();
        for(Triple<String, Double, Double> place : local.listedPlaces) {
            LatLng location = new LatLng(place.getSecond(),place.getThird());
            gMap.addMarker(new MarkerOptions().position(location).title(place.getFirst()));
        }
        gMap.moveCamera(CameraUpdateFactory.newLatLngZoom(local.wroclaw,12));
    }
}