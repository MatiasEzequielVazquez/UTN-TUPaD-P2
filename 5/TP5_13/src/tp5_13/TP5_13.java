
package tp5_13;

/**
 *
 * @author vazqu
 */
public class TP5_13 {


    public static void main(String[] args) {
        Usuario usuario = new Usuario("Carlos Gonzalez", "carlos.gonzalez@email.com");
        
        GeneradorQR generador = new GeneradorQR();
        
        // Dependencia de creacion
        System.out.println("=== DEPENDENCIA DE CREACIÓN ===");
        generador.generar("https://www.pagina.com/perfil/carlos", usuario);
        
        System.out.println("\n" + "=".repeat(50));
        generador.generar("Información de contacto: Carlos González", usuario);
        
        System.out.println("\n" + "=".repeat(50));
        String[] valores = {
            "Tel: +54-11-1234-5678",
            "Email: carlos.gonzalez@email.com",
            "LinkedIn: /in/carlos-gonzalez"
        };
        generador.generarMultiple(valores, usuario);
        
        System.out.println("\n=== VERIFICACIÓN DE DEPENDENCIA ===");
        System.out.println("El generador no almacena códigos QR, solo los crea temporalmente");
    }
}