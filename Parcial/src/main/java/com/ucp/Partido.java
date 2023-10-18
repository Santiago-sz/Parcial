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
     public Partido(Estadio estadio,Equipo local,Equipo visitante, String fecha) {
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.equipos = equipos;
        this.estadio = estadio;
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

    public String getFecha() {
        return fecha;
    }
    /*public String verificarPalabraClave(Partido partido) {
        String nombrePartido = partido.getClass().getSimpleName(); 
        if (nombrePartido.contains("Ida")) {
            return "Ida";
        } else if (nombrePartido.contains("Vuelta")) {
            return "Vuelta";
        } else {
            return "desconocido";
        }
    } */
    

    //public String getName() {
      //  return String getFecha()+
        /*String tipoPartido = verificarPalabraClave(this).equals("Ida") ? "Ida" : "Vuelta";*/
        //return String.format("Semifinal Partido %s %sx%s", /*tipoPartido,*/ local.getSiglas(), visitante.getSiglas());
    //}
    
    public Estadio getEstadio(){
        return estadio;
    }
    
    public void agregar(TarjetaBase tarjeta){
       equipos.add(tarjeta);
    }

    public int tarjetasCantidad(){
        return equipos.size();
    }
    public List<TarjetaBase> getTarjetas(){
        return equipos;
    }

}
