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

    
    public String verificarPalabraClave(Partido partido) {
        String nombrePartido = partido.getClass().getSimpleName(); 
        if (nombrePartido.contains("Ida")) {
            return "Ida";
        } else if (nombrePartido.contains("Vuelta")) {
            return "Vuelta";
        } else {
            return "desconocido";
        }
    }
    

    public String getName() {
        String tipoPartido = verificarPalabraClave(this).equals("Ida") ? "Ida" : "Vuelta";
        return String.format("Semifinal Partido %s %sx%s", tipoPartido, local.getSiglas(), visitante.getSiglas());
    }
    
    
}
