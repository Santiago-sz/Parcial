import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Equipo;
import com.ucp.Jugador;
import com.ucp.Partido;
import com.ucp.TarjetaRoja;

public class TestSacartarjetaRoja {
    @Test
    public void torneo_sacar_tarjeta_roja_a_un_jugador_en_un_partido_parcial_ejercicio_ejemplo_04()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
        
        Jugador jugador10 = new Jugador("Edinson Cavani", 10);   
        Jugador jugador19 = new Jugador("Valentin Barco", 19);
  
        boca.agregar(jugador10);         
        boca.agregar(jugador19); 

        Partido partidoIda = new Partido(palmeiras, boca, "Semifinal Partido Ida");    

        TarjetaRoja tarjetaRojaParaJugador10DeBoca = new  TarjetaRoja("ROJA", jugador10);

        partidoIda.agregar(tarjetaRojaParaJugador10DeBoca);

        assertEquals(1, partidoIda.tarjetasCantidad());          
        
        assertEquals("ROJA", partidoIda.getTarjetas().get(0).getColor());           
        assertEquals("Edinson Cavani", partidoIda.getTarjetas().get(0).getJugador().getName());   


    }
}
