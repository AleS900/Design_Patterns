package builder.e10_restaurante_de_parrillas;

public class ParrillaLomito extends BuilderParrilla {
    @Override
    public void buildGrillType(){
        parrilla.setGrillType("LOMITO");
    }

    @Override
    public void buildMeatType(){
        parrilla.setMeatType("Lomito");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Fanta");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Papas");
    }
}
