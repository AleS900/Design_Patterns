package builder.e10_restaurante_de_parrillas;

public class Parrilla {
    private String grill_type;
    private String meat_type;
    private String soda;
    private String others;

    public Parrilla() {}

    public String getGrillType() {
        return grill_type;
    }

    public void setGrillType(String grill_type) {
        this.grill_type = grill_type;
    }

    public String getMeatType() {
        return meat_type;
    }

    public void setMeatType(String meat_type) {
        this.meat_type = meat_type;
    }

    public String getSoda() {
        return soda;
    }

    public void setSoda(String soda) {
        this.soda = soda;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public void showData() {
        System.out.println("********** " + grill_type + " **********");
        System.out.println();
        System.out.println("* Tipo de Carne : " + meat_type);
        System.out.println("* Refresco      : " + soda);
        System.out.println("* Guarninciones : " + others);
        System.out.println();
        System.out.println("**********--------**********");
        System.out.println();
    }
}
