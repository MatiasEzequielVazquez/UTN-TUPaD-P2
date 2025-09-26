
package tp5_14;

/**
 *
 * @author vazqu
 */
public class EditorVideo {
    
    // Dependencia de creacion
    public void exportar(String formato, Proyecto proyecto) {
        if (formato != null && !formato.trim().isEmpty() && proyecto != null) {
            Render render = new Render(formato, proyecto);
            
            System.out.println("=== INICIANDO EXPORTACIÓN ===");
            System.out.println("Proyecto: " + proyecto.toString());
            System.out.println("Formato: " + formato);
            System.out.println("Render creado: " + render.toString());
            
            System.out.println("\nProceso de exportación:");
            for (int i = 0; i <= 100; i += 25) {
                System.out.println("Progreso: " + i + "% " + "|||".repeat(i/5));
 
            }
            
            int tiempoEstimado = proyecto.getDuracionMin() * 2; // 2x la duración real
            System.out.println("\n✅ EXPORTACIÓN COMPLETADA");
            System.out.println("Archivo generado: " + proyecto.getNombre() + "." + formato.toLowerCase());
            System.out.println("Tiempo de procesamiento: " + tiempoEstimado + " minutos");
            
        } else {
            System.out.println("Error: Formato o proyecto inválido para exportar");
        }
    }
    
    // Dependencia de creacion
    public void exportarMultiplesFormatos(String[] formatos, Proyecto proyecto) {
        System.out.println("=== EXPORTACIÓN MÚLTIPLE ===");
        System.out.println("Proyecto: " + proyecto.getNombre());
        
        for (String formato : formatos) {
            Render render = new Render(formato, proyecto);
            System.out.println("Creando render: " + render.toString());
        }
        
        System.out.println("Total de formatos a exportar: " + formatos.length);
    }
    
    public void analizarProyecto(Proyecto proyecto) {
        if (proyecto != null) {
            System.out.println("=== ANÁLISIS DEL PROYECTO ===");
            System.out.println("Nombre: " + proyecto.getNombre());
            System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
            
            Render renderAnalisis = new Render("ANÁLISIS", proyecto);
            System.out.println("Render de análisis: " + renderAnalisis.toString());
            
            if (proyecto.getDuracionMin() > 60) {
                System.out.println("⚠Proyecto largo - Se recomienda exportación nocturna");
            } else {
                System.out.println("Proyecto de duración estándar");
            }
        }
    }
}