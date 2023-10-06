package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void ListaOnClick(View v){
        Intent list = new Intent(Principal.this, Lista.class);
        startActivity(list);
        finish();
    }
    public void RatingOnClick(View v){
        Intent rating = new Intent(Principal.this, RatingBar.class);
        startActivity(rating);
        finish();
    }
}