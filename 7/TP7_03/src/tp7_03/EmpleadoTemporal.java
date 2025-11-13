package tp7_03;

public class EmpleadoTemporal extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, int id, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorHora * horasTrabajadas;
    }
}