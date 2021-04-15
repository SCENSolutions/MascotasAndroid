package com.scen.sigpre.mascotas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scen.sigpre.mascotas.apatador.AdaptadorVistaRecycler;
import com.scen.sigpre.mascotas.modelo.Mascota;

import java.util.ArrayList;

public class FavoritosActivity extends AppCompatActivity {
    private ArrayList<Mascota> mascotaFavoritos;
    private RecyclerView recyclerView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favoritos);
        Bundle parametros=getIntent().getExtras();
        ArrayList<Mascota>        mascotas = (ArrayList<Mascota>) parametros.getSerializable("mascotas");
        mascotaFavoritos=new ArrayList<>();
        for (Mascota mascotaTurno:
             mascotas) {
            if(mascotaTurno.getFavorito()==1)
                mascotaFavoritos.add(mascotaTurno);

        }

        recyclerView=findViewById(R.id.recyclerViewMascotas);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        iniciarAdaptadorVistaRecy();
        Toolbar barraSuperior=findViewById(R.id.barraSuperior2);
        setSupportActionBar(barraSuperior);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
    public void iniciarAdaptadorVistaRecy(){
        AdaptadorVistaRecycler adaptadorVistaRecycler=new AdaptadorVistaRecycler(mascotaFavoritos);
        recyclerView.setAdapter(adaptadorVistaRecycler);
    }
}
