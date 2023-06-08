package com.example.mobil_arasinav_odevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class YoreselTatlilar extends AppCompatActivity {

    ListView YoreselTatliListView_ee;
    ArrayAdapter<String> adapter;
    Intent Intent_ee;

    String[] YoreselTatli = { "Yozgat Lokması",
            "İncir Uyutması",
            "Mısır Tatlısı"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoresel_tatlilar);

        getSupportActionBar().setTitle("Yozgat Yöresel Tatlıları");

        YoreselTatliListView_ee = (ListView) findViewById(R.id.YoreselTatliListView_ee);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,YoreselTatli);
        YoreselTatliListView_ee.setAdapter(adapter);

        YoreselTatliListView_ee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {

                switch (i)  {
                    case 0: Intent_ee = new Intent(YoreselTatlilar.this, YozgatLokmasi.class);
                        startActivity(Intent_ee);
                        break;
                    case 1: Intent_ee = new Intent(YoreselTatlilar.this, IncirUyutmasi.class);
                        startActivity(Intent_ee);
                        break;
                    case 2: Intent_ee = new Intent(YoreselTatlilar.this, MisirTatlisi.class);
                        startActivity(Intent_ee);
                        break;
                    default:
                }
            }
        });
    }
}