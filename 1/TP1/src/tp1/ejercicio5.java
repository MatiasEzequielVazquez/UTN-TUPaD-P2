
package tp1;
import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio5 {
    
    public static void operaciones(){
        
        int num1, num2;
        double suma, resta, multiplicacion, division;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese otro numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("Para el numero: " + num1 + " y el numero: " + num2);
        System.out.println("Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: "
         + multiplicacion + "\nDivision: " + division);
        
        
    }
    
}
