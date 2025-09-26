
package tp5_1;

/**
 *
 * @author vazqu
 */
public class TP5_1 {

     public static void main(String[] args) {
         
        Titular titular = new Titular("Matias", "37681375");
        
        Pasaporte pasaporte = new Pasaporte("AA123456", "2024-01-15", 
                                          titular, "foto123.jpg", "JPEG");
        
        // Validando relaciones
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Pasaporte: " + titular.getPasaporte().getNumero());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
}