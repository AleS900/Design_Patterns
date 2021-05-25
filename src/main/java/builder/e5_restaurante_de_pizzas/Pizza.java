package builder.e5_restaurante_de_pizzas;

public class Pizza {
    private String pizza_type;
    private String ingredients;
    private String pizza_dough;
    private String cheese;

    public Pizza() {}

    public String getPizza_type() {
        return pizza_type;
    }

    public void setPizza_type(String pizza_type) {
        this.pizza_type = pizza_type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getPizza_dough() {
        return pizza_dough;
    }

    public void setPizza_dough(String pizza_dough) {
        this.pizza_dough = pizza_dough;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void showData() {
        System.out.println("********** " + pizza_type + " **********");
        System.out.println();
        System.out.println("* Ingredientes : " + ingredients);
        System.out.println("* Tipo de Masa : " + pizza_dough);
        System.out.println("* Tipo de Queso: " + cheese);
        System.out.println();
        System.out.println("************------------************");
        System.out.println();
    }
}
