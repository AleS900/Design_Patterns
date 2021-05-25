package builder.e5_restaurante_de_pizzas;

public class PizzaHawaiana extends BuilderPizza {
    @Override
    public void buildPizzaType(){
        pizza.setPizza_type("PIZZA HAWAIANA");
    }

    @Override
    public void buildIngredients() {
        pizza.setIngredients("Piña, Cerezas, Jamón, Salsa de Tomate, Orégano");
    }

    @Override
    public void buildDoughType() {
        pizza.setPizza_dough("Masa Normal");
    }

    @Override
    public void buildCheeseType() {
        pizza.setCheese("Queso Edam Fundido");
    }
}