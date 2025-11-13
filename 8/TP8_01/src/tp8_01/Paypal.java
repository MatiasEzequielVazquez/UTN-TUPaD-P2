package tp8_01;

public class Paypal implements Pago {
    private String email;

    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal - Email: " + email);
    }
}