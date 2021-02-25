package com.dapstd.geotask.ui.filter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.HashMap;
import java.util.Map;

public class FilterViewModel extends ViewModel {



    private MutableLiveData<Map<Integer,String>> filterProps;

    public FilterViewModel() {
       filterProps = new MutableLiveData<>();
       filterProps.setValue(new HashMap<>());


    }
    public void addProps(Integer key, String val){
        filterProps.getValue().put(key, val);
    }

    public MutableLiveData<Map<Integer, String>> getFilterProps() {
        return filterProps;
    }
}