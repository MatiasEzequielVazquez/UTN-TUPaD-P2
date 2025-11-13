package tp7_03;

public class EmpleadoPlanta extends Empleado {
    private double sueldoMensual;

    public EmpleadoPlanta(String nombre, int id, double sueldoMensual) {
        super(nombre, id);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoMensual;
    }
}