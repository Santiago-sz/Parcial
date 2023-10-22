package com.ucp;

public class TarjetaRoja extends TarjetaBase {

    public TarjetaRoja(Jugador jugador) {
        super("ROJA", jugador);
    }


    public TarjetaRoja(String color,Jugador jugador) {
        super("ROJA", jugador);
    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}
