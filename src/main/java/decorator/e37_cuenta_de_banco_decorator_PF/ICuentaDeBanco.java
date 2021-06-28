package decorator.e37_cuenta_de_banco_decorator_PF;

public interface ICuentaDeBanco {
    void operation();
    double getAmount();
    void setAmount(double amount_of_money);
}
