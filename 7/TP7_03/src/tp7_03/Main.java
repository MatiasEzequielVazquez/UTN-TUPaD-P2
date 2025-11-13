package tp7_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Juan Vazquez", 1, 50000));
        empleados.add(new EmpleadoTemporal("María García", 2, 150, 120));
        empleados.add(new EmpleadoPlanta("Carlos López", 3, 60000));
        empleados.add(new EmpleadoTemporal("Ana Martínez", 4, 200, 80));

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
            
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Tipo: Empleado Temporal");
            }
            System.out.println();
        }
    }
}