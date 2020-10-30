package org.iesch.alberto.ciclosdevidafragment.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.iesch.alberto.ciclosdevidafragment.MainActivity;
import org.iesch.alberto.ciclosdevidafragment.R;


public class BlankFragment extends Fragment {



    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("CICLODEVIDA", "Fragment os Attach");
        Toast.makeText(context,"Mensaje desde Fragment", Toast.LENGTH_LONG ).show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i("CICLODEVIDA", "Fragment os onCreateView");




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }
}