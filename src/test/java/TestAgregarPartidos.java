import static org.junit.Assert.*;

import org.junit.Test;

import com.ucp.Equipo;
import com.ucp.Partido;
import com.ucp.Torneo;

public class TestAgregarPartidos {
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
}
