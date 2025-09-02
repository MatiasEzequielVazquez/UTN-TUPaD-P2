
package tp2;

import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio9 {
    
    static final int NACIONAL = 5;
    static final int INTERNACIONAL = 10;
    
    public static void ejercicio9(){
        
        Scanner input = new Scanner(System.in);
        

        System.out.print("Ingrese el precio del producto: ");
        double precioProd = Double.parseDouble(input.next());
        System.out.print("Ingrese el peso del paquete en Kg: ");
        double peso = Double.parseDouble(input.next());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = input.next().toUpperCase();
        
       
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: " + costoEnvio);
        
        double precioAPagar = calcularTotalCompra(precioProd, costoEnvio);
        System.out.println("El total a pagar es: " + precioAPagar);
        
    }
        
        public static double calcularCostoEnvio(double peso, String zona){
            if (zona.equals("NACIONAL")){
                return peso * NACIONAL;
            }
            else{
                return peso * INTERNACIONAL;
            }
        }
        
        public static double calcularTotalCompra(double precioProd, double costoEnvio){
            return precioProd + costoEnvio;   
        }
}
