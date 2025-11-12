package tp6_01;

public class Main {
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        // 1. Crear 5 productos
        Producto p1 = new Producto("P001", "Arroz", 1500, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Notebook", 85000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 2500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 12000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Celular", 45000, 20, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        // 2. Listar todos
        System.out.println("--- TODOS LOS PRODUCTOS ---");
        inventario.listarProductos();
        
        // 3. Buscar por ID
        System.out.println("\n--- BUSCAR P002 ---");
        Producto encontrado = inventario.buscarProductoPorId("P002");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }
        
        // 4. Filtrar por categoría
        System.out.println("\n--- PRODUCTOS ELECTRONICA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        
        // 5. Eliminar producto
        System.out.println("\n--- ELIMINAR P003 ---");
        inventario.eliminarProducto("P003");
        inventario.listarProductos();
        
        // 6. Actualizar stock
        System.out.println("\n--- ACTUALIZAR STOCK P001 ---");
        inventario.actualizarStock("P001", 100);
        
        // 7. Total stock
        System.out.println("\n--- TOTAL STOCK ---");
        System.out.println("Total: " + inventario.obtenerTotalStock());
        
        // 8. Producto con mayor stock
        System.out.println("\n--- MAYOR STOCK ---");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        mayor.mostrarInfo();
        
        // 9. Filtrar por precio
        System.out.println("\n--- PRECIO ENTRE 1000 Y 3000 ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);
        
        // 10. Mostrar categorías
        System.out.println("\n--- CATEGORIAS ---");
        inventario.mostrarCategoriasDisponibles();
    }
}