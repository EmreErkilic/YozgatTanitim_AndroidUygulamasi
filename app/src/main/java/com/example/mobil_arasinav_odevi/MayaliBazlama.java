package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MayaliBazlama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mayali_bazlama);

        getSupportActionBar().setTitle("Yozgat Yöresel Yemekler");
    }
}