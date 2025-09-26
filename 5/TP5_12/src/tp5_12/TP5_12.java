
package tp5_12;

/**
 *
 * @author vazqu
 */
public class TP5_12 {

    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Maria Rodriguez", "27-12345678-9");
        
        Impuesto impuesto = new Impuesto(50000.00, contribuyente);
        
        Calculadora calculadora = new Calculadora();
        
        // Dependencia de uso
        System.out.println("=== DEPENDENCIA DE USO ===");
        calculadora.calcular(impuesto);
        
        System.out.println("\n=== CÁLCULO SIMPLE ===");
        double total = calculadora.calcularSoloTotal(impuesto);
        System.out.println("Total calculado: $" + total);
        
        System.out.println("\n=== VERIFICACIÓN DE DEPENDENCIA ===");
        System.out.println("La calculadora no almacena impuestos, solo los procesa temporalmente");
        
        Contribuyente otroContribuyente = new Contribuyente("Juan Pérez", "20-87654321-7");
        Impuesto otroImpuesto = new Impuesto(75000.00, otroContribuyente);
        calculadora.calcular(otroImpuesto);
    }
}