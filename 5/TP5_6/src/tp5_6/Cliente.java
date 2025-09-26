
package tp5_6;

/**
 *
 * @author vazqu
 */
public class Cliente {
    private String nombre;
    private String telefono;
    
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    
    @Override
    public String toString() {
        return nombre + " (Tel: " + telefono + ")";
    }
}