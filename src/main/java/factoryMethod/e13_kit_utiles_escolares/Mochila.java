package factoryMethod.e13_kit_utiles_escolares;

public class Mochila {
    private String bp_id;
    private String bp_trademark;
    private String bp_pockets_number;
    private String bp_size;

    public Mochila() {
    }

    public String getBackpackID() {
        return bp_id;
    }

    public void setBackpackID(String bp_id) {
        this.bp_id = bp_id;
    }

    public String getBackpacktrademark() {
        return bp_trademark;
    }

    public void setBackpackTrademark(String bp_trademark) {
        this.bp_trademark = bp_trademark;
    }

    public String getBackpackPocketsNumber() {
        return bp_pockets_number;
    }

    public void setBackpackPocketsNumber(String bp_pockets_number) {
        this.bp_pockets_number = bp_pockets_number;
    }

    public String getBackpackSize() {
        return bp_size;
    }

    public void setBackpackSize(String bp_size) {
        this.bp_size = bp_size;
    }

    public void showInfo() {
        System.out.println("              - Código Identificador: " + bp_id);
        System.out.println("              - Marca               : " + bp_trademark);
        System.out.println("              - Número de Bolsillos : " + bp_pockets_number);
        System.out.println("              - Tamaño              : " + bp_size);
    }
}
