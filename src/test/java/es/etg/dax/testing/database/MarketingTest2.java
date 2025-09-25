package es.etg.dax.testing.database;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;


/**
 * En esta variante de la prueba, uno de los dos backend (OfertaDAO) sí tiene implementación (OfertaDAOImpl).
 * Ahora le decimos a Mockito que use el real (spy) de OfertaDAO y simule al completo ClieteDAO.
 * 
 */

@ExtendWith(MockitoExtension.class) //Esta es neceasaria para usar mockito
public class MarketingTest2 {

    @InjectMocks
    Marketing marketing; //Aquí inyectamos la clase que queremos probar


    // Hacemos un @mock por cada clase que vamos a "mocketizar" o simular
    @Mock
    ClientesDAO clientesDAO;


    @Spy
    OfertaDAO ofertaDAO = new OfertaDAOImpl(); //Objeto real, lo espiamos

    
    //Ahora realizamos una prueba de forma convencional
    @Test
    public void contratar() throws Exception{
        
        //Ahora le decimos a Mockito que tiene que devolver en el caso de que llamen a cada mock. En este caso le decimos que cuando llamen a cada mock, devuelva 1
        Mockito.when(clientesDAO.insert(any())).thenReturn(1);
        //Mockito.when(ofertaDAO.insertar(any())).thenReturn();

        //Llamamos a la clase que realiza la lógica compleja:
        boolean resultado = marketing.contratar("María", "García");

        //Comprobamos que ha ido bien (true)
        assertTrue(resultado);

    }
    
}
