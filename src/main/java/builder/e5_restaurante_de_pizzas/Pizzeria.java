package builder.e5_restaurante_de_pizzas;

public class Pizzeria {
    private BuilderPizza builder;

    public void setBuilder(BuilderPizza builder){
        this.builder = builder;
    }

    public Pizza getPizza(){
        return builder.getPizza();
    }

    public void makePizza(){
        this.builder.createPizza();
        this.builder.buildPizzaType();
        this.builder.buildIngredients();
        this.builder.buildDoughType();
        this.builder.buildCheeseType();
    }
}
