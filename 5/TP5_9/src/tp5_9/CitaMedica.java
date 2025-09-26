
package tp5_9;

/**
 *
 * @author vazqu
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente; // Asociacion unidireccional
    private Profesional profesional; // Asociacion unidireccional
    
    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }
    

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }
    

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public Profesional getProfesional() { return profesional; }
    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    @Override
    public String toString() {
        return "=== CITA MÉDICA ===\n" +
               "Fecha: " + fecha + "\n" +
               "Hora: " + hora + "\n" +
               "Paciente: " + (paciente != null ? paciente.toString() : "Sin paciente") + "\n" +
               "Profesional: " + (profesional != null ? profesional.toString() : "Sin profesional");
    }
}