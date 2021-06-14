package singleton.e30_prestamo_bancario_2P;

public class Banco {
    private static Banco instance = null;
    private int balance;

    public Banco() {
        this.balance = 0;
    }

    public static synchronized void makeInstance(){
        if (instance == null)
            instance= new Banco();
    }

    public static Banco getInstance(){
        if (instance == null)
            makeInstance();
        return instance;
    }

    public synchronized void payEnrollment(int percentage){
        if(balance+percentage < 25){
            balance = balance + percentage;
            System.out.println("INFO > --- Porcentage del prestamo pagado: [ " + balance +"% ]");
            System.out.println("           Pago Realizado con el Cajero.");
            System.out.println();
        } else if (balance+percentage >= 25 && balance+percentage <= 50){
            balance = balance + percentage;
            System.out.println("INFO > --- Porcentage del prestamo pagado: [ " + balance +"% ]");
            System.out.println("           Pago Realizado con el Agente de Credito,");
            System.out.println("           ya puede Refinanciar su Crédito");
            System.out.println();
        } else if (balance+percentage < 100) {
            balance = balance + percentage;
            System.out.println("INFO > --- Porcentage del prestamo pagado: [ " + balance + "% ]");
            System.out.println("           Pago Realizado con el Supervisor,");
            System.out.println("           ya puede solicitar otro prestamo.");
            System.out.println();
        } else {
            System.out.println("INFO > --- Porcentage del prestamo pagado: [ 100 % ]");
            System.out.println("           Pago Realizado con el Encargado De Prestamos,");
            System.out.println("           ya puede recoger todos sus documentos.");
        }
    }
}