package builder.e10_restaurante_de_parrillas;


public class Client {
    public static void main (String [] args){
        Restaurant grill_restaurant = new Restaurant();
        ParrillaBife bife = new ParrillaBife();
        ParrillaTira lomito = new ParrillaTira();
        ParrillaLomito tira = new ParrillaLomito();

        grill_restaurant.setBuilder(bife);
        grill_restaurant.makeParrilla();
        grill_restaurant.getParrilla().showData();

        grill_restaurant.setBuilder(tira);
        grill_restaurant.makeParrilla();
        grill_restaurant.getParrilla().showData();

        grill_restaurant.setBuilder(lomito);
        grill_restaurant.makeParrilla();
        grill_restaurant.getParrilla().showData();
    }
}
