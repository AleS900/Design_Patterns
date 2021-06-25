package composite.e36_computadoras_laboratorios_contenedores_PF;

public class Computadora extends ArtefactoElectronico{

    public Computadora(String af_id, String type) {
        super(af_id, type);
    }

    @Override
    public void calculatePrice() {
        this.getPrice();
    }

    @Override
    public void add(ArtefactoElectronico artefactoElectronico) {
        System.out.println("No applicable");
    }

    @Override
    public void remove(ArtefactoElectronico artefactoElectronico) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
