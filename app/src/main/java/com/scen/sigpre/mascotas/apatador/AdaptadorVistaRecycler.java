package com.scen.sigpre.mascotas.apatador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.scen.sigpre.mascotas.R;
import com.scen.sigpre.mascotas.modelo.Mascota;

import java.util.ArrayList;

public class AdaptadorVistaRecycler extends RecyclerView.Adapter<AdaptadorVistaRecycler.MascotasViewHolder>{
    public  AdaptadorVistaRecycler(ArrayList<Mascota> mascotas){
        this.mascotas=mascotas;
    }
    ArrayList<Mascota> mascotas;
    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_animal,parent,false);
        return new MascotasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder holder, int position) {
            Mascota mascota=mascotas.get(position);
          holder.textNombre.setText(mascota.getNombre());
        holder.textLikes.setText(mascota.getLikes()+"");
        holder.imageMascota.setImageResource(mascota.getFoto());
        holder.iconoHuesoLikes.setImageResource(R.drawable.hueso_icono_contador_likes);
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {
        Button buttonLike;
        TextView textNombre;
        TextView textLikes;
        TextView textView2;
        ImageView imageMascota;
        ImageView iconoHuesoLikes;

        public MascotasViewHolder(@NonNull View itemView) {
            super(itemView);
            buttonLike=itemView.findViewById(R.id.buttonLike);
            imageMascota=itemView.findViewById(R.id.imagenMascota);
            imageMascota.setImageResource(R.drawable.ic_launcher_foreground);
            textLikes=itemView.findViewById(R.id.textLikes);
            textNombre=itemView.findViewById(R.id.textNombre);
            iconoHuesoLikes=itemView.findViewById(R.id.icono);
            textView2=itemView.findViewById(R.id.textView2);

        }
    }
}
