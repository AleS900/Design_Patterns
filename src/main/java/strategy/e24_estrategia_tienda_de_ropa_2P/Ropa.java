package strategy.e24_estrategia_tienda_de_ropa_2P;

public class Ropa {
    private String clo_id;
    private String clo_type;
    private Integer clo_price;
    private String season;

    public Ropa() {
    }

    public Ropa(String clo_id, String clo_type, Integer clo_price, String season) {
        this.clo_id = clo_id;
        this.clo_type = clo_type;
        this.clo_price = clo_price;
        this.season = season;
    }

    public void showInfo(){
        System.out.println("-- ID        : " + clo_id);
        System.out.println("-- Tipo      : " + clo_type);
        System.out.println("-- Precio    : " + clo_price + " Bs.");
    }

    public String getClothesID() {
        return clo_id;
    }

    public void setClothesID(String clo_id) {
        this.clo_id = clo_id;
    }

    public String getClothesType() {
        return clo_type;
    }

    public void setClothesType(String clo_type) {
        this.clo_type = clo_type;
    }

    public Integer getClothesPrice() {
        return clo_price;
    }

    public void setClothesPrice(Integer clo_price) {
        this.clo_price = clo_price;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
