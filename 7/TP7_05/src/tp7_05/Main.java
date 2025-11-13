package tp7_05;

public class Main {
    
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
        System.out.println("---");
    }

    public static void main(String[] args) {
        Pagable tarjeta = new TarjetaCredito("1234567890123456");
        Pagable transferencia = new Transferencia("0123456789012345678901");
        Pagable efectivo = new Efectivo();

        procesarPago(tarjeta, 15000);
        procesarPago(transferencia, 25000);
        procesarPago(efectivo, 5000);
    }
}