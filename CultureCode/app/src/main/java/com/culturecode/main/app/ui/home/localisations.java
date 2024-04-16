package com.culturecode.main.app.ui.home;

import com.google.android.gms.maps.model.LatLng;

import java.util.Vector;

import kotlin.Triple;

public class localisations {
    public Vector<Triple<String, Double, Double>> listedPlaces = new Vector<>();
    public LatLng wroclaw = new LatLng(51.10959846591886, 17.034598572454573);

    public void initializeLocalizations() {
        listedPlaces.add(new Triple<String, Double, Double>("Politechnika Wrocławska", 51.10760741877494, 17.059446815753738));
        listedPlaces.add(new Triple<String, Double, Double>("Panorama Racławicka", 51.11029266157793, 17.04498390927858));
        listedPlaces.add(new Triple<String, Double, Double>("Rynek", 51.11041273629406, 17.03107984507234));
        listedPlaces.add(new Triple<String, Double, Double>("Sky Tower", 51.09454744701896, 17.018963211893173));
        listedPlaces.add(new Triple<String, Double, Double>("Hala Targowa", 51.112528800156156, 17.03973826135461));
        listedPlaces.add(new Triple<String, Double, Double>("Hala Stulecia", 51.10679766971045, 17.07728034508164));
    }
}
