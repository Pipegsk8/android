package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Formulario extends AppCompatActivity {

    private Spinner spinner1;
    private Spinner spinner2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        spinner1 = (Spinner)findViewById(R.id.spinner);
        spinner2 = (Spinner)findViewById(R.id.spinnerRegion);

        String [] opciones = {"Selecciones una opcion","Hombre","Mujer","Otros"};
        String [] regiones = {"Región de Arica y Parinacota","Región de Tarapacá", "Región de Antofagasta", "Región de Atacama", "Región de Coquimbo", "Región de Valparaiso", "Region Metropolitana"};


        ArrayAdapter <String> listaspinner = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, opciones);
        spinner1.setAdapter(listaspinner);

        ArrayAdapter <String> listaregion = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,regiones);
        spinner2.setAdapter(listaregion);
    }
    public void ValidarOnClick(View v){
        finish();
    }
}
