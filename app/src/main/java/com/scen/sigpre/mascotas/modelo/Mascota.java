package com.scen.sigpre.mascotas.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class Mascota implements Parcelable {
    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    int favorito;
    protected Mascota(Parcel in) {
        nombre = in.readString();
        foto = in.readInt();
        likes = in.readInt();
        favorito = in.readInt();
    }

    public static final Creator<Mascota> CREATOR = new Creator<Mascota>() {
        @Override
        public Mascota createFromParcel(Parcel in) {
            return new Mascota(in);
        }

        @Override
        public Mascota[] newArray(int size) {
            return new Mascota[size];
        }
    };

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    String nombre;
    int foto;

    public Mascota() {
    }

    @Override
    public String toString() {
        return "mascota{" +
                "foto='" + foto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", likes=" + likes +
                '}';
    }

    public Mascota(int foto, String nombre, int likes,int favorito) {
        this.foto = foto;
        this.nombre = nombre;
        this.likes = likes;
        this.favorito = favorito;
    }

    int likes;

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(foto);
        dest.writeInt(likes);
        dest.writeInt(favorito);
    }
}
