package adapter.e33_tienda_de_aparatos_electronicos_PF;

public class Refrigerador implements IElectrodomesticosSegundaEmpresa {
    private String frige_trademark;
    private String frige_type;
    private boolean frige_is_smart;
    private Integer frige_cost;
    private String frige_warranty_time;

    public Refrigerador(String frige_trademark, String frige_type, boolean frige_is_smart, Integer frige_cost, String frige_warranty_time) {
        this.frige_trademark = frige_trademark;
        this.frige_type = frige_type;
        this.frige_is_smart = frige_is_smart;
        this.frige_cost = frige_cost;
        this.frige_warranty_time = frige_warranty_time;
    }

    @Override
    public void cost() {
        if(frige_is_smart){
            System.out.println("* Costo del refrigerador " + frige_trademark + " inteligente " + frige_type + ": " + frige_cost + " $us.\n");
        } else {
            System.out.println("* Costo del refrigerador " + frige_trademark + " no inteligente " + frige_type + ": " + frige_cost + " $us.\n");
        }
    }

    @Override
    public void warrantyTime() {
        System.out.println("* Tiempo de garantía del refrigerador " + frige_trademark + " " + frige_type + ": " + frige_warranty_time + ".\n");
    }

    public String getFrige_trademark() {
        return frige_trademark;
    }

    public void setFrige_trademark(String frige_trademark) {
        this.frige_trademark = frige_trademark;
    }

    public String getFrige_type() {
        return frige_type;
    }

    public void setFrige_type(String frige_type) {
        this.frige_type = frige_type;
    }

    public boolean isFrige_is_smart() {
        return frige_is_smart;
    }

    public void setFrige_is_smart(boolean frige_is_smart) {
        this.frige_is_smart = frige_is_smart;
    }

    public Integer getFrige_cost() {
        return frige_cost;
    }

    public void setFrige_cost(Integer frige_cost) {
        this.frige_cost = frige_cost;
    }

    public String getFrige_warranty_time() {
        return frige_warranty_time;
    }

    public void setFrige_warranty_time(String frige_warranty_time) {
        this.frige_warranty_time = frige_warranty_time;
    }
}
