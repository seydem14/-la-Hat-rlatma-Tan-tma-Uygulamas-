package com.example.deneme1;
//ŞEYMANUR DEMİRBAŞ 180205006
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ilacDurum extends AppCompatActivity {
    private MultiAutoCompleteTextView multiİlacDurum;
    private TextView txtilacDurum;
    String[]ilaclar={"H-(İzoniyazid)-AÇ ", "R-(Rifampisin)-TOK", "Z-(Pirazinamid)-TOK","M-(Morfozinamid)-TOK","E-(Etambutol)-AÇ","S-(Streptomisin)-TOK"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilac_durum);
        multiİlacDurum=findViewById(R.id.multiİlacDurum);
        txtilacDurum=findViewById(R.id.txtilacDurum);
        StringBuilder text=new StringBuilder();

        text.append("İLAÇ LİSTESİ:").append("\n");
        for (String deger:ilaclar)
        {
            text.append(deger).append(",");
        }
        txtilacDurum.setText(text);
        ArrayAdapter multiAdapter=new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1,ilaclar);
        multiİlacDurum.setAdapter(multiAdapter);
        multiİlacDurum.setThreshold(1);
        multiİlacDurum.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());




    }
}