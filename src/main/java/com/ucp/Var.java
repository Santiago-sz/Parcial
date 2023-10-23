package com.ucp;

import java.util.List;

public class Var {
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
    List<TarjetaBase> tarjetas = equipo.getTarjetas();
    long cantidadTarjetasAmarillas = tarjetas.stream()
                                              .filter(tarjeta -> tarjeta instanceof TarjetaAmarilla)
                                              .count();

    long cantidadTarjetasRojas = tarjetas.stream()
                                       .filter(tarjeta -> tarjeta instanceof TarjetaRoja)
                                       .count();
    int i = (int) (cantidadTarjetasAmarillas + cantidadTarjetasRojas);
    return i;
}

/*public int cantidadTarjetasRojas() {
    // Obtener la lista de tarjetas del partido
    List<TarjetaBase> tarjetas = partido.getTarjetas();
    
    // Inicializar un contador para las tarjetas rojas
    int contadorTarjetasRojas = 0;
    
    // Recorrer la lista de tarjetas usando un bucle for-each
    for (TarjetaBase tarjeta : tarjetas) {
        // Verificar si la tarjeta es una instancia de TarjetaRoja
        if (tarjeta instanceof TarjetaRoja) {
            // Incrementar el contador si la tarjeta es roja
            contadorTarjetasRojas++;
        }
    }
    
    // Devolver el número total de tarjetas rojas encontradas
    return contadorTarjetasRojas;
} */

public void partido(){
    

}

}