
package tp3;

/**
 *
 * @author vazqu
 */
public class Gallina {
    public String idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void ponerHuevo(){
        huevosPuestos ++;
    }
    
    public void envejecer(){
        edad++; 
    }
    
    public void mostrarEstado(){
        System.out.println("Id: " + idGallina + "\nEdad: " + edad + "\nHuevos Puestos: " + huevosPuestos + "\n\n");
    }
    
    
    
}
