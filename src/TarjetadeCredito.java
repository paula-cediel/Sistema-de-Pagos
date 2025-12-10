public class TarjetadeCredito extends MetodoPago{

    public TarjetadeCredito(double saldoDisponible) {
        super(saldoDisponible);
    }
    @Override
    public void realizarPago(double monto) {
     if(saldoDisponible >= monto)  {
         saldoDisponible -= monto;
         System.out.println("saldoDisponible: " + saldoDisponible);
     } else {
         System.out.println("error no hay suficiente saldo" );
     }
    }

}
