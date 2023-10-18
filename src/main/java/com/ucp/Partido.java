package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    Equipo local;
    Equipo visitante;
    String fecha;
    List<Tarjeta> equipos = new ArrayList<>();


    public Partido(){
        
    }
    
    public Partido(Equipo local,Equipo visitante, String fecha, List<Tarjeta> equipos) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.equipos = equipos;
    }
     public Partido(Equipo local, Equipo visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
    }

    
    public boolean verificarPalabraClave(Partido partido) {
        String nombrePartido = partido.getClass().getSimpleName();
        return nombrePartido.toLowerCase().contains("ida");
    }
    
    public String getName() {
        String total = fecha + (verificarPalabraClave(this) ? "ida" : "vuelta") +
                       local.getSiglas() + "x" + visitante.getSiglas();
        return total;
    }
    
    
}
