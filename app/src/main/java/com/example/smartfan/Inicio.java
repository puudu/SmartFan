package com.example.smartfan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void irPantallaConfiguracion(View v){
        Intent i = new Intent(Inicio.this, Configuracion.class);
        startActivity(i);
    }

    public void irPantallaEstadisticas(View v){
        Intent i = new Intent(Inicio.this, estadisticas.class);
        startActivity(i);
    }
}
