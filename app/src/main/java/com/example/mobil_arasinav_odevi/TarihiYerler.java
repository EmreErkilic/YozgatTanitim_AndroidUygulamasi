package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TarihiYerler extends AppCompatActivity {

    ListView TarihiYerListView_ee;
    ArrayAdapter<String> adapter;
    Intent Intent_ee;

    String[] TarihiYer = { "Gelin Kayası",
            "Kerkenes Harabeleri (Kayıp Şehir Pteria)",
            "Basilica Therma",
            "Çapanoğlu Camii",
            "Yozgat Saat Kulesi",
            "Nizamoğlu Konağı (Yozgat Müzesi)",
            "Çeşka Yeraltı Şehri",
            "Çamlık Milli Parkı"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarihi_yerler);

        getSupportActionBar().setTitle("Yozgatta Bulunan Tarihi Yerler");

        TarihiYerListView_ee = (ListView) findViewById(R.id.TarihiYerListView_ee);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,TarihiYer);
        TarihiYerListView_ee.setAdapter(adapter);

        TarihiYerListView_ee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                switch (i)  {
                    case 0: Intent_ee = new Intent(TarihiYerler.this, GelinKayasi.class);
                        startActivity(Intent_ee);
                        break;
                    case 1: Intent_ee = new Intent(TarihiYerler.this,KerkenesHarabeleri.class);
                        startActivity(Intent_ee);
                        break;
                    case 2:Intent_ee = new Intent(TarihiYerler.this,BasilicaTherma.class);
                        startActivity(Intent_ee);
                        break;
                    case 3: Intent_ee = new Intent(TarihiYerler.this,CapanogluCamii.class);
                        startActivity(Intent_ee);
                        break;
                    case 4: Intent_ee = new Intent(TarihiYerler.this,SaatKulesi.class);
                        startActivity(Intent_ee);
                        break;
                    case 5: Intent_ee = new Intent(TarihiYerler.this,NizamogluKonagi_Muze.class);
                        startActivity(Intent_ee);
                        break;
                    case 6: Intent_ee = new Intent(TarihiYerler.this,CeskaYeraltiSehri.class);
                        startActivity(Intent_ee);
                        break;
                    case 7: Intent_ee = new Intent(TarihiYerler.this,Yozgat_camlik.class);
                        startActivity(Intent_ee);
                        break;
                        default:
                }
            }
        });
    }
}