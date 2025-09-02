
package tp2;
import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio2 {
    public static void ejercicio2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        
        int contador = 0;
        int num1 = Integer.parseInt(input.nextLine());
        
        while(contador <2){
            System.out.println("Ingrese otro numero: ");
            int num2 = Integer.parseInt(input.nextLine());
            num1 = (num1 > num2) ? num1 : num2;;
            contador ++;          
        }
        
        System.out.println("El numero mayor de los 3 ingresados es: " + num1);
    }
}
