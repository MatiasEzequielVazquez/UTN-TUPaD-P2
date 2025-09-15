
package tp3;

/**
 *
 * @author vazqu
 */
public class NaveEspacial {
    public String nombre;
    private int combustible;
    
    public boolean despegar(){
        return true;
    }
    public void avanzar(int distancia){
        // Por cada 10 unidades de distancia se gasta 1 unidad de combustible
        if (despegar()){
            if(combustible > (distancia /10)){
                combustible = combustible - (distancia / 10);
            }
            else{
                System.out.println("Combustible insuficiente...\n");
            }
        }
        else{
            System.out.println("Antes de Avanzar debe Despegar...\n");
        }
    }
    public void regargarCombustible(int cantidad){
        if(combustible <=50){
            int acumulador = combustible + cantidad;
            if((acumulador) <= 50){
                combustible += cantidad;
            }
            else{
                int resto = 50 - combustible;
                System.out.println("Se supera capacidad de combustible, solo resta por cargar: " + resto);
            }
        }
        else{
            System.out.println("Tanque de combustible lleno...\n");
        }
    }

    public void mostrarEstado(){
        System.out.println("Nombre de la nave: " + nombre + "\nCombustible disponible: " + combustible 
                + " litros\n\n");
        
    }
    
}
