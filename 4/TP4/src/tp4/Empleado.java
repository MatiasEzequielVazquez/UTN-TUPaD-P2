package tp4;
/**
 *
 * @author vazqu
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    //CONSTRUCTOR
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;  
        totalEmpleados ++;
    }
    //CONSTRUCTOR
    public Empleado(String nombre, String puesto){ 
        this.nombre = nombre;
        this.puesto = puesto;
        totalEmpleados ++;
    }
    //CONSTRUCTOR
    public Empleado(){ 
        totalEmpleados ++;
    }
    
    public void actualizarSalario(double monto){
        salario += monto;
    }
    
    public void actualizarSalario(int porcentual){
        salario *= (1 + (porcentual / 100.0));
    }
    
    @Override
    public String toString(){
        return "Empleado{" +
           "id=" + id +
           ", nombre='" + nombre + '\'' +
           ", puesto='" + puesto + '\'' +
           ", salario=" + salario + 
           '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return Empleado.totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    
}
    