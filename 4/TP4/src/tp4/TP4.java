package tp4;
/**
 *
 * @author vazqu
 */
public class TP4 {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(1, "Martin", "Gerente", 10000);
        Empleado e2 = new Empleado(2, "Sandra", "Encargada", 7000);
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados() + " \n");
        
        Empleado e3 = new Empleado("German", "Administrativa");
        Empleado e4 = new Empleado();
        
        System.out.println("Salario inicial de " + e1.getNombre() + ": " + e1.getSalario() +
                ", con el ID: " + e1.getId() + "\n");
        e1.actualizarSalario(5000.00);
        
        System.out.println("Salario inicial de " + e2.getNombre() + ": " + 
                e2.getSalario() + ", para el puesto de " + e2.getPuesto() + "\n");
        e2.actualizarSalario(20);
        
        // Check toString()
        System.out.println(e1 + "\n");
        
        System.out.println(e2 + "\n");
        
        System.out.println(e3 + "\n");
        e3.setId(3);
        e3.setSalario(4000);
        System.out.println(e3 + "\n");
        
        System.out.println(e4 + "\n");
        e4.setId(4);
        e4.setNombre("Claudio");
        e4.setPuesto("Supervisor");
        e4.setSalario(7000);
        System.out.println(e4 + "\n");
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
