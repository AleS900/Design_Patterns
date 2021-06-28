package decorator.e37_cuenta_de_banco_decorator_PF;

public class Funcionalidad implements ICuentaDeBanco {
    private ICuentaDeBanco account;

    public Funcionalidad(ICuentaDeBanco funcionalidad) {
        this.account = funcionalidad;
    }

    public ICuentaDeBanco getAccount() {
        return account;
    }

    public void setAccount(ICuentaDeBanco account) {
        this.account = account;
    }

    @Override
    public void operation() {
        this.account.operation();
    }

    @Override
    public double getAmount() {
        return getAccount().getAmount();
    }

    @Override
    public void setAmount(double amount_of_money) {
        this.getAccount().setAmount(amount_of_money);
    }
}
