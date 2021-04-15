package com.scen.sigpre.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.scen.sigpre.mascotas.apatador.AdaptadorVistaRecycler;
import com.scen.sigpre.mascotas.modelo.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Mascota> mascotas;
    RecyclerView recyclerView;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar barraSuperior=findViewById(R.id.barraSuperior);
        setSupportActionBar(barraSuperior);

        mascotas=new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.mascota1,"Manchas",1,0));
        mascotas.add(new Mascota(R.drawable.mascota2,"Negro",2,0));
        mascotas.add(new Mascota(R.drawable.mascota3,"Pirata",4,0));
        mascotas.add(new Mascota(R.drawable.mascota4,"Goku", 7,1));

        mascotas.add(new Mascota(R.drawable.mascota5,"Firulais",9,1));
        mascotas.add(new Mascota(R.drawable.perro6,"Boby",6,1));
        mascotas.add(new Mascota(R.drawable.perro7,"Pancha",8,1));
        mascotas.add(new Mascota(R.drawable.perro8,"Bravo",10,1));
        mascotas.add(new Mascota(R.drawable.perro9,"Player",2,0));
        mascotas.add(new Mascota(R.drawable.perro10,"Temido",5,0));

        recyclerView=findViewById(R.id.recyclerViewMascotas);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        iniciarAdaptadorVistaRecy();
    }

    public void iniciarAdaptadorVistaRecy(){
        AdaptadorVistaRecycler adaptadorVistaRecycler=new AdaptadorVistaRecycler(mascotas);
        recyclerView.setAdapter(adaptadorVistaRecycler);
    }

    public void llamarFavoritos(View view) {
        Intent intent =new Intent(this,FavoritosActivity.class);
        intent.putExtra("mascotas",mascotas);
        startActivity(intent);
    }
}