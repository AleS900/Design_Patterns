package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class PC implements IDispositivo {
    private String trademark;
    private String model;
    private String storage;
    private String ram;
    private String so;
    private String size;
    private int price;

    public PC(String trademark, String model, String storage, String ram, String so, String size) {
        this.trademark = trademark;
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.so = so;
        this.size = size;
        setPrice();
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.elegirKit(this);
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice() {
        switch (size.toLowerCase()) {
            case "pequeño":
                price = 50;
                break;
            case "mediano":
                price = 75;
                break;
            case "grande":
                price = 100;
                break;
            default:
                price = 150;
                break;
        }
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
