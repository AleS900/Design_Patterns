package singleton.e11_ventanilla_de_pago;

public class Ventanilla {

    private static Ventanilla instance = null;
    private Cajero cashier;
    private int balance;

    public Ventanilla(Cajero cashier) {
        this.cashier = cashier;
        this.balance = 0;
    }

    public static Ventanilla getInstance(Cajero cajero){
        if(instance == null){
            instance =  new Ventanilla(cajero);
        }
        return instance;
    }

    public void payEnrollment(int amount, Estudiante student){
        balance = balance + amount;
        System.out.println("************************");
        System.out.println("- Código Cajero : " + this.cashier.getCshrCode());
        System.out.println("-    Nombre     : " + this.cashier.getCshrName());
        System.out.println("-    Saldo      : " + balance + " Bs." );
        System.out.println("- Cód.Estudiante: " + student.getStdCode());
        System.out.println("-   Estudiante  : " + student.getStdName());
        System.out.println("************************\n");
    }

    public Integer getBalance() {
        System.out.println("-     SALDO    : " + this.balance);
        return balance;
    }
}
