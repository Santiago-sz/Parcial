package com.ucp;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    Equipo local;
    Equipo visitante;
    String fecha;
    List<TarjetaBase> equipos = new ArrayList<>();
    Estadio estadio;

    public Partido(){
        
    }
    
    public Partido(Equipo local,Equipo visitante, String fecha, List<TarjetaBase> equipos) {
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
     public Partido(Estadio estadio, Equipo local, Equipo visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.estadio = estadio;
    }
    

    public String getName() {
        return getFecha() + " " + local.getSiglas() +"x"+ visitante.getSiglas();
    }
    public String getFecha(){
        return fecha;
    }
    
    public String verificarPalabraClave(Partido partido) {
        if (partido.getFecha().contains("Ida")) {
            return "Ida";
        } else if (partido.getFecha().contains("Vuelta")) {
            return "Vuelta";
        } else {
            return "Ninguna palabra clave encontrada";
        }
    }

    public int tarjetasCantidad(){
        return equipos.size();
    }

    
    public void agregar(TarjetaBase tarjeta) {
        equipos.add(tarjeta);
    }

    
    public List<TarjetaBase> getTarjetas(){
        return equipos;
    }
    
    public Estadio getEstadio() {
        return estadio;
    }

    

}