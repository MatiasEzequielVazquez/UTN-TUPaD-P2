
package tp5_4;

/**
 *
 * @author vazqu
 */
public class TP5_4 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Matias", "37681375");
        Banco banco = new Banco("Banco Santander", "30-50123456-7");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4532-1234-5678-9012", 
                                                       "12/2027", cliente, banco);
        
        // Relaciones
        System.out.println("=== INFORMACIÓN COMPLETA ===");
        System.out.println(tarjeta);
        
        System.out.println("\n=== VERIFICACIÓN BIDIRECCIONAL ===");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Tarjeta del cliente: " + cliente.getTarjeta().getNumero());
        System.out.println("Cliente de la tarjeta: " + tarjeta.getCliente().getNombre());
        
        // Agregacion
        System.out.println("\n=== DEMOSTRACIÓN DE AGREGACIÓN ===");
        tarjeta.setBanco(null);
        System.out.println("Banco sigue existiendo: " + banco);
        

        Cliente otroCliente = new Cliente("Carlos", "34567890");
        TarjetaDeCredito otraTarjeta = new TarjetaDeCredito("5432-9876-5432-1098", 
                                                           "06/2026", otroCliente, banco);
        
        System.out.println("\nOtra tarjeta del mismo banco:");
        System.out.println("Cliente: " + otraTarjeta.getCliente().getNombre());
        System.out.println("Banco: " + otraTarjeta.getBanco().getNombre());
    }
}