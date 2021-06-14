package singleton.e30_prestamo_bancario_2P;

public class Persona {
    public Persona() {
    }

    public void pagar(int payment, String cuenta){
        System.out.println("-- Cuenta :" + cuenta);
        Banco.getInstance().payEnrollment(payment);
    }
}
