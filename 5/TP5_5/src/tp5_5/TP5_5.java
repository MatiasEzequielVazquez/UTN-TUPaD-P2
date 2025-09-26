
package tp5_5;

/**
 *
 * @author vazqu
 */
public class TP5_5 {

    public static void main(String[] args) {

        Propietario propietario = new Propietario("Matias", "37681375");
        
        Computadora computadora = new Computadora("Dell", "DL123456789", propietario, 
                                                 "ASUS Z590-E", "Intel Z590");
        
        // Relaciones
        System.out.println("=== INFORMACIÓN COMPLETA ===");
        System.out.println(computadora);
        
        System.out.println("\n=== VERIFICACIÓN BIDIRECCIONAL ===");
        System.out.println("Propietario: " + propietario.getNombre());
        System.out.println("Computadora del propietario: " + propietario.getComputadora().getMarca());
        System.out.println("Propietario de la computadora: " + computadora.getPropietario().getNombre());
        
        // Composicion
        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Placa madre actual: " + computadora.getPlacaMadre().getModelo());
        
        computadora.setPlacaMadre("MSI B550-A PRO", "AMD B550");
        System.out.println("Nueva placa madre: " + computadora.getPlacaMadre().getModelo());

    }
}