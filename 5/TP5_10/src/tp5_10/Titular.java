
package tp5_10;

/**
 *
 * @author vazqu
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // Asociacion bidireccional
    
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    public CuentaBancaria getCuenta() { return cuenta; }
    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }
    
    @Override
    public String toString() {
        return nombre + " (DNI: " + dni + ")";
    }
}