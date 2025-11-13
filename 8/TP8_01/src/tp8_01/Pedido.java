package tp8_01;

import java.util.ArrayList;

public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private String estado;
    private Notificable cliente;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void setCliente(Notificable cliente) {
        this.cliente = cliente;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El pedido cambió a estado: " + nuevoEstado);
        }
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("=== PEDIDO ===");
        System.out.println("Estado: " + estado);
        for (Producto p : productos) {
            System.out.println("- " + p);
        }
        System.out.println("Total: $" + calcularTotal());
        System.out.println();
    }
}