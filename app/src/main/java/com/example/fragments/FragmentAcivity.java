package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.CaseMap;
import android.os.Bundle;

public class FragmentAcivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_acivity);

        BottomFragment bottomFragment = new BottomFragment();
        UpperFragment upperFragment = new UpperFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.upperContainer, upperFragment).replace(R.id.bottomContainer, bottomFragment).commit();
    }
}