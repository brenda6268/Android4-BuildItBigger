package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.androidjokes.jokeDisplay;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
 import com.example.android.javajokes.javaJokesClass;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private String myJoke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        return root;
    }

    // step 2 add intent
   // private void launchAndroidLib(String myjoke) {
    //    Intent myIntent = new Intent(getActivity(), jokeDisplay.class);
    //    myIntent.putExtra("JOKE", myjoke);
    //    startActivity(myIntent);
    //}

    private void getJoke() {
        //launchAndroidLib(myJoke);
        new EndpointsAsyncTask(getActivity()).execute();
    }


}

