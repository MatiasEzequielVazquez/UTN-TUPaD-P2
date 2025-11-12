package tp6_02;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        
        // 2. Crear 3 autores
        Autor autor1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor autor2 = new Autor("A002", "Gabriel García Márquez", "Colombia");
        Autor autor3 = new Autor("A003", "Julio Cortázar", "Argentina");
        
        // 3. Agregar 5 libros
        biblioteca.agregarLibro("ISBN001", "Ficciones", 1944, autor1);
        biblioteca.agregarLibro("ISBN002", "El Aleph", 1949, autor1);
        biblioteca.agregarLibro("ISBN003", "Cien años de soledad", 1967, autor2);
        biblioteca.agregarLibro("ISBN004", "Rayuela", 1963, autor3);
        biblioteca.agregarLibro("ISBN005", "Bestiario", 1951, autor3);
        
        // 4. Listar todos los libros
        System.out.println("--- TODOS LOS LIBROS ---");
        biblioteca.listarLibros();
        
        // 5. Buscar por ISBN
        System.out.println("\n--- BUSCAR ISBN003 ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        
        // 6. Filtrar por año
        System.out.println("\n--- LIBROS DE 1951 ---");
        biblioteca.filtrarLibrosPorAnio(1951);
        
        // 7. Eliminar libro
        System.out.println("\n--- ELIMINAR ISBN002 ---");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();
        
        // 8. Cantidad total
        System.out.println("\n--- CANTIDAD TOTAL ---");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros() + " libros");
        
        // 9. Autores disponibles
        System.out.println("\n--- AUTORES DISPONIBLES ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}