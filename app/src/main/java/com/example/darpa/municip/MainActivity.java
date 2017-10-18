package com.example.darpa.municip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button Irmensaje;
    Button Iragenda;
    Button Irguia;
    Button Irnotifica;
    //////CAMBIAR IMAGEN ///
    public int counter = 0;

    /////////////////////////////////////////


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Irmensaje = (Button) findViewById(R.id.BtnMensaje); //correo

        Irmensaje.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lemensaje = new Intent(MainActivity.this, correos.class);
                startActivity(lemensaje);
            }
        }));

        Iragenda = (Button) findViewById(R.id.BtnAgenda); ///GUIa
        Iragenda.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leagenda = new Intent(MainActivity.this, agenda.class);
                startActivity(leagenda);
            }
        }));

        Irguia = (Button) findViewById(R.id.BtnGuia);
        Irguia.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent leguia = new Intent(MainActivity.this, informaciones.class);
                startActivity(leguia);
            }
        }));


        Irnotifica = (Button) findViewById(R.id.BtnNoti);
        Irnotifica.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent leinfo = new Intent(MainActivity.this, notificacion.class);
                startActivity(leinfo);

            }
        }));

        ///hasta aqui el menu
        ////////////////////

        //cambiar imagen por click//

        final ImageView imagen = (ImageView) findViewById(R.id.imageView4);
        imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView perse = (ImageView) findViewById(R.id.imageView4);
                //perse.setImageResource(R.drawable.fondosegundo);
                if (counter == 0) {
                    perse.setImageResource(R.drawable.fondodos);
                }
                if (counter == 1) {
                    perse.setImageResource(R.drawable.fondotres);
                }
                if (counter == 2) {
                    perse.setImageResource(R.drawable.fondocuatro);
                    counter = -1;
                }
                counter++;
            }
        });

    }
}



        //////////////////







