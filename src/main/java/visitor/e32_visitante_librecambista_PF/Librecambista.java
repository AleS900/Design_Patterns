package visitor.e32_visitante_librecambista_PF;

import java.text.DecimalFormat;

public class Librecambista implements IVisitante{
    DecimalFormat formato = new DecimalFormat("#.00");

    @Override
    public void cambiandoMoneda(Argentina argentina) {
        System.out.println("Se esta en un país de América del Sur,");
        System.out.println("en este caso en Argentina, se tiene un monto de: " + argentina.getMountOfMoney() + " ARS");
        System.out.println("De Pesos Argentinos a Dólares: " + formato.format(0.0104 * argentina.getMountOfMoney()) + " $us");
    }

    @Override
    public void cambiandoMoneda(Bolivia bolivia) {
        System.out.println("\nSe esta en un país de América del Sur,");
        System.out.println("en este caso en: Bolivia, se tiene un monto de: " + bolivia.getMountOfMoney() + " Bs");
        System.out.println("De Bolivianos a Dólares: " + formato.format(0.14338 * bolivia.getMountOfMoney()) + " $us");
    }

    @Override
    public void cambiandoMoneda(Brasil brasil) {
        System.out.println("\nSe esta en un país de América del Sur,");
        System.out.println("en este caso en: Brasil, se tiene un monto de: " + brasil.getMountOfMoney() + " BRL");
        System.out.println("De Reales Brasileños a Dólares: " + formato.format(0.1996 * brasil.getMountOfMoney()) + " $us");
    }

    @Override
    public void cambiandoMoneda(Italia italia) {
        System.out.println("\nSe esta en un país de Europa,");
        System.out.println("en este caso en Italia, se tiene un monto de: " + italia.getMountOfMoney() + " EUR");
        System.out.println("De Euros a Dólares: " + formato.format(italia.getCoin_value() * italia.getMountOfMoney()) + " $us");
    }
}
