package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    String nombre ="";
    String siglas="";
    List<Jugador> equipo = new ArrayList<>();

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
        return equipo;
    }

    public String getSiglas() {
        return siglas;
    }
    
    public void agregar(Jugador jugador) {
        jugador.add(equipo);
    }

    public int jugadoresCantidad(){
        return equipo.size();
    }


}