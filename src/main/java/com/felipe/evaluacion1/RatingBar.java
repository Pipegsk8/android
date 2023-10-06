package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RatingBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);


    }

    public void VolverOnClick(View v){
        Intent vol = new Intent(RatingBar.this, Principal.class);
        startActivity(vol);
        finish();
    }
}