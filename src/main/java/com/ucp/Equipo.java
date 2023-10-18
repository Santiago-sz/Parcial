package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    String nombre ="";
    String siglas="";
    List<Jugador> equipos = new ArrayList<>();

    public Equipo(String nombre,String siglas){
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return siglas;
    }
    
    public List<Jugador> getEquipos() {
        return equipos;
    }


}