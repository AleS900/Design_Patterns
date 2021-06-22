package adapter.e33_empresas_de_aparatos_electronicos_PF;

public class Celular implements IElectrodomesticosPrimeraEmpresa {
    private String phone_trademark;
    private String phone_model;
    private Integer phone_price;
    private String phone_life_time;

    public Celular(String phone_trademark, String phone_model, Integer phone_price, String phone_life_time) {
        this.phone_trademark = phone_trademark;
        this.phone_model = phone_model;
        this.phone_price = phone_price;
        this.phone_life_time = phone_life_time;
    }

    @Override
    public void price() {
        System.out.println("* Precio del dispositivo móvil " + phone_trademark + " " + phone_model + ": " + phone_price + " $us.\n");
    }

    @Override
    public void lifeTime() {
        System.out.println("* Tiempo de vida del ispositivo móvil " + phone_trademark + ": " + phone_life_time + " aproximadamente.\n");
    }

    public String getPhone_trademark() {
        return phone_trademark;
    }

    public void setPhone_trademark(String phone_trademark) {
        this.phone_trademark = phone_trademark;
    }

    public String getPhone_model() {
        return phone_model;
    }

    public void setPhone_model(String phone_model) {
        this.phone_model = phone_model;
    }

    public Integer getPhone_price() {
        return phone_price;
    }

    public void setPhone_price(Integer phone_price) {
        this.phone_price = phone_price;
    }

    public String getPhone_life_time() {
        return phone_life_time;
    }

    public void setPhone_life_time(String phone_life_time) {
        this.phone_life_time = phone_life_time;
    }
}
