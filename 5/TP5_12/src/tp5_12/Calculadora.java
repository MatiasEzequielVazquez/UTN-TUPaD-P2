
package tp5_12;

/**
 *
 * @author vazqu
 */
public class Calculadora {
    
    // Dependencia de uso
    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double montoBase = impuesto.getMonto();
            double interes = montoBase * 0.05; // 5% de interés
            double recargo = montoBase * 0.02; // 2% de recargo
            double total = montoBase + interes + recargo;
            
            System.out.println("=== CÁLCULO DE IMPUESTO ===");
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre());
            System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
            System.out.println("Monto base: $" + String.format("%.2f", montoBase));
            System.out.println("Interés (5%): $" + String.format("%.2f", interes));
            System.out.println("Recargo (2%): $" + String.format("%.2f", recargo));
            System.out.println("TOTAL A PAGAR: $" + String.format("%.2f", total));
        } else {
            System.out.println("No hay impuesto para calcular");
        }
    }
    
    // Dependencia de uso
    public double calcularSoloTotal(Impuesto impuesto) {
        if (impuesto != null) {
            double montoBase = impuesto.getMonto();
            return montoBase * 1.07; // base + 7% total
        }
        return 0.0;
    }
}
