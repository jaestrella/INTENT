package com.iesvirgendelcarmen.dam.prueba;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by matinal on 19/01/2018.
 */

public class Actividad02 extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad02);
        texto=(TextView)findViewById(R.id.texto);
        texto.append("valor pasado1"+"\n"+"valor pasado 2"+"\n"+"valor pasado 3"+"\n"+"valor pasado 4"+"\n"+"valor pasado 5");


    }
}

