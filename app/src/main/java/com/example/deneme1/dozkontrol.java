package com.example.deneme1;
//ŞEYMANUR DEMİRBAŞ 180205006
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class dozkontrol extends AppCompatActivity {
    private ListView lstilacDoz;
    String[]listMaddeler={"İZONİYAZİD:4 kg başına 5mg","RİFAMPİSİN:8 kg başına 10mg","PİRAZİNAMİD:20 kg başına 25mg","MORFOZİNAMİD:40 mg","ETAMBUTOL:15 kg başına 20 mg","STREPTOMİSİN:12 kg başına 15mg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dozkontrol);
        lstilacDoz=(ListView)findViewById(R.id.lstilacDoz);
        final ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,android.R.id.text1,listMaddeler);
        lstilacDoz.setAdapter(adapter);
        lstilacDoz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String deger=adapter.getItem(position);
                Toast.makeText(getApplicationContext(),deger, Toast.LENGTH_SHORT).show();
            }
        });

    }
}