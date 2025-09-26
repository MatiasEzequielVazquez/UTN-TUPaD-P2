
package tp5_10;

/**
 *
 * @author vazqu
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private Titular titular; // Asociacion bidireccional
    private ClaveSeguridad claveSeguridad; // Composicion
    
    public CuentaBancaria(String cbu, double saldo, Titular titular, 
                         String codigoInicial, String fechaCreacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.titular = titular;
        

        this.claveSeguridad = new ClaveSeguridad(codigoInicial, fechaCreacion);
        

        if (titular != null) {
            titular.setCuenta(this);
        }
    }
    

    public String getCbu() { return cbu; }
    public void setCbu(String cbu) { this.cbu = cbu; }
    
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setCuenta(this);
        }
    }
    
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        }
    }
    
    public boolean extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            return true;
        }
        return false;
    }
    
    public void cambiarClave(String nuevoCodigo, String fecha) {
        this.claveSeguridad.cambiarClave(nuevoCodigo, fecha);
    }
    
    @Override
    public String toString() {
        return "=== CUENTA BANCARIA ===\n" +
               "CBU: " + cbu + "\n" +
               "Saldo: $" + String.format("%.2f", saldo) + "\n" +
               "Titular: " + (titular != null ? titular.toString() : "Sin titular") + "\n" +
               "Seguridad: " + (claveSeguridad != null ? claveSeguridad.toString() : "Sin clave");
    }
}