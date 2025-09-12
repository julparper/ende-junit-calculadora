package es.etg.dax.testing.database;

public class Cliente {
 
    private String nombre;
    private String apellidos;

    
    public Cliente(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    

}
