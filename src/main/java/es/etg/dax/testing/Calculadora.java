package es.etg.dax.testing;

import es.etg.dax.testing.exception.OperacionNoValidaException;

public class Calculadora {
    

    public int sumar(int a, int b){
        return a+b;
    }

    public int restar(int a, int b){
        return a-b;
    }

    public int multiplicar(int a, int b){
        return a*b;
    }

    public int dividir(int a, int b) throws OperacionNoValidaException{
        if (b==0)
            throw new OperacionNoValidaException();
        else
            return a/b;
    }

}


