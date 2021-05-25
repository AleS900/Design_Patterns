package builder.e5_restaurante_de_pizzas;

public class Client {
    public static void main (String [] args){
        Pizzeria pizza_restaurant = new Pizzeria();
        PizzaClasica classic_pizza = new PizzaClasica();
        PizzaCarnivora meat_pizza = new PizzaCarnivora();
        PizzaHawaiana hawaiian_pizza = new PizzaHawaiana();

        pizza_restaurant.setBuilder(classic_pizza);
        pizza_restaurant.makePizza();
        pizza_restaurant.getPizza().showData();

        pizza_restaurant.setBuilder(hawaiian_pizza);
        pizza_restaurant.makePizza();
        pizza_restaurant.getPizza().showData();

        pizza_restaurant.setBuilder(meat_pizza);
        pizza_restaurant.makePizza();
        pizza_restaurant.getPizza().showData();
    }
}
