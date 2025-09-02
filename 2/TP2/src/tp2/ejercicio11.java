
package tp2;

import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio11 {
    
    static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void ejercicio11(){
        
        Scanner input = new Scanner(System.in);
        

        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.next());

       
        calcularDescuentoEspecial(precio);
        
    }
        
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

}