package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        }

    public void ingresarOnClick(View v){
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, pantalla_c.class);
                startActivity(intent);
                finish();
            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea,2000);
    }

    public void registroOnClick(View v){
        Intent form = new Intent(MainActivity.this,Formulario.class);
        startActivity(form);
    }
    public void AdvertenciaOnClick(View v){
        Intent adv = new Intent(MainActivity.this, Sobremi.class);
        startActivity(adv);
    }


}