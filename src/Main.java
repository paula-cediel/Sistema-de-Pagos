public class Main {
    public static void main(String[] args) {
        TarjetadeCredito tc1 = new TarjetadeCredito(234);
        tc1.realizarPago(1);
        PayPal pagoPaypal = new PayPal(342);
        pagoPaypal.realizarPago(288);
    }
}