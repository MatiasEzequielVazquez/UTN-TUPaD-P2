
package tp5_10;

/**
 *
 * @author vazqu
 */
public class TP5_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Roberto Fernández", "20123456789");
        

        CuentaBancaria cuenta = new CuentaBancaria("0123456789012345678901", 
                                                  15000.00, titular, 
                                                  "1234", "2024-01-15");
        
        // Relaciones
        System.out.println("=== INFORMACIÓN INICIAL ===");
        System.out.println(cuenta);
        
        System.out.println("\n=== VERIFICACIÓN BIDIRECCIONAL ===");
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("CBU de la cuenta del titular: " + titular.getCuenta().getCbu());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        

        System.out.println("\n=== OPERACIONES BANCARIAS ===");
        cuenta.depositar(5000.00);
        System.out.println("Después de depositar $5000: $" + String.format("%.2f", cuenta.getSaldo()));
        
        boolean extraido = cuenta.extraer(3000.00);
        System.out.println("Extracción de $3000: " + (extraido ? "Exitosa" : "Fallida"));
        System.out.println("Saldo actual: $" + String.format("%.2f", cuenta.getSaldo()));
        

        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Clave actual: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        
        cuenta.cambiarClave("9876", "2024-09-25");
        System.out.println("Clave actualizada: " + cuenta.getClaveSeguridad().getUltimaModificacion());
        System.out.println("La clave de seguridad es parte integral de la cuenta (composición)");

        System.out.println("\n=== VALIDACIÓN DE FONDOS ===");
        boolean extracionFallida = cuenta.extraer(20000.00);
        System.out.println("Intento de extraer $20000: " + (extracionFallida ? "Exitosa" : "Fondos insuficientes"));
        System.out.println("Saldo final: $" + String.format("%.2f", cuenta.getSaldo()));
        
        System.out.println("\n" + cuenta);
    }
}