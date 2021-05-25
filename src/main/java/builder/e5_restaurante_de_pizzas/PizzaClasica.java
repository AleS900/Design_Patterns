package builder.e5_restaurante_de_pizzas;

public class PizzaClasica extends BuilderPizza {
    @Override
    public void buildPizzaType(){
        pizza.setPizza_type("PIZZA CLASICA");
    }

    @Override
    public void buildIngredients() {
        pizza.setIngredients("Jamón, Salsa de Tomate, Orégano");
    }

    @Override
    public void buildDoughType() {
        pizza.setPizza_dough("Masa Especial");
    }

    @Override
    public void buildCheeseType() {
        pizza.setCheese("Doble Queso Mozzarella");
    }
}