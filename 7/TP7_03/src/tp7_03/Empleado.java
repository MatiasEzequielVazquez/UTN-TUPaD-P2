package tp7_03;

public abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSueldo();

    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: $" + calcularSueldo());
        System.out.println("---");
    }
}