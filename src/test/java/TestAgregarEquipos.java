import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Equipo;
import com.ucp.Torneo;

public class TestAgregarEquipos {

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
}