package es.etg.dax.testing.database;

public class Marketing {
    
    private ClientesDAO clienteDao;
    private OfertaDAO ofertaDao;

    
    public Marketing(ClientesDAO clienteDao, OfertaDAO ofertaDao) {
        this.clienteDao = clienteDao;
        this.ofertaDao = ofertaDao;
    }


    /** Este método recoge los datos de un cliente, 
     * registra el cliente en la base de datos
     * registra una oferta en otra base de datos
     * Si va todo bien, devuelve true, en caso contrario, false
     */

    public boolean contratar(String nombre, String apellidos) throws Exception{
        Cliente c = new Cliente(nombre, apellidos);

        int numClientes = clienteDao.insert(c);
        int numOferta = ofertaDao.insertar(c);

        if (numClientes==1 && numOferta == 1)
            return true;
        return false;
    }
}
