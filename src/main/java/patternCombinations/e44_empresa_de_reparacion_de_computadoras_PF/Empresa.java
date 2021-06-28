package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class Empresa {
    private static Empresa instance = null;
    private int balance;

    public Empresa() {
        this.balance = 0;
    }

    public static synchronized void makeInstance(){
        if (instance == null)
            instance= new Empresa();
    }

    public static Empresa getInstance(){
        if (instance == null)
            makeInstance();
        return instance;
    }

    public  synchronized void pay(TecnicoAsignado tecnico){
        System.out.println("- PAGANDO.....");
        balance = balance + tecnico.getPrice();
    }

    public  Integer getBalance() {
        System.out.println("- SALDO : " + this.balance);
        return balance;
    }
}
