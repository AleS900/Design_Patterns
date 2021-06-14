package strategy.e28_modulo_de_busqueda_de_celulares_2P;

public class Celular {
    private Integer phone_id;
    private String phone_code;
    private String phone_trademark;
    private String phone_model;
    private String phone_range;
    private Integer phone_price;

    public Celular() {
    }

    public Celular(Integer phone_id, String phone_code, String phone_trademark, String phone_model, String phone_range, Integer phone_price) {
        this.phone_id = phone_id;
        this.phone_code = phone_code;
        this.phone_trademark = phone_trademark;
        this.phone_model = phone_model;
        this.phone_range = phone_range;
        this.phone_price = phone_price;
    }

    public void showInfo() {
        System.out.println("-- ID    : " + phone_id);
        System.out.println("-- Código: " + phone_code);
        System.out.println("-- Marca : " + phone_trademark);
        System.out.println("-- Modelo: " + phone_model);
        System.out.println("-- Gama  : " + phone_range);
        System.out.println("-- Precio: " + phone_price + " $us");
    }

    public Integer getPhoneID() {
        return phone_id;
    }

    public void setPhoneID(Integer phone_id) {
        this.phone_id = phone_id;
    }

    public String getPhoneCode() {
        return phone_code;
    }

    public void setPhoneCode(String phone_code) {
        this.phone_code = phone_code;
    }

    public String getPhoneTrademark() {
        return phone_trademark;
    }

    public void setPhoneTrademark(String phone_trademark) {
        this.phone_trademark = phone_trademark;
    }

    public String getPhoneModel() {
        return phone_model;
    }

    public void setPhoneModel(String phone_model) {
        this.phone_model = phone_model;
    }

    public Integer getPhonePrice() {
        return phone_price;
    }

    public void setPhonePrice(Integer phone_price) {
        this.phone_price = phone_price;
    }

    public String getPhoneRange() {
        return phone_range;
    }

    public void setPhoneRange(String phone_range) {
        this.phone_range = phone_range;
    }
}
