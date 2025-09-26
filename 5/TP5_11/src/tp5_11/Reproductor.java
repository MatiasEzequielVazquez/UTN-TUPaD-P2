
package tp5_11;

/**
 *
 * @author vazqu
 */
public class Reproductor {
    
    // Dependencia de uso
    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("♪ Reproduciendo: " + cancion.getTitulo());
            System.out.println("   Artista: " + cancion.getArtista().getNombre());
            System.out.println("   Género: " + cancion.getArtista().getGenero());
            System.out.println("   Estado: ♪ ♫ ♪ ♫ Reproduciendo... ♪ ♫ ♪ ♫");
        } else {
            System.out.println("No hay canción para reproducir");
        }
    }
    
    // Dependencia de uso
    public void mostrarInformacion(Cancion cancion) {
        if (cancion != null) {
            System.out.println("=== INFORMACIÓN DE LA CANCIÓN ===");
            System.out.println(cancion);
        }
    }
}