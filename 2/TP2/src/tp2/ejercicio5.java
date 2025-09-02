
package tp2;
import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio5 {
      public static void ejercicio5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero (0 para terminar): ");
        
        int suma = 0;
        int num = Integer.parseInt(input.next());
        
        while(num != 0){
            if (num % 2 ==0){
                suma += num;
                }
            System.out.println("Ingrese otro numero (0 para terminar): ");
            num = Integer.parseInt(input.next());  
        }
        
        System.out.println("La suma total de pares acumulada es de: " + suma);
    }
}
