
package tp5_13;

/**
 *
 * @author vazqu
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario; // Asociacion unidireccional
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
    
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    
    @Override
    public String toString() {
        return "Código QR: " + valor + 
               " | Usuario: " + (usuario != null ? usuario.getNombre() : "Sin usuario");
    }
}