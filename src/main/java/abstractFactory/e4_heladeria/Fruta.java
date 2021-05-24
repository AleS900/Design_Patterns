package abstractFactory.e4_heladeria;

public class Fruta {
    private String f_type;
    private String f_name;
    private String f_size;
    private String f_price;

    public Fruta(){
    }

    public Fruta(String f_type, String f_name, String f_size, String f_price) {
        this.f_type = f_type;
        this.f_name = f_name;
        this.f_size = f_size;
        this.f_price = f_price;
    }

    public String getFType() {
        return f_type;
    }

    public void setFType(String f_type) {
        this.f_type = f_type;
    }

    public String getFName() {
        return f_name;
    }

    public void setFName(String f_name) {
        this.f_name = f_name;
    }

    public String getFSize() {
        return f_size;
    }

    public void setFSize(String f_size) {
        this.f_size = f_size;
    }

    public String getFPrice() {
        return f_price;
    }

    public void setFPrice(String f_price) {
        this.f_price = f_price;
    }

    public void showInfo(){
        System.out.println("* Fruta    : ");
        System.out.println("            --Tipo  : " + f_type);
        System.out.println("            --Nombre: " + f_name);
        System.out.println("            --Tamaño: "+ f_size);
        System.out.println("            --Costo : " + f_price);
    }
}
