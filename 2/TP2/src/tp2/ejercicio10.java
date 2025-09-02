
package tp2;

import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio10 {
    
    public static void ejercicio10(){
        
        Scanner input = new Scanner(System.in);
        

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.next());
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.next());
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.next());
        
       
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
    }
        
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }

}