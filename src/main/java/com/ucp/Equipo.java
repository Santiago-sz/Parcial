package com.ucp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipo {

    String nombre ="";
    String siglas="";
    List<IJugador> equipo = new ArrayList<>();
    List<String> posiciones = new ArrayList<>();
    List<TarjetaBase> tarjetas = new ArrayList<>();

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List<TarjetaBase> tarjetas) {
        this.tarjetas = tarjetas;
    }

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
    
    public List<IJugador> getEquipos() {
        return equipo;
    }


    public String getSiglas() {
        return siglas;
    }
    
    public void agregar(IJugador jugador) {
        equipo.add(jugador);
    }

    public int jugadoresCantidad(){
        return equipo.size();
    }

    public IJugador obtenerJugador(int numero) {
        for (int i = 0; i < equipo.size(); i++) {
            IJugador jugador = equipo.get(i);
            if (numero == jugador.getNumero()) {
                return jugador;
            }
        }
        // Si no se encuentra ningún jugador con el número proporcionado, puedes devolver null o lanzar una excepción según tus necesidades.
        return null;
    }
    public void setPosicion(String Posicion){
        List<String> posiciones = new ArrayList<>();
        posiciones.add("Portero");

    }

    public String imprimirPlantel() {
        // Ordenar la lista por el número del jugador
        Collections.sort(equipo, (jugador1, jugador2) -> jugador1.getNumero() - jugador2.getNumero());

        // Construir la cadena con los jugadores ordenados
        StringBuilder plantel = new StringBuilder();
        for (IJugador jugador : equipo) {
            plantel.append("[").append(jugador.getNumero()).append("] ")
                  .append(jugador.getName()).append(" (").append(jugador.getPosicion()).append("), ");
        }

        // Devolver la cadena del plantel
        return plantel.toString().substring(0, plantel.length() - 2);
    }

}