package com.example.darpa.municip;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;




public class Splash extends AppCompatActivity {
    private final int SPLASHING = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ///////cargar imagen al principio desde url| cambiar la carpeta de sdestino para obtener la url
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Glide
                .with(this)
                .load("http://municipalidadnancagua.cl/NO/screener.jpg")
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .into(imageView);

        ///////////////////////////////
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
            }
        },SPLASHING);


    }
}
