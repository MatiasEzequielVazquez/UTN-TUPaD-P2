package tp2;
import java.util.Scanner;
/**
 *
 * @author vazqu
 */
public class ejercicio1 {
    public static void ejercicio1(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un año: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            System.out.println("El año " + anio + " es bisiesto" );
        }
        else{
            System.out.println("El añoo " + anio + " no es bisiesto" );
        }
        
    }
    
}
