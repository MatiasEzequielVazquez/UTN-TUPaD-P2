
package tp5_3;

/**
 *
 * @author vazqu
 */
public class TP5_3 {

    public static void main(String[] args) {

        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");

        Editorial editorial = new Editorial("Editorial Sud", "Buenos Aires, Argentina");
        
        Libro libro = new Libro("Cien años de soledad", "978-950-07-1001-1", autor, editorial);
        
        // Relaciones
        System.out.println(libro);
        
        // Unidireccional
        System.out.println("\nEl autor no conoce sus libros (relación unidireccional)");
        
        // Agregacion
        libro.setEditorial(null);
        System.out.println("\nEditorial sigue existiendo: " + editorial);
        
 
        Libro otroLibro = new Libro("Don Quijote", "978-84-376-0494-7");
        otroLibro.setEditorial(editorial);
        System.out.println("\nOtro libro con la misma editorial:");
        System.out.println(otroLibro.getTitulo() + " - " + otroLibro.getEditorial().getNombre());
    }
}