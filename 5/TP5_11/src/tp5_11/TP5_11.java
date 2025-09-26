
package tp5_11;

/**
 *
 * @author vazqu
 */
public class TP5_11 {

    public static void main(String[] args) {
        Artista artista = new Artista("Ed Sheeran", "Pop");
        
        Cancion cancion = new Cancion("Shape of You", artista);
        
        Reproductor reproductor = new Reproductor();
        
        // Dependencia de uso
        System.out.println("=== DEPENDENCIA DE USO ===");
        reproductor.reproducir(cancion);
        
        System.out.println("\n=== OTRA CANCIÓN ===");
        Cancion otraCancion = new Cancion("Perfect", artista);
        reproductor.reproducir(otraCancion);
        
        System.out.println("\n=== VERIFICACIÓN DE DEPENDENCIA ===");
        System.out.println("El reproductor no almacena canciones, solo las usa temporalmente");
        
        reproductor.mostrarInformacion(cancion);
    }
}