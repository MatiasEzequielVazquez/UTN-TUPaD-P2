
package tp5_2;

/**
 *
 * @author vazqu
 */
public class TP5_2 {

 
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Matias", "37681375");

        Bateria bateria = new Bateria("BT-3000", 3000);

        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S25");
        
        // Relaciones
        celular.setUsuario(usuario);
        celular.setBateria(bateria);
        
        // Velidar relaciones
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Celular: " + usuario.getCelular().getMarca());
        System.out.println("Batería: " + celular.getBateria().getModelo());
        
        celular.setBateria(null);
        System.out.println("Batería sigue existiendo: " + bateria.getModelo());
    }
}