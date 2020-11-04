package id.putraprima.mvvmlogin.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.MainActivity;
import id.putraprima.mvvmlogin.R;

public class SplashFragment extends Fragment {
    int duration = 3600;
    public SplashFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false);

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent = Intent(SplashFragment.this, MainActivity.class)
//            }
//        },3600);
    }
}