package com.felipe.evaluacion1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.felipe.evaluacion1.db.dbHelper;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    FirebaseFirestore firestore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firestore = FirebaseFirestore.getInstance();

        Map<String, Object> users = new HashMap<>();
        users.put("Nombre", "Felipe");
        users.put ("Apellido", "Villalobos");
        users.put("Correo", "correo1@gmail.com");
        users.put("password", "1234");

        firestore.collection("users").add(users).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Exitoso", Toast.LENGTH_LONG).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Fallido", Toast.LENGTH_LONG).show();

            }
        });
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