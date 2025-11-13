package tp7_05;

public class Transferencia implements Pagable {
    private String cbu;

    public Transferencia(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado por Transferencia a CBU: " + cbu);
    }
}