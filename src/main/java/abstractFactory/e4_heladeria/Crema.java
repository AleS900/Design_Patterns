package abstractFactory.e4_heladeria;

public class Crema {
    private String c_flavor;
    private String c_trademark;
    private String c_price;

    public Crema(){}

    public Crema(String c_flavor, String c_trademark, String c_price) {
        this.c_flavor = c_flavor;
        this.c_trademark = c_trademark;
        this.c_price = c_price;
    }

    public String getCflavor() {
        return c_flavor;
    }

    public void setCflavor(String c_flavor) {
        this.c_flavor = c_flavor;
    }

    public String getCTrademark() {
        return c_trademark;
    }

    public void setCTrademark(String c_trademark) {
        this.c_trademark = c_trademark;
    }

    public String getCPrice() {
        return c_price;
    }

    public void setCPrice(String c_price) {
        this.c_price = c_price;
    }

    public void showInfo(){
        System.out.println("* Crema    : ");
        System.out.println("            --Sabor : "+ c_flavor);
        System.out.println("            --Marca : "+ c_trademark);
        System.out.println("            --Costo : "+ c_price);
    }
}
