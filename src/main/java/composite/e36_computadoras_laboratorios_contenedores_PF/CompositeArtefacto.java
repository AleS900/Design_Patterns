package composite.e36_computadoras_laboratorios_contenedores_PF;

import java.util.ArrayList;
import java.util.List;

public class CompositeArtefacto extends ArtefactoElectronico {
    private List<ArtefactoElectronico> artifacts_list = new ArrayList<>();

    public CompositeArtefacto(String af_id, String type) {
        super(af_id, type);
    }

    @Override
    public void calculatePrice() {
        Global.total_amount = Global.total_amount + this.getPrice();
        for (ArtefactoElectronico artifact: artifacts_list) {
            artifact.calculatePrice();
            System.out.println("---- ARTEFACTO " + artifact.getType().toUpperCase() + " ----");
            showAmount(artifact);
        }

    }

    public void showAmount(ArtefactoElectronico artifact){
        System.out.println("------------------------------");
        System.out.println("| PRECIO ACTUAL : " + Global.total_amount +" |  ID: " + artifact.getAf_id());
        System.out.println("------------------------------\n");
    }

    public void showTotalAmount(){
        System.out.println("---- ARTEFACTO CONTENEDOR (TOTAL) ----");
        System.out.println("| TOTAL: " + Global.total_amount +" |");
        System.out.println("------------------------------\n");
    }

    @Override
    public void add(ArtefactoElectronico artefactoElectronico) {
        artifacts_list.add(artefactoElectronico);
    }

    @Override
    public void remove(ArtefactoElectronico artefactoElectronico) {
        artifacts_list.remove(artefactoElectronico);
    }

    @Override
    public void getChild(int position) {
        //todo
    }
}
