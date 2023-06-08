package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class YozgatLokmasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yozgat_lokmasi);

        getSupportActionBar().setTitle("Yozgat Yöresel Tatlılar");
    }
}