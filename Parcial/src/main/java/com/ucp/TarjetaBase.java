package com.ucp;


public abstract class TarjetaBase{


    private static String color;
    private IJugador jugador;


    public TarjetaBase(String color, IJugador jugador) {
        setColor(color);
        setJugador(jugador);
    }

    public static String getColor() {
        return color;
    }
   
    public void setColor(String value) {
        this.color = value;
    }


    public Jugador getJugador() {
        return jugador;
    }


   
    private void setJugador(IJugador value) {
        this.jugador = value;
    }


   
    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getNombre());
    }
}
