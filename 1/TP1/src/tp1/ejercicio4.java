
package tp1;
import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio4 {
    
    public static void ejercicio4(){
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad + " años");
        
    }
    
}
