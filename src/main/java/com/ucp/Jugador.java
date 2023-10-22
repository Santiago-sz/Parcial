package com.ucp;

import java.util.List;

public class Jugador {
    String nombre;
    int numero;

    public Jugador(String nombre,int numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    } 
    public String getName(){
        return nombre;
    }

    public void add(List<Jugador> equipo) {

    }

}
