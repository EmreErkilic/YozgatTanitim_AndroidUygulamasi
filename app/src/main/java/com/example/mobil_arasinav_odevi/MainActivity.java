package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     ListView AnasayfaListView_ee;
     ArrayAdapter<String> adapter;
     String[] Anasayfa = {"Yozgat Tarihçesi",
             "Yozgatta Bulunan Tarihi Yerler",
             "Yozgat Yöresel Yemekleri",
             "Yozgat Yöresel Tatlıları"};

     Intent Intent_ee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Anasayfa");

        AnasayfaListView_ee = (ListView) findViewById(R.id.AnasayfaListView_ee);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,Anasayfa);
        AnasayfaListView_ee.setAdapter(adapter);


        AnasayfaListView_ee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i)  {
                    case 0: Intent_ee = new Intent(MainActivity.this,YozgatTarihcesi.class);
                        startActivity(Intent_ee);
                        break;
                    case 1: Intent_ee = new Intent(MainActivity.this,TarihiYerler.class);
                    startActivity(Intent_ee);
                        break;
                    case 2: Intent_ee =new Intent(MainActivity.this,YoreselYemekler.class);
                        startActivity(Intent_ee);
                        break;
                    case 3: Intent_ee =new Intent(MainActivity.this,YoreselTatlilar.class);
                        startActivity(Intent_ee);
                        break;
                    default:
                }




            }
        });

    }
}