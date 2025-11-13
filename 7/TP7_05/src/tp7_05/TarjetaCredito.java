package tp7_05;

public class TarjetaCredito implements Pagable {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado con Tarjeta de Crédito **** " + 
                          numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}