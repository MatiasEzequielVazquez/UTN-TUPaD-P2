package tp8_01;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Notebook", 50000);
        Producto p2 = new Producto("Mouse", 2500);
        Producto p3 = new Producto("Teclado", 8000);

        // Crear pedido
        Pedido pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);
        pedido.agregarProducto(p3);

        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@mail.com");
        pedido.setCliente(cliente);

        // Mostrar pedido
        pedido.mostrarPedido();

        // Cambiar estado (notifica al cliente)
        pedido.cambiarEstado("En preparación");
        pedido.cambiarEstado("Enviado");

        System.out.println("\n=== PROCESANDO PAGOS ===");
        
        // Pago con tarjeta (con descuento)
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456");
        double totalConDescuento = tarjeta.aplicarDescuento(pedido.calcularTotal());
        tarjeta.procesarPago(totalConDescuento);

        System.out.println();

        // Pago con PayPal
        Paypal paypal = new Paypal("juan@mail.com");
        paypal.procesarPago(pedido.calcularTotal());
    }
}