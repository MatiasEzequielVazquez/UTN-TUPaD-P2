
package tp5_7;

/**
 *
 * @author vazqu
 */
public class Motor {
    private String tipo;
    private String numeroSerie;
    
    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    // Getters y Setters
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    
    public String getNumeroSerie() { return numeroSerie; }
    public void setNumeroSerie(String numeroSerie) { this.numeroSerie = numeroSerie; }
    
    @Override
    public String toString() {
        return tipo + " (S/N: " + numeroSerie + ")";
    }
}