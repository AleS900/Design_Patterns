package adapter.e33_empresas_de_aparatos_electronicos_PF;

public class Tableta implements IElectrodomesticosPrimeraEmpresa {
    private String tab_trademark;
    private String tab_model;
    private String tab_year;
    private Integer tab_price;
    private String tab_life_time;

    public Tableta(String tab_trademark, String tab_model, String tab_year, Integer tab_price, String tab_life_time) {
        this.tab_trademark = tab_trademark;
        this.tab_model = tab_model;
        this.tab_year = tab_year;
        this.tab_price = tab_price;
        this.tab_life_time = tab_life_time;
    }

    @Override
    public void price() {
        System.out.println("* Precio de la tableta " + tab_trademark + " " + tab_model + "" + tab_year + ": " + tab_price + " $us.\n");
    }

    @Override
    public void lifeTime() {
        System.out.println("* Tiempo de vida de la tableta " + tab_trademark + " " + tab_model + ": " + tab_life_time + " aproximadamente.\n");
    }

    public String getTab_trademark() {
        return tab_trademark;
    }

    public void setTab_trademark(String tab_trademark) {
        this.tab_trademark = tab_trademark;
    }

    public String getTab_model() {
        return tab_model;
    }

    public void setTab_model(String tab_model) {
        this.tab_model = tab_model;
    }

    public String getTab_year() {
        return tab_year;
    }

    public void setTab_year(String tab_year) {
        this.tab_year = tab_year;
    }

    public Integer getTab_price() {
        return tab_price;
    }

    public void setTab_price(Integer tab_price) {
        this.tab_price = tab_price;
    }

    public String getTab_life_time() {
        return tab_life_time;
    }

    public void setTab_life_time(String tab_life_time) {
        this.tab_life_time = tab_life_time;
    }
}
