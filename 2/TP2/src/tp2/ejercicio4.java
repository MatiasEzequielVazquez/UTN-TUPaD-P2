
package tp2;
import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio4 {
    public static void ejercicio4(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el precio: ");
        int precio = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese una letra (A, B o C) de descuento: ");
        char letra = input.nextLine().toUpperCase().charAt(0);
        String descuento = "10%";        
        int precioFinal = 0;
        
        if (letra == 'A') {
            precioFinal = (int)(precio - (precio * 0.1));
            descuento = "10%";
        }
        else if (letra == 'B') {
            precioFinal = (int)(precio - (precio * 0.15));
            descuento = "15%";
        }
        else if (letra == 'C') {
            precioFinal = (int)(precio - (precio * 0.2));   
            descuento = "20%";
        }
        else{
            System.out.println("Categoria incorrecta...");
        }

        System.out.println("A el precio " + precio + ", se aplico el " + descuento
            + " de descuento. \nEl precio final es: " + precioFinal);
    
    }
}
