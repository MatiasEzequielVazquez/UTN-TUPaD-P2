
package tp1;
import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio8 {
    public static void ejercicio8() {
        int num1, num2;
        double divisionInt, divisionDouble;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        divisionInt = num1 / num2;
        System.out.println("\nEl resultado de division sin casting es: " + divisionInt + "\nEn donde no se considera la parte decimal, por ser num1 y num2 del tipo Integer\n\n");
        
        divisionDouble = (double) num1 / num2;
        System.out.println("El resultado de division con casting es: " + divisionDouble + "\nDebido a que el casting permite considerar a num1 como double al momento de evaluar la variable, \nmanteniendo asi la parte decimal.");
    }
}
