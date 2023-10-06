package com.felipe.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Lista extends AppCompatActivity {

    List<ListElements> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElements("#775447", "Felipe", "Chile","Activo"));
        elements.add(new ListElements("#335513", "Andres", "Uruguay","Ausente"));
        elements.add(new ListElements("#774993", "Tomas", "Paraguay","Ausente"));
        elements.add(new ListElements("#115478", "Pedro", "Argentina","Ausente"));
        elements.add(new ListElements("#276642", "Baki", "Japon","Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecycleView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }


}