package adapter.e33_empresas_de_aparatos_electronicos_PF;

public class Lavadora implements IElectrodomesticosSegundaEmpresa {
    private String wm_trademark;
    private Double wm_capacity;
    private Integer wm_cost;
    private String wm_warranty_time;

    public Lavadora(String wm_trademark, Double wm_capacity, Integer wm_cost, String wm_warranty_time) {
        this.wm_trademark = wm_trademark;
        this.wm_capacity = wm_capacity;
        this.wm_cost = wm_cost;
        this.wm_warranty_time = wm_warranty_time;
    }

    @Override
    public void cost() {
        System.out.println("* Costo de la lavadora " + wm_trademark + " con capacidad de " + wm_capacity + " kg: " + wm_cost + " $us.\n");
    }

    @Override
    public void warrantyTime() {
        System.out.println("* Tiempo de garantía de la lavadora " + wm_trademark + ": " + wm_warranty_time + ".\n");
    }

    public String getWm_trademark() {
        return wm_trademark;
    }

    public void setWm_trademark(String wm_trademark) {
        this.wm_trademark = wm_trademark;
    }

    public Double getWm_capacity() {
        return wm_capacity;
    }

    public void setWm_capacity(Double wm_capacity) {
        this.wm_capacity = wm_capacity;
    }

    public Integer getWm_cost() {
        return wm_cost;
    }

    public void setWm_cost(Integer wm_cost) {
        this.wm_cost = wm_cost;
    }

    public String getWm_warranty_time() {
        return wm_warranty_time;
    }

    public void setWm_warranty_time(String wm_warranty_time) {
        this.wm_warranty_time = wm_warranty_time;
    }
}
