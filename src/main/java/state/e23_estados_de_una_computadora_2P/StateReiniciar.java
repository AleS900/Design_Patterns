package state.e23_estados_de_una_computadora_2P;

public class StateReiniciar implements IStateComputadora {
    public StateReiniciar() {
    }

    @Override
    public void handler(Computadora computadora) {
        System.out.println("** Estado: Reiniciando **");
        computadora.setRam_memory(new MemoriaRAM(0,"nulo"));
        computadora.setCpu(new CPU(0,"Apagado"));
        computadora.setProg_number(0);
        System.out.println("--Porcentaje CPU              : " + computadora.getCpu().getCpu_percentage_id());
        System.out.println("--Porcentaje Memoria Usada    : " + computadora.getRam_memory().getPercentageUse());
        System.out.println("--Número de Programas Abiertos: " + computadora.getProg_number());
        System.out.println("*********************\n");
    }
}
