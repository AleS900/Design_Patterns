package state.e23_estados_de_una_computadora_2P;

public class StatePrendido implements IStateComputadora {
    private String actionStart;

    public StatePrendido(String actionMining){
        this.actionStart =actionMining;
    }

    public String getActionStart() {
        return actionStart;
    }

    public void setActionStart(String actionStart) {
        this.actionStart = actionStart;
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Prendido **");
        System.out.println("INFO> accion   : "+ actionStart);
        System.out.println("INFO> programas: " + computadora.getProg_number());
        MemoriaRAM ram= new MemoriaRAM(0, actionStart);
        CPU cpu = new CPU(0,actionStart);
        for (int i = 0; i < computadora.getProg_number(); i++) {
            ram.setPercentageUse(i*5);
            computadora.setRam_memory(ram);
            cpu.setCpu_percentage_id(i*5);
            computadora.setCpu(cpu);
        }
        System.out.println("Uso Memoria RAM: "+ (ram.getPercentageUse()+5) +" %");
        System.out.println("Uso CPU        : "+ (cpu.getCpu_percentage_id()+5)+" %");
        System.out.println();
    }
}

