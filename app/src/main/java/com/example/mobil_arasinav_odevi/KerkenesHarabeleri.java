package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class KerkenesHarabeleri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerkenes_harabeleri);

        getSupportActionBar().setTitle("Yozgat Tarihi Yerler");
    }
}