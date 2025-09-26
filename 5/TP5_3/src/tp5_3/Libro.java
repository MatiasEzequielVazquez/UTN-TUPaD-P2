
package tp5_3;

/**
 *
 * @author vazqu
 */
public class Libro {
 private String titulo;
    private String isbn;
    private Autor autor; // Asociacion unidireccional
    private Editorial editorial; // Agregacion
    
    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public Autor getAutor() { return autor; }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public Editorial getEditorial() { return editorial; }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return titulo + " (ISBN: " + isbn + ")\n" +
               "Autor: " + (autor != null ? autor.toString() : "Sin autor") + "\n" +
               "Editorial: " + (editorial != null ? editorial.toString() : "Sin editorial");
    }
}