package tp6_03;

public class Main {
    public static void main(String[] args) {
        
        Universidad universidad = new Universidad("UTN");
        
        // 1. Crear 3 profesores y 5 cursos
        Profesor p1 = new Profesor("P001", "Carlos Gomez", "Programación");
        Profesor p2 = new Profesor("P002", "María López", "Base de Datos");
        Profesor p3 = new Profesor("P003", "Juan Pérez", "Redes");
        
        Curso c1 = new Curso("C001", "Programación 1");
        Curso c2 = new Curso("C002", "Programación 2");
        Curso c3 = new Curso("C003", "Base de Datos 1");
        Curso c4 = new Curso("C004", "Redes y Comunicaciones");
        Curso c5 = new Curso("C005", "Algoritmos");
        
        // 2. Agregar a universidad
        universidad.agregarProfesor(p1);
        universidad.agregarProfesor(p2);
        universidad.agregarProfesor(p3);
        
        universidad.agregarCurso(c1);
        universidad.agregarCurso(c2);
        universidad.agregarCurso(c3);
        universidad.agregarCurso(c4);
        universidad.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P001");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P001");
        
        // 4. Listar cursos y profesores
        System.out.println("\n=== ESTADO INICIAL ===");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        System.out.println("\n--- CURSOS POR PROFESOR ---");
        p1.listarCursos();
        p2.listarCursos();
        p3.listarCursos();
        
        // 5. Cambiar profesor de un curso
        System.out.println("\n=== CAMBIAR PROFESOR DE C002 ===");
        universidad.asignarProfesorACurso("C002", "P002");
        System.out.println("Después del cambio:");
        p1.listarCursos();
        p2.listarCursos();
        
        // 6. Remover un curso
        System.out.println("\n=== ELIMINAR CURSO C005 ===");
        universidad.eliminarCurso("C005");
        System.out.println("Cursos de " + p1.getNombre() + " después de eliminar:");
        p1.listarCursos();
        
        // 7. Remover un profesor
        System.out.println("\n=== ELIMINAR PROFESOR P003 ===");
        universidad.eliminarProfesor("P003");
        System.out.println("Estado del curso C004:");
        c4.mostrarInfo();
        
        // 8. Reporte final
        System.out.println("\n=== REPORTE FINAL ===");
        universidad.mostrarReporteCursosPorProfesor();
    }
}