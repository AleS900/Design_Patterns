package proxy.e35_tarjeta_de_debito_PF;

public class TarjetaDeDebito implements IBanco{
    private String id_transaction;
    private CuentaDeBanco account = new CuentaDeBanco("Isabel Zamora", 40005024);
    private double current_amount;

    public TarjetaDeDebito() {
    }

    public TarjetaDeDebito(String id_transaction, double current_amount) {
        this.id_transaction = id_transaction;
        this.current_amount = current_amount;
        System.out.println("\n***** Solicitud de Transacción *****");
        System.out.println("                ...");
        System.out.println("************ Aceptada **************\n");
    }

    public String getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(String id_transaction) {
        this.id_transaction = id_transaction;
    }

    public double getCurrent_amount() {
        return current_amount;
    }

    public void setCurrent_amount(double current_amount) {
        this.current_amount = current_amount;
    }

    @Override
    public void transaccion(Dinero money) {
        if (!money.getCurrency().toLowerCase().equals("bolivianos")) {
            System.out.println("\nRealizando el cambio correspondiente de moneda...\n");
            money.setAmount(money.getAmount() * 6.92 * money.getValue());
        }
        printTransaction(money);
    }

    public void printTransaction(Dinero money) {
        if (verifyNoLowerAmount(money)) {
            System.out.println("******** Transacción Aceptada *******");
            account.transaccion(money);
            System.out.println("****** Realizando Transacción... ****");
            System.out.println("- Monto retirado: " + money.getAmount());
            current_amount = current_amount - money.getAmount();
        } else {
            System.out.println("******** Transacción Denegada *******");
            System.out.println("El monto solicitado es superior al Saldo actual de la cuenta.");
            System.out.println("Monto Solicitado: " + money.getAmount());
            System.out.println("\n******* Cancelando Transacción...********");
        }
        System.out.println("- Saldo Actual: " + current_amount);
        System.out.println("\n******* TRANSACCION FINALIZADA ******\n\n");
    }

    public boolean verifyNoLowerAmount(Dinero money) {
        if(money.getAmount() < current_amount){
            return true;
        } else {
            return false;
        }
    }


}
