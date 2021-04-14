package com.scen.sigpre.mascotas.modelo;

public class Mascota {
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

    public Mascota(int foto, String nombre, int likes) {
        this.foto = foto;
        this.nombre = nombre;
        this.likes = likes;
    }

    int likes;
}
