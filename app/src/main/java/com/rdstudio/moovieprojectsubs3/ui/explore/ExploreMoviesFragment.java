package com.rdstudio.moovieprojectsubs3.ui.explore;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rdstudio.moovieprojectsubs3.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExploreMoviesFragment extends Fragment {


    public ExploreMoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore_movies, container, false);
    }

}
