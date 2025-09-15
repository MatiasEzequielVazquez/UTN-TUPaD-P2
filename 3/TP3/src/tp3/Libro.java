
package tp3;

/**
 *
 * @author vazqu
 */
public class Libro {
    private String titulo = "Don Quijote de la Mancha";
    private String autor = "Miguel de Cervantes Saavedra";
    private int anioPublicacion = 1605;
    
    
    public String getTitulo(){
       return titulo; 
    }
    
    public String getAutor(){
       return autor; 
    }
    
    public int getAnioPublicacion(){
       return anioPublicacion; 
    }

    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion > 1500 && anioPublicacion < 2025){
            this.anioPublicacion = anioPublicacion;
        }
    }
}