package singleton.e11_ventanilla_de_pago;

public class Client {
    public static void main(String []args){
        Colegio colegio_Aleman = new Colegio();
        colegio_Aleman.setCashier(new Cajero("514023", "Juddith Merida"));

        colegio_Aleman.payEnrollment(650, new Estudiante("290302","Claure Gabriel"));
        colegio_Aleman.payEnrollment(650, new Estudiante("131200","Gutierréz Patrick"));
        colegio_Aleman.payEnrollment(650, new Estudiante("121200","Entrambasaguas Rodrigo"));
        colegio_Aleman.payEnrollment(650, new Estudiante("100600","Céspedes Alejandro"));
        colegio_Aleman.payEnrollment(650, new Estudiante("201000","Sánchez Ameluz"));
    }
}

