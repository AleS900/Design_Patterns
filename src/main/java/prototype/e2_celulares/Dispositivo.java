package prototype.e2_celulares;

public class Dispositivo {
    private String manufacturing_company;
    private String model;

    public Dispositivo() {}

    public Dispositivo(String manufacturing_company) {
        this.manufacturing_company = manufacturing_company;
    }

    public Dispositivo(String manufacturing_company, String model){
        this.manufacturing_company = manufacturing_company;
        this.model = model;
    }

    public String getManufacturingCompany() {
        return manufacturing_company;
    }

    public void setManufacturingCompany(String manufacturing_company) {
        this.manufacturing_company = manufacturing_company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
