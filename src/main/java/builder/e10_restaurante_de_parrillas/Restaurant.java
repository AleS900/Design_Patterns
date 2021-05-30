package builder.e10_restaurante_de_parrillas;

public class Restaurant {
    private BuilderParrilla builder;

    public void setBuilder(BuilderParrilla builder){
        this.builder = builder;
    }

    public Parrilla getParrilla(){
        return builder.getParrilla();
    }

    public void makeParrilla(){
        this.builder.createParrilla();
        this.builder.buildGrillType();
        this.builder.buildMeatType();
        this.builder.buildSoda();
        this.builder.buildOthers();
    }
}
