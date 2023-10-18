package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    String local;
    String visitante;
    String fecha;
    List<Tarjeta> equipos = new ArrayList<>();
    
    public Partido(String local, String visitante, String fecha, List<Tarjeta> equipos) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.equipos = equipos;
    }

}
