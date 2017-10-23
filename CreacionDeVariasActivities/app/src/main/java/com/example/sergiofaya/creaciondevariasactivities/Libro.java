package com.example.sergiofaya.creaciondevariasactivities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sergio on 09/10/2017.
 */

public class Libro implements Parcelable {
    String titulo;
    String autor;
    String fecha;

    protected Libro(Parcel in) {
        titulo= in.readString();
        autor= in.readString();
        fecha= in.readString();
    }

    protected Libro(String titulo, String autor, String fecha) {
        this.titulo= titulo;
        this.autor= autor;
        this.fecha= fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public static final Creator<Libro> CREATOR = new Creator<Libro>() {
        @Override
        public Libro createFromParcel(Parcel in) {
            return new Libro(in);
        }

        @Override
        public Libro[] newArray(int size) {
            return new Libro[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(titulo);
        dest.writeString(autor);
        dest.writeString(fecha);

    }
}
