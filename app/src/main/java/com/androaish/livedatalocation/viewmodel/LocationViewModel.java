package com.androaish.livedatalocation.viewmodel;

import android.arch.lifecycle.ViewModel;
import android.content.Context;

import com.androaish.livedatalocation.model.LocationHelper;

public class LocationViewModel extends ViewModel {

    public LocationHelper getLocationHelper(Context mContext) {
       return LocationHelper.getInstance(mContext);
    }
}
