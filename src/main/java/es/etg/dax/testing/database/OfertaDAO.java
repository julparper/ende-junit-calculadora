package es.etg.dax.testing.database;

public interface OfertaDAO {
    
    /**
     * Crea una oferta para el cliente
     * @param c datos del cliente
     * @return devuelve el número de ofertas creadas, qeu debería ser 1
     * @throws Exception
     */
    public int insertar(Cliente c) throws Exception;
}
