package com.example.tabletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addMapsFragment(new MapsFragment(),false,"map");
        addOperationStatusFragment(new OperationInfoFragment(),false,"operation info");
    }

    public void addMapsFragment(Fragment mapFragment, boolean addToBackStack, String Tag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(addToBackStack){
            fragmentTransaction.addToBackStack(Tag);
        }
        fragmentTransaction.replace(R.id.maps_fragment_container,mapFragment,Tag);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void addOperationStatusFragment(Fragment operationStatusFragment, boolean addToBackStack, String Tag){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(addToBackStack){
            fragmentTransaction.addToBackStack(Tag);
        }
        fragmentTransaction.replace(R.id.operation_info_fragment_container,operationStatusFragment,Tag);
        fragmentTransaction.commitAllowingStateLoss();
    }
}
