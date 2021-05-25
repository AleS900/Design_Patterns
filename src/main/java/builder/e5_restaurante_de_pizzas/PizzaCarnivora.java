package builder.e5_restaurante_de_pizzas;

public class PizzaCarnivora extends BuilderPizza{
    @Override
    public void buildPizzaType(){
        pizza.setPizza_type("PIZZA CARNIVORA");
    }

    @Override
    public void buildIngredients(){
        pizza.setIngredients("Carne, Tocino, Salami, Jamón, Salsa de Tomate, Orégano");
    }

    @Override
    public void buildDoughType() {
        pizza.setPizza_dough("Masa Especial");
    }

    @Override
    public void buildCheeseType() {
        pizza.setCheese("Queso Mozzarella");
    }
}
