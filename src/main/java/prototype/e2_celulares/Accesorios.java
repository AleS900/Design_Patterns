package prototype.e2_celulares;

public class Accesorios {
    private String headphones;
    private String phone_charger;
    private String phone_case;

    public Accesorios() {}

    public Accesorios(String headphones, String phone_charger, String phone_case){
        this.headphones = headphones;
        this.phone_charger = phone_charger;
        this.phone_case = phone_case;
    }

    public String getHeadphones() {
        return headphones;
    }

    public void setHeadphones(String headphones) {
        this.headphones = headphones;
    }

    public String getPhoneCharger() {
        return phone_charger;
    }

    public void setPhoneCharger(String phone_charger) {
        this.phone_charger = phone_charger;
    }

    public String getPhoneCase() {
        return phone_case;
    }

    public void setPhoneCase(String phone_case) {
        this.phone_case = phone_case;
    }
}
