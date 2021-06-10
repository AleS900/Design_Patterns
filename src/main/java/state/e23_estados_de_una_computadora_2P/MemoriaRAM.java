package state.e23_estados_de_una_computadora_2P;

public class MemoriaRAM {
    private int ram_percentage_use = 0;
    private String ram_c_state;

    public MemoriaRAM(int ram_percentage_use, String estado_de_consumo) {
        this.ram_percentage_use = ram_percentage_use;
        this.ram_c_state = estado_de_consumo;
    }

    public int getPercentageUse() {
        return ram_percentage_use;
    }

    public void setPercentageUse(int ram_percentage_use) {
        this.ram_percentage_use = ram_percentage_use;
    }

    public String getRam_c_state() {
        return ram_c_state;
    }

    public void setRam_c_state(String ram_c_state) {
        this.ram_c_state = ram_c_state;
    }
}
