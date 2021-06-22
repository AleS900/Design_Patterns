package adapter.e33_tienda_de_aparatos_electronicos_PF;

public class Client {
    public static void main(String[] arg) {
        IElectrodomesticosPrimeraEmpresa cell_phone = new Celular("Samsung", "Note 20  Ultra", 1200, "1 año");
        IElectrodomesticosPrimeraEmpresa tablet = new Tableta("Apple", "ITab 10", "2018", 1000, "2 años");
        IElectrodomesticosPrimeraEmpresa laptop = new Computadora("HP", "Windows 10", 2000 ,"4 años");
        IElectrodomesticosPrimeraEmpresa tv = new ElectordomesticoE2Adaptado(new Televisor("IRT", "64 pulgadas", 2800, "6 años"));
        IElectrodomesticosPrimeraEmpresa wash_machine = new ElectordomesticoE2Adaptado(new Lavadora("Samsung", 7.5, 1350, "2 años y medio"));
        IElectrodomesticosPrimeraEmpresa refrigerator = new ElectordomesticoE2Adaptado(new Refrigerador("LG", "de dos puertas horizontales con congelador superior", true, 2100, "3 años"));

        //MOSTRAR PRECIOS
        System.out.println("************ PRECIOS ************");
        cell_phone.price();
        tablet.price();
        laptop.price();
        tv.price();
        wash_machine.price();
        refrigerator.price();

        //MOSTRAR TIEMPO DE VIDA
        System.out.println("\n********* TIEMPO DE VIDA *********");
        cell_phone.lifeTime();
        tablet.lifeTime();
        laptop.lifeTime();
        tv.lifeTime();
        wash_machine.lifeTime();
        refrigerator.lifeTime();
    }
}
