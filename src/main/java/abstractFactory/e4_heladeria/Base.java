package abstractFactory.e4_heladeria;

public class Base {
    // Base (Nombre, Tamaño, Tipo, Precio)
    private String b_name;
    private String b_size;
    private String b_type;
    private String b_price;

    public Base(){
    }

    public Base(String b_name, String b_size, String b_type, String b_price){
        this.b_name = b_name;
        this.b_size = b_size;
        this.b_type = b_type;
        this.b_price = b_price;
    }

    public String getBName() {
        return b_name;
    }

    public void setBName(String b_name) {
        this.b_name = b_name;
    }

    public String getBSize() {
        return b_size;
    }

    public void setBSize(String b_size) {
        this.b_size = b_size;
    }

    public String getBType() {
        return b_type;
    }

    public void setBType(String b_type) {
        this.b_type = b_type;
    }

    public String getBPrice() {
        return b_price;
    }

    public void setBPrice(String b_price) {
        this.b_price = b_price;
    }

    public void showInfo(){
        System.out.println("* Base     :");
        System.out.println("            --Nombre: " + b_name);
        System.out.println("            --Tamaño: "+ b_size);
        System.out.println("            --Tipo  : " + b_type);
        System.out.println("            --Costo : "+ b_price);

    }
}
