package composite.e36_computadoras_laboratorios_contenedores_PF;

public abstract class ArtefactoElectronico {
    private String af_id;
    private int price;
    private String type;

    public ArtefactoElectronico(String af_id, String type) {
        this.af_id = af_id;
        this.type = type;
        define();
    }

    public String getAf_id() {
        return af_id;
    }

    public void setAf_id(String af_id) {
        this.af_id = af_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void calculatePrice();
    public abstract void add(ArtefactoElectronico artefactoElectronico);
    public abstract void remove(ArtefactoElectronico artefactoElectronico);
    public abstract void getChild(int position);

    public void define(){
        if(this.getType().toLowerCase().equals("computadora")){
            setPrice(100);
        } else {
            setPrice(0);
        }
    }
}
