package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class YoreselYemekler extends AppCompatActivity {

    ListView YoreselYemekListView_ee;

    ArrayAdapter<String> adapter;

    Intent Intent_ee;

    String[] YoreselYemek = {"Arabaşı Çorbası",
            "Testi Kebabı",
            "Madımak Yemeği",
            "Yozgat Böreği",
            "Mayalı Bazlama",
            "Çapçup Mantı",
            "Parmak Çörek" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoresel_yemekler);

        getSupportActionBar().setTitle("Yozgat Yöresel Yemekleri");

        YoreselYemekListView_ee = findViewById(R.id.YoreselYemekListView_ee);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,YoreselYemek);
        YoreselYemekListView_ee.setAdapter(adapter);

        YoreselYemekListView_ee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                switch (i)  {
                    case 0: Intent_ee = new Intent(YoreselYemekler.this,ArabasiCorbasi.class);
                        startActivity(Intent_ee);
                        break;
                    case 1: Intent_ee = new Intent(YoreselYemekler.this,TestiKebabi.class);
                        startActivity(Intent_ee);
                        break;
                    case 2: Intent_ee = new Intent(YoreselYemekler.this,MadimakYemegi.class);
                        startActivity(Intent_ee);
                        break;
                    case 3: Intent_ee = new Intent(YoreselYemekler.this,YozgatBoregi.class);
                        startActivity(Intent_ee);
                        break;
                    case 4: Intent_ee = new Intent(YoreselYemekler.this,MayaliBazlama.class);
                        startActivity(Intent_ee);
                        break;
                    case 5: Intent_ee = new Intent(YoreselYemekler.this,CapcupManti.class);
                        startActivity(Intent_ee);
                        break;
                    case 6: Intent_ee = new Intent(YoreselYemekler.this,Parmak_corek.class);
                        startActivity(Intent_ee);
                        break;
                    default:
                }
            }
        });
    }
}