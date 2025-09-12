package es.etg.dax.testing.exception;

public class OperacionNoValidaException extends Exception{

    public static final String MSG = "No se puede dividir por cero";


    @Override
    public String getMessage() {
        return MSG;
    }
    
}
