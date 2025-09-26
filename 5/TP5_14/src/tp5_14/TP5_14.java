
package tp5_14;

/**
 *
 * @author vazqu
 */
public class TP5_14 {

   
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Documental Naturaleza", 45);
        
        EditorVideo editor = new EditorVideo();
        
        // Dependencia de creacion
        System.out.println("=== DEPENDENCIA DE CREACIÓN ===");
        editor.exportar("MP4", proyecto);
        
        System.out.println("\n" + "=====================================");
        editor.exportar("AVI", proyecto);
        
        System.out.println("\n" + "=====================================");
        String[] formatos = {"MP4", "AVI", "MOV", "WMV"};
        editor.exportarMultiplesFormatos(formatos, proyecto);
        
        System.out.println("\n" + "=====================================");
        editor.analizarProyecto(proyecto);
        
        System.out.println("\n" + "=====================================");
        Proyecto proyectoLargo = new Proyecto("Película Completa", 120);
        editor.analizarProyecto(proyectoLargo);
        
        System.out.println("\n=== VERIFICACIÓN DE DEPENDENCIA ===");
        System.out.println("El editor no almacena renders, solo los crea durante el proceso de exportación");
    }
}