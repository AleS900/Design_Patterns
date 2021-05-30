package builder.e10_restaurante_de_parrillas;

public class ParrillaBife extends BuilderParrilla {
    @Override
    public void buildGrillType() {
        parrilla.setGrillType("BIFE");
    }

    @Override
    public void buildMeatType() {
        parrilla.setMeatType("Bife");
    }

    @Override
    public void buildSoda() {
        parrilla.setSoda("Coca Cola Sin Azucar");
    }

    @Override
    public void buildOthers() {
        parrilla.setOthers("Arroz Con Queso, Papas");
    }
}
