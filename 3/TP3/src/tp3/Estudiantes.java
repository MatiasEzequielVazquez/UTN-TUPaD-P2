
package tp3;

/**
 *
 * @author vazqu
 */
public class Estudiantes {
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    
    void mostrarInfo(){
        System.out.println("Informacion:\n\nNombre: " + nombre + "\nApellido: " + apellido + "\nCurso: "
            + curso + "\nCalificacion: " + calificacion);
    }
    int subirCalificaciones(int puntos){
        return calificacion += puntos;
    }
    int bajarCalificaciones(int puntos){
        return calificacion -= puntos;
    }   
}
    
