package com.ucp;

public class TarjetaAmarilla extends TarjetaBase {

    public TarjetaAmarilla(IJugador jugador) {
        super("AMARILLA", jugador);
    }
    
    public TarjetaAmarilla(String color,IJugador jugador) {
        super("AMARILLA", jugador);
    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }
}

