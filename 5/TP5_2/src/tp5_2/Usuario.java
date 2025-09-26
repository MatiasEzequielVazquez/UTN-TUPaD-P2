
package tp5_2;

/**
 *
 * @author vazqu
 */
public class Usuario {
private String nombre;
    private String dni;
    private Celular celular; // Asociacion bidireccional
    
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    public Celular getCelular() { return celular; }
    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}