
package tp5_1;

/**
 *
 * @author vazqu
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular; // Asociacion bidireccional
    private Foto foto; // Composicion
    
    public Pasaporte(String numero, String fechaEmision, Titular titular, 
                    String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        // Composicion
        this.foto = new Foto(imagenFoto, formatoFoto);
        
        // Relacion bidireccional
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
 
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }
    
    public Titular getTitular() { return titular; }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    public Foto getFoto() { return foto; }
    public void setFoto(String imagen, String formato) {
        this.foto = new Foto(imagen, formato);
    }
}