package com.dapstd.geotask.ui.search;

import android.location.LocationManager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.dapstd.geotask.MainActivity;
import com.dapstd.geotask.Place;

import java.util.List;

public class SearchViewModel extends ViewModel {

    private MutableLiveData<List<Place>> listPlaces;


    public LiveData<List<Place>> getPlaces() {
        return listPlaces;
    }

    public SearchViewModel() {
        listPlaces = new MutableLiveData<>();



    }



}