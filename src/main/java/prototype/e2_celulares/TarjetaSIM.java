package prototype.e2_celulares;

public class TarjetaSIM {
    private String telephone_company;
    private String phone_number;

    public TarjetaSIM() {}

    public TarjetaSIM(String telephone_company, String phone_number){
        this.telephone_company = telephone_company;
        this.phone_number = phone_number;
    }

    public String getTelephoneCompany() {
        return telephone_company;
    }

    public void setTelephoneCompany(String telephone_company) {
        this.telephone_company = telephone_company;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }
}
