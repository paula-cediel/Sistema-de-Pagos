public class PayPal extends MetodoPago{
    public PayPal(double saldoDisponible) {
        super(saldoDisponible);
    }

    @Override
    public void realizarPago(double monto) {
        if(saldoDisponible >= monto)  {
            double comision = monto* 0.02;
            System.out.println("la comisión es de: " + comision);
            double valortotal;
            valortotal = monto + comision;
            saldoDisponible = saldoDisponible - valortotal;
            System.out.println("Saldo disponible: " + saldoDisponible);
        } else {
            System.out.println("error no hay suficiente saldo" );
        }
    }

}
