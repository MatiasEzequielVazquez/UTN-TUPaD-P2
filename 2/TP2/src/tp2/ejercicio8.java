
package tp2;

import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio8 {
        public static void ejercicio8(){
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Ingrese el precio base de un producto: ");
        double precioBase = Double.parseDouble(input.next());
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%.");
        double impuesto = Double.parseDouble(input.next());
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%.");
        double descuento = Double.parseDouble(input.next());

        double precioFinal = calcularPrecioFinal(precioBase,impuesto, descuento);
            System.out.println("El precio final del producto es: " + precioFinal);

        
        }
        
        public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
            return precioBase + (precioBase * impuesto/100) - (precioBase * descuento/100);   
        }
}
