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
        equipo.add(jugador);
    }

    public int jugadoresCantidad(){
        return equipo.size();
    }

    public Jugador obtenerJugador(int numero) {
        for (int i = 0; i < equipo.size(); i++) {
            Jugador jugador = equipo.get(i);
            if (numero == jugador.getNumero()) {
                return jugador;
            }
        }
        // Si no se encuentra ningún jugador con el número proporcionado, puedes devolver null o lanzar una excepción según tus necesidades.
        return null;
    }


}