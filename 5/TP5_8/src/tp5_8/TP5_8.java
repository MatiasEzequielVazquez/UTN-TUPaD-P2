
package tp5_8;

/**
 *
 * @author vazqu
 */
public class TP5_8 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Matias", "vazquez.matias.e@gmail.com");
        

        Documento documento = new Documento("Informe Médico", 
                                          "El paciente presenta síntomas compatibles con...", 
                                          usuario, "2024-09-25");
        
        // Relaciones
        System.out.println("=== DOCUMENTO FIRMADO ===");
        System.out.println(documento);
        
        // Composicion
        System.out.println("\n=== DEMOSTRACIÓN DE COMPOSICIÓN ===");
        System.out.println("Hash de la firma: " + documento.getFirmaDigital().getCodigoHash());
        System.out.println("La firma digital es parte integral del documento (composición)");
        
        // Agregacion
        System.out.println("\n=== DEMOSTRACIÓN DE AGREGACIÓN ===");
        System.out.println("Usuario independiente: " + usuario);
        

        Documento otroDocumento = new Documento("Certificado Médico", 
                                               "Se certifica que el paciente está apto para...",
                                               usuario, "2024-09-25");
        
        System.out.println("\n=== MISMO USUARIO, OTRO DOCUMENTO ===");
        System.out.println("Documento 1 - Usuario: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Documento 2 - Usuario: " + otroDocumento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Hash diferente: " + otroDocumento.getFirmaDigital().getCodigoHash());
        

        System.out.println("\n=== REFIRMAR DOCUMENTO ===");
        documento.setContenido(documento.getContenido() + " Actualización: Mejoría notable.");
        documento.firmarDocumento(usuario, "2024-09-26");
        System.out.println("Nuevo hash después de modificar: " + documento.getFirmaDigital().getCodigoHash());
    }
}