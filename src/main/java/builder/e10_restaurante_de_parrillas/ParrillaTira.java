package builder.e10_restaurante_de_parrillas;

public class ParrillaTira  extends BuilderParrilla {
    @Override
    public void buildGrillType(){
        parrilla.setGrillType("TIRA");
    }

    @Override
    public void buildMeatType(){
        parrilla.setMeatType("Tira");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Coca Cola");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Fideo, Papas Fritas");
    }
}
