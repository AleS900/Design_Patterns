package state.e23_estados_de_una_computadora_2P;

public class Computadora {
    private IStateComputadora state;
    private MemoriaRAM ram_memory;
    private CPU cpu;
    private ArregloProgramas prog_array;
    private int prog_number;

    public IStateComputadora getState() {
        return state;
    }

    public void setState(IStateComputadora state) {
        this.state = state;
    }

    public void request(){
        this.state.handler(this);
    }

    public MemoriaRAM getRam_memory() {
        return ram_memory;
    }

    public void setRam_memory(MemoriaRAM ram_memory) {
        this.ram_memory = ram_memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArregloProgramas getProg_array() {
        return prog_array;
    }

    public void setProg_array(ArregloProgramas prog_array) {
        this.prog_array = prog_array;
    }

    public int getProg_number() {
        return prog_number;
    }

    public void setProg_number(int prog_number) {
        this.prog_number = prog_number;
    }
}
