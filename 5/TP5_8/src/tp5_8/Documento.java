
package tp5_8;

/**
 *
 * @author vazqu
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; // Composicion
    
    public Documento(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }
    
 
    public Documento(String titulo, String contenido, Usuario usuario, String fecha) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(generarHash(contenido), fecha, usuario);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    
    public FirmaDigital getFirmaDigital() { return firmaDigital; }
    
 
    public void firmarDocumento(Usuario usuario, String fecha) {
        this.firmaDigital = new FirmaDigital(generarHash(contenido), fecha, usuario);
    }
    
    private String generarHash(String contenido) {
        return "SHA256_" + Math.abs(contenido.hashCode());
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== DOCUMENTO ===\n");
        sb.append("Título: ").append(titulo).append("\n");
        sb.append("Contenido: ").append(contenido).append("\n");
        if (firmaDigital != null) {
            sb.append("\n=== FIRMA DIGITAL ===\n");
            sb.append(firmaDigital.toString());
        } else {
            sb.append("\nDocumento sin firmar");
        }
        return sb.toString();
    }
}