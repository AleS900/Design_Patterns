package proxy.e35_tarjeta_de_debito_PF;

public class CuentaDeBanco implements IBanco{
    private String holder;
    private int account_number;

    public CuentaDeBanco() {
    }

    public CuentaDeBanco(String holder, int account_numbere) {
        this.holder = holder;
        this.account_number = account_number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    @Override
    public void transaccion(Dinero money) {
        money.showTransactionData();
        System.out.println();
    }
}
