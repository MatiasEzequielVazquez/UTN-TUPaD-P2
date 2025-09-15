
package tp3;
/**
 *
 * @author vazqu
 */
public class TP3 {

    
    public static void main(String[] args) {
        /*
        //Ejercicio 1
        Estudiantes estudiante1 = new Estudiantes();
        
        estudiante1.nombre = "Matias";
        estudiante1.apellido = "Vazquez";
        estudiante1.curso = "Programacion_2";
        estudiante1.calificacion = 8;
        
        estudiante1.mostrarInfo();
        estudiante1.subirCalificaciones(2);
        estudiante1.mostrarInfo();
        estudiante1.bajarCalificaciones(1); 
        estudiante1.mostrarInfo();
        */
        
        /*
        //Ejercicio 2
        Mascota perro = new Mascota();
        
        perro.nombre = "Firulais";
        perro.especie = "Canino";
        perro.edad = 2;
        perro.mostrarInfo();
        perro.cumplirAnios();
        perro.mostrarInfo();
        */
        
        /*
        //Ejercicio 3
        Libro quijote = new Libro();
        String titulo = quijote.getTitulo();
        String autor = quijote.getAutor();
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor);
        
        int anioDePublicacion = quijote.getAnioPublicacion();
        System.out.println("Publicado en: " + anioDePublicacion);
        quijote.setAnioPublicacion(1300);
        anioDePublicacion = quijote.getAnioPublicacion();
        System.out.println("Publicado en: " + anioDePublicacion);
        quijote.setAnioPublicacion(1615);
        anioDePublicacion = quijote.getAnioPublicacion();
        System.out.println("Publicado en: " + anioDePublicacion);
        */      
        
        /*
                
        // Ejercicio 4
   
        Gallina a = new Gallina();
        Gallina b = new Gallina();
        
        a.idGallina = "A001";
        b.idGallina = "B001";
        a.mostrarEstado();
        b.mostrarEstado();
        
        for (int i = 0; i < 5; i++){
            a.ponerHuevo();
        }
        int contador = 0;
        while(contador < 2){
            b.ponerHuevo();
            a.envejecer();
            contador ++;
        }
        
        b.envejecer();
        
        a.mostrarEstado();
        b.mostrarEstado();
        
        
        */
        
        //Ejercicio 5;
        
        NaveEspacial halconMilenario = new NaveEspacial();
        halconMilenario.nombre = "Halcon Milenario";
        halconMilenario.mostrarEstado();
        System.out.println("Primer intento de avanzar");
        halconMilenario.avanzar(400);
        System.out.println("Primer intento de regarcar combustible...");
        halconMilenario.regargarCombustible(100);
        halconMilenario.mostrarEstado();
        System.out.println("Segundo intento de regarcar combustible...");
        halconMilenario.regargarCombustible(50);
        halconMilenario.mostrarEstado();
        System.out.println("Segundo intento de avanzar");
        halconMilenario.avanzar(400);
        halconMilenario.mostrarEstado();
        
        
    }
    
}
