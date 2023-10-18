package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Torneo {
    String nombre;
    List<Equipo> equipos = new ArrayList<>();
    String ganador;

    public Torneo(String nombre, List<Equipo> equipos) {
        this.nombre = nombre;
        this.equipos.addAll(equipos);
    } 

    public Torneo(String nombre) {
        List<Equipo> equipos = new ArrayList<>();
        this.nombre = nombre;
    } 

    public void agregar(Equipo equipo){
    equipos.add(equipo);
    }

    public int equiposCantidad(){
        return equipos.size();
    }

}
