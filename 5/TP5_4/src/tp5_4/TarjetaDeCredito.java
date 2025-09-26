
package tp5_4;

/**
 *
 * @author vazqu
 */
public class TarjetaDeCredito {
   private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociacion bidireccional
    private Banco banco; // Agregacion
    
    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        
 
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public String getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(String fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null) {
            cliente.setTarjeta(this);
        }
    }
    
    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
    @Override
    public String toString() {
        return "Tarjeta: " + numero + " (Vence: " + fechaVencimiento + ")\n" +
               "Cliente: " + (cliente != null ? cliente.toString() : "Sin cliente") + "\n" +
               "Banco: " + (banco != null ? banco.toString() : "Sin banco");
    }
}