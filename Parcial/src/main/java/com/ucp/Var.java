package com.ucp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Var {
Partido partido;

    public Var(Partido partido){
    }

    public int cantidadTarjetasRojas() {
       
        Predicate<TarjetaBase>tarjetasRojas = tarjeta ->tarjeta.getColor().contains("ROJA"); // Filtrar tarjetas rojas
            int tarjetaRojas = Math.toIntExact(partido.getTarjetas().stream().filter(tarjetasRojas).count());
    
        return tarjetaRojas;
    }
    
    public int cantidadTarjetasAmarillas(){
            
        Predicate<TarjetaBase>tarjetasAmarillas = tarjeta ->tarjeta.getColor().contains("ROJA"); // Filtrar tarjetas rojas
            int tarjetaAmarillas = Math.toIntExact(partido.getTarjetas().stream().filter(tarjetasAmarillas).count());
    
        return tarjetaAmarillas;
    }
}
