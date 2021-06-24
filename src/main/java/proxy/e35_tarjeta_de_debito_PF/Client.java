package proxy.e35_tarjeta_de_debito_PF;

public class Client {
    public static void main(String[]args){
            TarjetaDeDebito debit = new TarjetaDeDebito("34341", 5000.65);

            debit.transaccion(new Dinero("Bolivianos", 0.14, 300.76));
            debit.transaccion(new Dinero("Dólares", 1, 125.99));
            debit.transaccion(new Dinero("Euros", 1.19, 254));
            debit.transaccion(new Dinero("Rupias", 0.013, 19325.15));
    }
}
