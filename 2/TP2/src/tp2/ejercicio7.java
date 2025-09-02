
package tp2;

import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio7 {
        public static void ejercicio7(){
        Scanner input = new Scanner(System.in);
        
        int nota = 0;
        
        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = Integer.parseInt(input.next());
            if (nota < 0 || nota > 10){
                System.out.println("Nota Invalida. Ingrese una nota entre 0 y 10");
            }
        }while(nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
}
