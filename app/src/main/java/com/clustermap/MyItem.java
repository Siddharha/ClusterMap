package com.clustermap;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

/**
 * Created by BLUEHORSE DEVLOPER on 7/20/2015.
 */
public class MyItem implements ClusterItem {
    private final LatLng mPosition;

    public MyItem(double lat, double lng) {
        mPosition = new LatLng(lat, lng);
    }
    @Override
    public LatLng getPosition() {
        return mPosition;
    }



}
