package com.scen.sigpre.mascotas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;

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
        mascotas.add(new Mascota(R.drawable.mascota1,"Perrito 1",5));
        mascotas.add(new Mascota(R.drawable.mascota2,"Perrito 1",6));
        mascotas.add(new Mascota(R.drawable.mascota3,"Perrito 1",8));
        mascotas.add(new Mascota(R.drawable.mascota4,"Perrito 1",9));
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
}