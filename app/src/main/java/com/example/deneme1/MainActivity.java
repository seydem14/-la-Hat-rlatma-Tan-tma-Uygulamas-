package com.example.deneme1;
//ŞEYMANUR DEMİRBAŞ   180205006
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private Button btnIlaclar;
    private Button btnKontrol;
    private Button btnResimler;
    private Button btnUyari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView)findViewById(R.id.imgVerem);
        img.setImageResource(R.drawable.verem);


        btnIlaclar=findViewById(R.id.btnIlaclar);
        btnIlaclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openilacDurum();
            }
        });
        btnKontrol=findViewById(R.id.btnKontrol);
        btnKontrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openilacKontrol();
            }
        });
        btnResimler=findViewById(R.id.btnResimler);
        btnResimler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openilacResimler();
            }
        });
        btnUyari=findViewById(R.id.btnUyari);
        btnUyari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openilacUyari();
            }
        });


    }
    public void openilacDurum()
    {
        Intent intent=new Intent(this,ilacDurum.class);
        startActivity(intent);
    }
    public void openilacKontrol()
    {
        Intent intent2=new Intent(this,dozkontrol.class);
        startActivity(intent2);
    }
    public void openilacResimler()
    {
        Intent intent3=new Intent(this,ilacResim.class);
        startActivity(intent3);
    }
    public void openilacUyari()
    {
        Intent intent4=new Intent(this,ilacUyari.class);
        startActivity(intent4);
    }

}