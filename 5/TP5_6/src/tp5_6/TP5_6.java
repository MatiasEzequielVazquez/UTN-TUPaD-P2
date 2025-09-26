
package tp5_6;

/**
 *
 * @author vazqu
 */
public class TP5_6 {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Matias", "11-9999-1234");
        
        Mesa mesa = new Mesa(15, 4);
        
        Reserva reserva = new Reserva("2024-12-25", "20:30", cliente, mesa);
        
        // Relaciones
        System.out.println("=== INFORMACIÓN DE LA RESERVA ===");
        System.out.println(reserva);
        
        // Unidireccional
        System.out.println("\n=== DEMOSTRACIÓN DE ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("La reserva conoce al cliente: " + reserva.getCliente().getNombre());
        System.out.println("El cliente NO conoce sus reservas (relación unidireccional)");
        
        // Agregacion
        System.out.println("\n=== DEMOSTRACIÓN DE AGREGACIÓN ===");
        reserva.setMesa(null);
        System.out.println("Mesa sigue existiendo: " + mesa);
        
        Cliente otroCliente = new Cliente("Pedro", "11-6666-1234");
        Reserva otraReserva = new Reserva("2024-12-26", "19:00", otroCliente, mesa);
        
        System.out.println("\nOtra reserva con la misma mesa:");
        System.out.println("Cliente: " + otraReserva.getCliente().getNombre());
        System.out.println("Mesa: " + otraReserva.getMesa().toString());

        System.out.println("\n=== GESTIÓN DE RESERVAS ===");
        System.out.println("Mesa " + mesa.getNumero() + " está disponible para múltiples reservas en diferentes horarios");
    }
}