import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Equipo;
import com.ucp.Estadio;
import com.ucp.IJugador;
import com.ucp.Jugador;
import com.ucp.Partido;
import com.ucp.TarjetaAmarilla;
import com.ucp.TarjetaRoja;
import com.ucp.Var;

public class CantidadDeTarjetasPorEquipo {
     @Test
    public void el_var_obtiene_solo_tarjetas_de_un_equipo_parcial_ejercicio_ejemplo_08()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        IJugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        IJugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        IJugador jugadorBoca19 = new Jugador("Valentin Barco", 19);

        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        

        IJugador jugadorPalmeiras10 = new Jugador("Rony", 10);

        palmeiras.agregar(jugadorPalmeiras10);

        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    

        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);

        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);

        Var elVar  = new Var(partido);

        assertEquals(3, partido.tarjetasCantidad());    
       
        assertEquals(2, elVar.cantidadTarjetas(boca));        
        assertEquals(1, elVar.cantidadTarjetas(palmeiras));
 


    }



}
