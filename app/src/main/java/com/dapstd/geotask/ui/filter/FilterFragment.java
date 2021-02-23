package com.dapstd.geotask.ui.filter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.dapstd.geotask.R;
import com.dapstd.geotask.databinding.FragmentFilterBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Map;

public class FilterFragment extends Fragment {

    private FilterViewModel filterViewModel;
    private FragmentFilterBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        filterViewModel =
                new ViewModelProvider(this).get(FilterViewModel.class);

        binding = FragmentFilterBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        FloatingActionButton sportBtn = binding.sportButton;
        FloatingActionButton medicalBtn = binding.medicalButton;
        FloatingActionButton museumsBtn = binding.museumsButton;
        FloatingActionButton beautyBtn = binding.beautyButton;
        FloatingActionButton placesBtn = binding.placesButton;
        FloatingActionButton foodBtn = binding.foodButton;
        FloatingActionButton govermentBtn = binding.govermentButton;
        FloatingActionButton shopBtn = binding.shopButton;

        sportBtn.setOnClickListener(this::onClick);
        medicalBtn.setOnClickListener(this::onClick);
        museumsBtn.setOnClickListener(this::onClick);
        beautyBtn.setOnClickListener(this::onClick);
        placesBtn.setOnClickListener(this::onClick);
        foodBtn.setOnClickListener(this::onClick);
        govermentBtn.setOnClickListener(this::onClick);
        shopBtn.setOnClickListener(this::onClick);


        filterViewModel.getFilterProps().observe(getViewLifecycleOwner(), new Observer<Map<Integer, String>>() {
            @Override
            public void onChanged(Map<Integer, String> stringIntegerMap) {

            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    @SuppressLint({"UseCompatLoadingForDrawables", "UseCompatLoadingForColorStateLists"})
    public void onClick(View v) {
        if(v.getTag().equals("0")){
            filterViewModel.addProps(v.getId(),"1");
            v.setTag("1");
            v.setBackgroundTintList(getResources().getColorStateList(R.color.purple_200));
        }else{
            filterViewModel.addProps(v.getId(),"0");
            v.setTag("0");
            v.setBackgroundTintList(getResources().getColorStateList(R.color.teal_200));
        }
    }
}