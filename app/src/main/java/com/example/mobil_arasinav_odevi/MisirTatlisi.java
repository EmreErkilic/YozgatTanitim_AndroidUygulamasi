package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MisirTatlisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misir_tatlisi);

        getSupportActionBar().setTitle("Yozgat Yöresel Tatlılar");
    }
}