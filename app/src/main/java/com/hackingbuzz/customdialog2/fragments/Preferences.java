package com.hackingbuzz.customdialog2.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hackingbuzz.customdialog2.R;

/**
 * Created by Avi Hacker on 2/17/2017.
 */

public class Preferences extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.preferences, container , false);

        return v;
    }
}
