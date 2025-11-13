package tp7_05;

public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado en Efectivo");
    }
}