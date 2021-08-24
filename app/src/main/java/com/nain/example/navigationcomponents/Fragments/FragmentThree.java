package com.nain.example.navigationcomponents.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nain.example.navigationcomponents.R;

public class FragmentThree extends Fragment {

    View view;
    Button back, next;

    public FragmentThree() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_three, container, false);

        back = view.findViewById(R.id.backOneBtnID);
        next = view.findViewById(R.id.buzazazttontwoID);

        next.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentSix);
        });

        return view;
    }
}