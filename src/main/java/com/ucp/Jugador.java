package com.ucp;

import java.util.List;

public class Jugador implements IJugador {
    String nombre;
    int numero;
    String posicion;
    String value;

    public Jugador(String nombre,int numero){
        this.nombre = nombre;
        this.numero = numero;
        posicion = "";
    }

    public int getNumero() {
        return numero;
    } 

    public String getName(){
        return nombre;
    }

    public void add(List<Jugador> equipo) {

    }
    
    public void setPosicion(String value){
        this.posicion = value;

    }

    public String getPosicion() {
        return posicion;
    }

}
