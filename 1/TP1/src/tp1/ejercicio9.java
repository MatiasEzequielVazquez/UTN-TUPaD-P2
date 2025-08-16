
package tp1;
import java.util.Scanner; 
/**
 *
 * @author vazqu
 */
public class ejercicio9 {
    public static void ejercicio9() { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa tu nombre: "); 
        String nombre = scanner.nextLine(); // ERROR > Correccion, reemplazar metodo nextInt() por nextLine()
        System.out.println("Hola, " + nombre); 
    } 
}
