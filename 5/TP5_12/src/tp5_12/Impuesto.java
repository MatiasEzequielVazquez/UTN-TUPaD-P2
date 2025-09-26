
package tp5_12;

/**
 *
 * @author vazqu
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente; // Asociacion unidireccional
    
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
    }
    
    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
    
    public Contribuyente getContribuyente() { return contribuyente; }
    public void setContribuyente(Contribuyente contribuyente) { this.contribuyente = contribuyente; }
    
    @Override
    public String toString() {
        return "Impuesto: $" + String.format("%.2f", monto) + 
               " - " + (contribuyente != null ? contribuyente.toString() : "Sin contribuyente");
    }
}