package adapter.e33_tienda_de_aparatos_electronicos_PF;

public class Computadora implements IElectrodomesticosPrimeraEmpresa {
    private String pc_trademark;
    private String pc_os;
    private Integer pc_price;
    private String pc_life_time;

    public Computadora(String pc_trademark, String pc_os, Integer pc_price, String pc_life_time) {
        this.pc_trademark = pc_trademark;
        this.pc_os = pc_os;
        this.pc_price = pc_price;
        this.pc_life_time = pc_life_time;
    }

    @Override
    public void price() {
        System.out.println("* Precio de la computadora " + pc_trademark + ", con sistema operativo" + pc_os + ": " + pc_price + " $us.\n");
    }

    @Override
    public void lifeTime() {
        System.out.println("* Tiempo de vida de la computadora " + pc_trademark + ": "  + pc_life_time + " aproximadamente.\n");
    }

    public String getPc_trademark() {
        return pc_trademark;
    }

    public void setPc_trademark(String pc_trademark) {
        this.pc_trademark = pc_trademark;
    }

    public String getPc_os() {
        return pc_os;
    }

    public void setPc_os(String pc_os) {
        this.pc_os = pc_os;
    }

    public Integer getPc_price() {
        return pc_price;
    }

    public void setPc_price(Integer pc_price) {
        this.pc_price = pc_price;
    }

    public String getPc_life_time() {
        return pc_life_time;
    }

    public void setPc_life_time(String pc_life_time) {
        this.pc_life_time = pc_life_time;
    }
}
