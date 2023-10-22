package com.ucp;

public class Var {
Partido partido;
TarjetaAmarilla tarjetaAmarilla;
TarjetaRoja tarjetaRoja;   

public Var(Partido partido){
this.partido = partido;
}   
public int cantidadTarjetasRojas() {
    int tarjetas = 0;
    for (TarjetaBase tarjeta : partido.getTarjetas()) {
        if (tarjeta instanceof TarjetaRoja) {
            if (tarjeta.getJugador().getNumero() == tarjetaRoja.getJugador().getNumero()) {
                tarjetas++;
            }
        }
    }
    return tarjetas;
}

public int cantidadTarjetasAmarillas() {
    int tarjetas = 0;
    for (TarjetaBase tarjeta : partido.getTarjetas()) {
        if (tarjeta instanceof TarjetaAmarilla) {
            if (tarjeta.getJugador().getNumero() == tarjetaAmarilla.getJugador().getNumero()) {
                tarjetas++;
            }
        }
    }
    return tarjetas;
}

}
