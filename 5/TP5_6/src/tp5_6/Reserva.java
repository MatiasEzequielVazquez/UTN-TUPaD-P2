
package tp5_6;

/**
 *
 * @author vazqu
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente; // Asociacion unidireccional
    private Mesa mesa; // Agregacion
    
    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }
    

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Mesa getMesa() { return mesa; }
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva para el " + fecha + " a las " + hora + "\n" +
               "Cliente: " + (cliente != null ? cliente.toString() : "Sin cliente") + "\n" +
               "Mesa: " + (mesa != null ? mesa.toString() : "Sin mesa asignada");
    }
}