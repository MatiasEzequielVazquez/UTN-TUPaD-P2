
package tp2;
import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio3 {
    public static void ejercicio3(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad < 12) {
            System.out.println("Eres un niño");
        }
        else if (edad  >= 12 && edad <= 17){
            System.out.println("Eres un adolescente");
        }
        else if (edad  >= 18 && edad < 60){
            System.out.println("Eres un adulto");
        }
        else{
            System.out.println("Eres un adulto mayor");
        }
    
    }
}
