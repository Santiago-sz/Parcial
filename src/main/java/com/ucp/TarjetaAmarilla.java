package com.ucp;

public class TarjetaAmarilla extends TarjetaBase {

    public TarjetaAmarilla(Jugador jugador) {
        super("AMARILLA", jugador);
    }
    
    public TarjetaAmarilla(String color,Jugador jugador) {
        super("AMARILLA", jugador);
    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}

