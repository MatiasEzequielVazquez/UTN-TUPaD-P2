
package tp2;

import java.util.Scanner;

/**
 *
 * @author vazqu
 */
public class ejercicio6 {
    public static void ejercicio6(){
        Scanner input = new Scanner(System.in);
        
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese el numero: ");
            int num = Integer.parseInt(input.next());
            if (num > 0){
                positivos ++;
                }
            else if (num < 0){
                negativos ++;
                }
            else {
                ceros ++;
            }     
        }
        
        System.out.println("Resultados: \nPositivos: " + positivos + "\nNegativos: " + negativos + 
                "\nCeros: " + ceros);
    }
}
