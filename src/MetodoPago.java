abstract class MetodoPago implements Pago {
    protected double saldoDisponible;

    public MetodoPago(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public MetodoPago() {
    }

    @Override
    public void reembolsarPago(double monto) {
    saldoDisponible +=monto;
        System.out.println(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
    }
}
