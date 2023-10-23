package com.ucp;

public class TarjetaRoja extends TarjetaBase {

    public TarjetaRoja(IJugador jugador) {
        super("ROJA", jugador);
    }


    public TarjetaRoja(String color,IJugador jugador) {
        super("ROJA", jugador);
    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}
