package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class Persona {
    private String pers_id;
    private String pers_name;
    private String pers_last_name;
    private boolean pers_birth_certificate;
    private boolean pers_payment_to_the_bank;
    private boolean pers_ticket;

    public Persona(String pers_id, String pers_name, String pers_last_name, boolean pers_birth_certificate, boolean pers_payment_to_the_bank, boolean pers_ticket) {
        this.pers_id = pers_id;
        this.pers_name = pers_name;
        this.pers_last_name = pers_last_name;
        this.pers_birth_certificate = pers_birth_certificate;
        this.pers_payment_to_the_bank = pers_payment_to_the_bank;
        this.pers_ticket = pers_ticket;
    }

    public String getPersonID() {
        return pers_id;
    }

    public void setPersonID(String pers_id) {
        this.pers_id = pers_id;
    }

    public String getPersonName() {
        return pers_name;
    }

    public void setPersonName(String pers_name) {
        this.pers_name = pers_name;
    }

    public String getPersonLastName() {
        return pers_last_name;
    }

    public void setPersonLastName(String pers_last_name) {
        this.pers_last_name = pers_last_name;
    }

    public boolean isPersonBirthCertificate() {
        return pers_birth_certificate;
    }

    public void setPersonBirthCertificate(boolean pers_birth_certificate) {
        this.pers_birth_certificate = pers_birth_certificate;
    }

    public boolean isPersonPaymentToTheBank() {
        return pers_payment_to_the_bank;
    }

    public void setPersonPaymentToTheBank(boolean pers_payment_to_the_bank) {
        this.pers_payment_to_the_bank = pers_payment_to_the_bank;
    }

    public boolean isPersonTicket() {
        return pers_ticket;
    }

    public void setPersonTicket(boolean pers_ticket) {
        this.pers_ticket = pers_ticket;
    }
}
