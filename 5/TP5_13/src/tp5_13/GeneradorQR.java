
package tp5_13;

/**
 *
 * @author vazqu
 */
public class GeneradorQR {
   
    // Dependencia de creacion
    public void generar(String valor, Usuario usuario) {
        if (valor != null && !valor.trim().isEmpty() && usuario != null) {
            CodigoQR codigoQR = new CodigoQR(valor, usuario);
            
            System.out.println("=== GENERANDO CÓDIGO QR ===");
            System.out.println("Usuario: " + usuario.toString());
            System.out.println("Valor a codificar: " + valor);
            System.out.println("Código QR generado: " + codigoQR.toString());
            System.out.println("QR:");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||        |||  |||  |||        ||| ||||||");
            System.out.println("|||  ||||||  ||||||||||  ||||||  ||| ||||||");
            System.out.println("|||  ||||||  ||||||  ||||||  ||| ||| ||||||");
            System.out.println("|||  ||||||  |||  |||  |||     ||||||||||||");
            System.out.println("|||        ||||||||||      ||| ||| ||||||||");
            System.out.println("||||||||||  |||||||||| |||||||||| |||||||||");
            System.out.println("Código QR listo para usar!");
            
            // El código QR no se almacena en el generador (dependencia de creación)
        } else {
            System.out.println("Error: Valor o usuario inválido para generar QR");
        }
    }
    
    // Dependencia de creacion
    public void generarMultiple(String[] valores, Usuario usuario) {
        System.out.println("=== GENERACIÓN MÚLTIPLE ===");
        for (String valor : valores) {
            CodigoQR codigo = new CodigoQR(valor, usuario);
            System.out.println("Generado: " + codigo.toString());
        }
        System.out.println("Total generados: " + valores.length);
    }
}