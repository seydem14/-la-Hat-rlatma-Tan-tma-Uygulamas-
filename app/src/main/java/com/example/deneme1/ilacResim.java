package com.example.deneme1;
//ŞEYMANUR DEMİRBAŞ 180205006
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ilacResim extends AppCompatActivity {
    private ImageView img1;
    private ImageView img2;
    private ImageView img3;
    private ImageView img4;
    private ImageView img5;
    private ImageView img6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilac_resim);
        img1=findViewById(R.id.imgİzoniyazid);
        img2=findViewById(R.id.imgRifampisin);
        img3=findViewById(R.id.imgPrznamid);
        img4=findViewById(R.id.imgMorfo);
        img5= findViewById(R.id.imgEtamButol);
        img6=findViewById(R.id.imgStreptomisin);

        img1.setImageResource(R.drawable.izoniyazid);
        img2.setImageResource(R.drawable.rifampisin);
        img3.setImageResource(R.drawable.pirazinamid);
        img4.setImageResource(R.drawable.morfozinamid);
        img5.setImageResource(R.drawable.etambutol);
        img6.setImageResource(R.drawable.streptomisin);

    }
}