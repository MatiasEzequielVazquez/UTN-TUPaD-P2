
package tp5_9;

/**
 *
 * @author vazqu
 */
public class TP5_9 {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("Carlos Martínez", "OSDE");
        

        Profesional profesional = new Profesional("María González", "Cardiología");

        CitaMedica cita = new CitaMedica("2024-10-15", "14:30", paciente, profesional);
        
        // Relaciones
        System.out.println("=== INFORMACIÓN DE LA CITA ===");
        System.out.println(cita);
        
        // Unidireccional
        System.out.println("\n=== DEMOSTRACIÓN DE ASOCIACIÓN UNIDIRECCIONAL ===");
        System.out.println("La cita conoce al paciente: " + cita.getPaciente().getNombre());
        System.out.println("La cita conoce al profesional: " + cita.getProfesional().getNombre());
        System.out.println("El paciente NO conoce sus citas (relación unidireccional)");
        System.out.println("El profesional NO conoce sus citas (relación unidireccional)");
        

        Paciente otroPaciente = new Paciente("Ana López", "Swiss Medical");
        CitaMedica otraCita = new CitaMedica("2024-10-15", "15:00", otroPaciente, profesional);
        
        System.out.println("\n=== MÚLTIPLES CITAS CON EL MISMO PROFESIONAL ===");
        System.out.println("Cita 1 - Paciente: " + cita.getPaciente().getNombre() + 
                         " - Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Cita 2 - Paciente: " + otraCita.getPaciente().getNombre() + 
                         " - Profesional: " + otraCita.getProfesional().getNombre());
        
 
        Profesional otroProfesional = new Profesional("Juan Pérez", "Traumatología");
        CitaMedica terceraCita = new CitaMedica("2024-10-20", "10:00", paciente, otroProfesional);
        
        System.out.println("\n=== MISMO PACIENTE, DIFERENTE ESPECIALIDAD ===");
        System.out.println(terceraCita);
   
        System.out.println("\n=== FLEXIBILIDAD DEL SISTEMA ===");
        System.out.println("Total de citas creadas: 3");
        System.out.println("- Paciente 'Carlos' tiene 2 citas con diferentes profesionales");
        System.out.println("- Profesional 'María' atiende 2 pacientes diferentes");
        System.out.println("- Las entidades pueden participar en múltiples citas independientemente");
    }
}