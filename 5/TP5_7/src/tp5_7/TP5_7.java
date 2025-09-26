
package tp5_7;

/**
 *
 * @author vazqu
 */
public class TP5_7 {

    public static void main(String[] args) {

        Conductor conductor = new Conductor("Matias", "B1");
        
        Motor motor = new Motor("V6 3.0L", "MOT789456123");
        
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota Corolla 2023", conductor, motor);
        
        // Relaciones
        System.out.println("=== INFORMACIÓN COMPLETA ===");
        System.out.println(vehiculo);
        
        System.out.println("\n=== VERIFICACIÓN BIDIRECCIONAL ===");
        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Vehículo del conductor: " + conductor.getVehiculo().getModelo());
        System.out.println("Conductor del vehículo: " + vehiculo.getConductor().getNombre());
        
  
        System.out.println("\n=== DEMOSTRACIÓN DE AGREGACIÓN ===");
        vehiculo.setMotor(null);
        System.out.println("Motor sigue existiendo: " + motor);
        
 
        Vehiculo otroVehiculo = new Vehiculo("XYZ789", "Honda Civic 2022");
        otroVehiculo.setMotor(motor);
        
        System.out.println("\nOtro vehículo con el mismo motor:");
        System.out.println("Vehículo: " + otroVehiculo.getModelo());
        System.out.println("Motor: " + otroVehiculo.getMotor().getTipo());
        

        System.out.println("\n=== CAMBIO DE CONDUCTOR ===");
        Conductor nuevoConductor = new Conductor("Ramon", "B-4");
        vehiculo.setConductor(nuevoConductor);
        
        System.out.println("Nuevo conductor: " + vehiculo.getConductor().getNombre());
        System.out.println("Vehículo del nuevo conductor: " + nuevoConductor.getVehiculo().getPatente());
        System.out.println("El conductor anterior ya no tiene vehículo asignado: " + 
                         (conductor.getVehiculo() == null ? "Correcto" : "Error"));
    }
}