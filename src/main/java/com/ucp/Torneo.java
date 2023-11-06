package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    String nombre;
    List<Equipo> equipos = new ArrayList<>();
    List<Partido> partidos = new ArrayList<>();
    String ganador;

    public Torneo(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos.addAll(equipos);
    } 

    public Torneo(String nombre) {
        List<Equipo> equipos = new ArrayList<>();
        List<Partido> partidos = new ArrayList<>();
        this.nombre = nombre;
    } 

    public void agregar(Object objeto) {
        if (objeto instanceof Equipo) {
            equipos.add((Equipo) objeto);
        } else if (objeto instanceof Partido) {
            partidos.add((Partido) objeto);
        }
    }
    
     public int partidosCantidad(){
        return partidos.size();
    }

    public int equiposCantidad(){
        return equipos.size();
    }

    public List<Partido> getPartidos() {
        
        return partidos;
    }
}
