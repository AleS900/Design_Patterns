package factoryMethod.e13_kit_utiles_escolares;

public class Deportivo {
    private String spw_size;
    private String spw_color;
    private String spw_num_garments;
    private String spw_id;

    public Deportivo() {
    }

    public String getSportswearSize() {
        return spw_size;
    }

    public void setSportswearSize(String spw_size) {
        this.spw_size = spw_size;
    }

    public String getSportswearcColor() {
        return spw_color;
    }

    public void setSportswearColor(String spw_color) {
        this.spw_color = spw_color;
    }

    public String getSportswearNumGarments() {
        return spw_num_garments;
    }

    public void setSportswearNumGarments(String spw_num_garments) {
        this.spw_num_garments = spw_num_garments;
    }

    public String getSportswearID() {
        return spw_id;
    }

    public void setSportswearID(String spw_id) {
        this.spw_id = spw_id;
    }

    public void showInfo() {
        System.out.println("              - Código Identificador: " + spw_id);
        System.out.println("              - Talla               : " + spw_size);
        System.out.println("              - Color               : " + spw_color);
        System.out.println("              - Número de Prendas   : " + spw_num_garments);
    }
}
