import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Equipo;
import com.ucp.Estadio;
import com.ucp.Jugador;
import com.ucp.Partido;
import com.ucp.TarjetaAmarilla;
import com.ucp.TarjetaRoja;
import com.ucp.Torneo;

public class Parcial1Tests {

    @Test
    public void torneo_agregar_equipos_parcial_ejercicio_ejemplo_01()
    {
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");

        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");

        torneo.agregar(boca);        
        torneo.agregar(palmeiras);


        assertEquals("Boca Juniors", boca.getName());            
        assertEquals("BOC", boca.getAbreviatura());        
    
        assertEquals("Palmeiras", palmeiras.getName());  
        assertEquals("PAL", palmeiras.getAbreviatura());        
        
        assertEquals(2, torneo.equiposCantidad());
    }



    @Test
    public void torneo_agregar_partidos_parcial_ejercicio_ejemplo_02()
    {
        Torneo torneo = new Torneo("Copa Conmebol Libertadores");

        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");
        Equipo internacional = new Equipo("Internacional", "INT");        
        Equipo fluminense = new Equipo("Fluminense", "FLU");

        torneo.agregar(boca);        
        torneo.agregar(palmeiras);
        torneo.agregar(internacional);        
        torneo.agregar(fluminense);
            
        Partido partido1Ida = new Partido(internacional, fluminense, "Semifinal Partido Ida");
        Partido partido1Vuelta = new Partido(fluminense, internacional, "Semifinal Partido Vuelta");   

        Partido partido2Ida = new Partido(palmeiras, boca, "Semifinal Partido Ida");
        Partido partido2Vuelta = new Partido(boca, palmeiras, "Semifinal Partido Vuelta");    

        
        torneo.agregar(partido1Ida);
        torneo.agregar(partido2Vuelta);

        torneo.agregar(partido2Ida);
        torneo.agregar(partido2Vuelta);

        assertEquals(4, torneo.partidosCantidad());  
        assertEquals("Semifinal Partido Ida INTxFLU", partido1Ida.getName());        
        assertEquals("Semifinal Partido Vuelta FLUxINT", partido1Vuelta.getName());      
        assertEquals("Semifinal Partido Ida PALxBOC", partido2Ida.getName());        
        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido2Vuelta.getName());

    }



    @Test
    public void torneo_agregar_partidos_parcial_ejercicio_ejemplo_011()
    {
        Equipo internacional = new Equipo("Internacional", "INT");        
        Equipo fluminense = new Equipo("Fluminense", "FLU");

            
        Partido partido1Ida = new Partido(internacional, fluminense, "Semifinal Partido Ida");

        partido1Ida.verificarPalabraClave(partido1Ida);

        assertEquals("Ida", partido1Ida.verificarPalabraClave(partido1Ida));  
    }

    
    @Test
    public void torneo_agregar_jugadores_a_un_equipo_parcial_ejercicio_ejemplo_03()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");          
        
        Jugador jugador10 = new Jugador("Edinson Cavani", 10);   
        Jugador jugador19 = new Jugador("Valentin Barco", 19);
  
        boca.agregar(jugador10);         
        boca.agregar(jugador19); 

        assertEquals(2, boca.jugadoresCantidad());        
        
        assertEquals("Edinson Cavani", boca.obtenerJugador(10).getName());          
        assertEquals("Valentin Barco", boca.obtenerJugador(19).getName());  
    }


    
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
    @Test
    public void estadio_se_debe_crear_en_una_ubicacion_parcial_ejercicio_ejemplo_05()
    {                
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");


        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());


    }

    @Test
    public void un_partido_debe_disputarse_en_un_estadio_en_una_fecha_parcial_ejercicio_ejemplo_06()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");  
       
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());


        assertEquals("Semifinal Partido Vuelta BOCxPAL", partido.getName());        
        assertEquals("La Bombonera, Buenos Aires (Argentina)", partido.getEstadio().toString());          
         
    }

     @Test
    public void tarjeta_roja_y_amarilla_parcial_ejercicio_ejemplo_07()
    {        
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo palmeiras = new Equipo("Palmeiras", "PAL");        
       
        Jugador jugadorBoca6 = new Jugador("Marcos Rojo", 6);
        Jugador jugadorBoca10 = new Jugador("Edinson Cavani", 10);  
        Jugador jugadorBoca19 = new Jugador("Valentin Barco", 19);


        boca.agregar(jugadorBoca6);            
        boca.agregar(jugadorBoca10);      
        boca.agregar(jugadorBoca19);        


        Jugador jugadorPalmeiras10 = new Jugador("Rony", 10);


        palmeiras.agregar(jugadorPalmeiras10);


        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");
       
        Partido partido = new Partido(estadioBombonera, boca, palmeiras, "Semifinal Partido Vuelta");    


        TarjetaRoja tarjetaRojaParaJugador6DeBoca = new TarjetaRoja(jugadorBoca6);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DeBoca = new TarjetaAmarilla(jugadorBoca10);        
        TarjetaAmarilla tarjetaAmarillaParaJugador10DePalmeiras = new TarjetaAmarilla(jugadorPalmeiras10);




        partido.agregar(tarjetaRojaParaJugador6DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DeBoca);
        partido.agregar(tarjetaAmarillaParaJugador10DePalmeiras);


        assertEquals(3, partido.tarjetasCantidad());    


        assertEquals("ROJA", partido.getTarjetas().get(0).getColor());  
        assertEquals(6, partido.getTarjetas().get(0).getJugador().getNumero());                
        assertEquals("Marcos Rojo", partido.getTarjetas().get(0).getJugador().getName());  
         
         
        assertEquals("AMARILLA", partido.getTarjetas().get(1).getColor());  
        assertEquals(10, partido.getTarjetas().get(1).getJugador().getNumero());                
        assertEquals("Edinson Cavani", partido.getTarjetas().get(1).getJugador().getName());


         
        assertEquals("AMARILLA", partido.getTarjetas().get(2).getColor());  
        assertEquals(10, partido.getTarjetas().get(2).getJugador().getNumero());                
        assertEquals("Rony", partido.getTarjetas().get(2).getJugador().getName());
 


    }


}
