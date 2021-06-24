package proxy.e35_tarjeta_de_debito_PF;

public class Dinero {
    private String currency;
    private double value;
    private double amount;

    public Dinero() {
    }

    public Dinero(String currency, double value, double amount) {
        this.currency = currency;
        this.value = value;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void showTransactionData(){
        System.out.println("Moneda Original: " + currency);
        System.out.println("Valor frente al Boliviano: " + value / 0.1445086);
        System.out.println("Monto actual: " + amount);
    }
}
