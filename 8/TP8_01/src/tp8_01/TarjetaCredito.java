package tp8_01;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con Tarjeta de Crédito ****" + 
                          numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }

    @Override
    public double aplicarDescuento(double monto) {
        double descuento = monto * 0.05; // 5% descuento
        System.out.println("Descuento aplicado: $" + descuento);
        return monto - descuento;
    }
}