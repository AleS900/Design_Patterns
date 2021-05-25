package builder.e5_restaurante_de_pizzas;

public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza(){
        return pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    public abstract void buildPizzaType();
    public abstract void buildIngredients();
    public abstract void buildDoughType();
    public abstract void buildCheeseType();
}
