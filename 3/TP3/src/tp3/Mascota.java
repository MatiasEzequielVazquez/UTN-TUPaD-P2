
package tp3;

/**
 *
 * @author vazqu
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    
    void mostrarInfo(){
        System.out.println("Informacion:\n\nNombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    
    int cumplirAnios(){
        return edad ++;
    }  
}
    