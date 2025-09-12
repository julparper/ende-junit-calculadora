import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import es.etg.dax.testing.Calculadora;
import es.etg.dax.testing.exception.OperacionNoValidaException;

// Las clases de test suelen tener el sufijo Test
public class CalculadoraTest {
 
    Calculadora calculadora = new Calculadora(); //

    // @BeforeEach: Antes de cada test inicializamos el objeto Calculadora
    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }


    // @Test indica que es una prueba
    @Test
    void sumar() {

        //Se realizan 4 pruebas y si las cuatro son ok, sumar será ok.
        assertAll("Suma",
                () -> assertEquals(5, calculadora.sumar(1, 4), "1 + 4 = 5"),
                () -> assertEquals(5, calculadora.sumar(2,3), "2 + 3 = 5"),
                () -> assertEquals(1, calculadora.sumar(0, 1), "0 + 1 = 1"),
                () -> assertEquals(-1, calculadora.sumar(1, -2), "1 + (-2) = -1")
        );

    }

    //Esta prueba comprueba que al dividir por cero se lanza una excepción controlada: OperacionNoValidaException
    @Test
    @DisplayName("Probar la división por cero")
    void dividirPorZeroException() {
        var ex = assertThrows(OperacionNoValidaException.class, () -> calculadora.dividir(4, 0), "La división por cero no está permitida");
        assertEquals(OperacionNoValidaException.MSG, ex.getMessage());

    }
}
