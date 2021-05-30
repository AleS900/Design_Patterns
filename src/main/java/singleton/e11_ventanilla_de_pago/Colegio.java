package singleton.e11_ventanilla_de_pago;

public class Colegio {
    private Cajero cashier;
    private String school_name;

    public Colegio() {
    }

    public Colegio(Cajero cashier, String school_name) {
        this.cashier = this.cashier = new Cajero("-DEFAULT-", "-DEFAULT-");
        this.school_name = school_name;
    }

    public Cajero getCashier() {
        return cashier;
    }

    public void setCashier(Cajero cashier) {
        this.cashier = cashier;
    }

    public String getSchoolName() {
        return school_name;
    }

    public void setSchoolName(String school_name) {
        this.school_name = school_name;
    }

    public void payEnrollment(int amount, Estudiante student){
        Ventanilla.getInstance(this.cashier).payEnrollment(amount, student);
    }

}
