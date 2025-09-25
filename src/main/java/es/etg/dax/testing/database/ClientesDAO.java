package es.etg.dax.testing.database;


public interface ClientesDAO {

    /**
     * Devuelve el número de clientes insertados en la base de datos
     * @param Cliente
     * @return número de clientes insertados
     */
    public int insert(Cliente c) throws Exception;
}