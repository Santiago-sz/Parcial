package com.ucp;


public abstract class TarjetaBase{

    private String color;
    private Jugador jugador;

    public TarjetaBase(String color, Jugador jugador) {
        setColor(color);
        setJugador(jugador);
    }
    public String getColor() {
        return color;
    }
   
    public void setColor(String value) {
        this.color = value;
    }
    public Jugador getJugador() {
        return jugador;
    }

    private void setJugador(Jugador value) {
        this.jugador = value;
    }
  }
