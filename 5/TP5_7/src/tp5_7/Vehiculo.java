
package tp5_7;

/**
 *
 * @author vazqu
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor; // Asociacion bidireccional
    private Motor motor; // Agregacion
    
    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }
    

    public Vehiculo(String patente, String modelo, Conductor conductor, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.conductor = conductor;
        this.motor = motor;
        
  
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    

    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public Conductor getConductor() { return conductor; }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null) {
            conductor.setVehiculo(this);
        }
    }
    
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    @Override
    public String toString() {
        return modelo + " (Patente: " + patente + ")\n" +
               "Conductor: " + (conductor != null ? conductor.toString() : "Sin conductor") + "\n" +
               "Motor: " + (motor != null ? motor.toString() : "Sin motor");
    }
}
