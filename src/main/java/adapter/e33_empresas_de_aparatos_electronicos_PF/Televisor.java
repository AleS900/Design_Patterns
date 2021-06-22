package adapter.e33_empresas_de_aparatos_electronicos_PF;

public class Televisor implements IElectrodomesticosSegundaEmpresa {
    private String tv_trademark;
    private String tv_size;
    private Integer tv_cost;
    private String tv_warranty_time;

    public Televisor(String tv_trademark, String tv_size, Integer tv_cost, String tv_warranty_time) {
        this.tv_trademark = tv_trademark;
        this.tv_size = tv_size;
        this.tv_cost = tv_cost;
        this.tv_warranty_time = tv_warranty_time;
    }

    @Override
    public void cost() {
        System.out.println("* Costo del televisor " + tv_trademark + " de " + tv_size + ": " + tv_cost + " $us.\n");
    }

    @Override
    public void warrantyTime() {
        System.out.println("* Tiempo de garantía del televisor " + tv_trademark + " de " + tv_size + ": " + tv_warranty_time + ".\n");
    }

    public String getTv_trademark() {
        return tv_trademark;
    }

    public void setTv_trademark(String tv_trademark) {
        this.tv_trademark = tv_trademark;
    }

    public String getTv_size() {
        return tv_size;
    }

    public void setTv_size(String tv_size) {
        this.tv_size = tv_size;
    }

    public Integer getTv_cost() {
        return tv_cost;
    }

    public void setTv_cost(Integer tv_cost) {
        this.tv_cost = tv_cost;
    }

    public String getTv_warranty_time() {
        return tv_warranty_time;
    }

    public void setTv_warranty_time(String tv_warranty_time) {
        this.tv_warranty_time = tv_warranty_time;
    }
}
