package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Var {
AVAR nose1,nose2,nose3;
AsistenteDeVideo Asis;
Partido partido;
TarjetaAmarilla tarjetaAmarilla;
TarjetaRoja tarjetaRoja;   

public Var(Partido partido){
this.partido = partido;
}   

public int cantidadTarjetasRojas() {
    // Obtener la lista de tarjetas del partido y convertirla a un stream
    List<TarjetaBase> tarjetas = partido.getTarjetas();
    
    // Usar el método filter para obtener un stream de tarjetas rojas y contarlas
    long cantidadTarjetasRojas = tarjetas.stream()
                                       .filter(tarjeta -> tarjeta instanceof TarjetaRoja)
                                       .count();
    
    // Devolver el número total de tarjetas rojas encontradas como un entero
    return (int) cantidadTarjetasRojas;
}

public int cantidadTarjetasAmarillas() {
    // Obtener la lista de tarjetas del partido y convertirla a un stream
    List<TarjetaBase> tarjetas = partido.getTarjetas();
    
    // Usar el método filter para obtener un stream de tarjetas amarillas y contarlas
    long cantidadTarjetasAmarillas = tarjetas.stream()
                                              .filter(tarjeta -> tarjeta instanceof TarjetaAmarilla)
                                              .count();
    
    // Devolver el número total de tarjetas amarillas encontradas como un entero
    return (int) cantidadTarjetasAmarillas;
}


  public int cantidadTarjetas(Equipo equipo){
        List<TarjetaBase> listaTarjetas = new ArrayList<>();
        Predicate<TarjetaBase> buscarTarjeta = tarjeta -> equipo.getEquipos().contains(tarjeta.getJugador());
        listaTarjetas.addAll(partido.getTarjetas().stream().filter(buscarTarjeta).collect(Collectors.toList()));
        return listaTarjetas.size();
    }

}