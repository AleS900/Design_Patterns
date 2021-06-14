package strategy.e24_estrategia_tienda_de_ropa_2P;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String []args) {
        TiendaDeRopa clothing_store = new TiendaDeRopa();
        clothing_store.setAdministrator("María Jose De La Riva");
        List<Ropa> clothes_list =  new ArrayList<>();
        clothes_list.add(new Ropa("SW-01", "Suéter", 280, "Invierno"));
        clothes_list.add(new Ropa("WH-07", "Gorro", 45, "Invierno"));
        clothes_list.add(new Ropa("JK-10", "Abrigo", 450, "Invierno"));
        clothes_list.add(new Ropa("TS-06", "Camiseta de Manga Corta", 108, "Verano"));
        clothes_list.add(new Ropa("SH-20", "Pantalones Cortos", 85, "Verano"));
        clothes_list.add(new Ropa("TS-13", "Camiseta de Manga Corta", 110, "Verano"));
        clothes_list.add(new Ropa("TS-14", "Camiseta de Manga Corta", 120, "Primavera"));
        clothes_list.add(new Ropa("JN-18", "Pantalón", 295, "Primavera"));
        clothes_list.add(new Ropa("CA-22", "Gorra", 40, "Primavera"));
        clothes_list.add(new Ropa("SW-07", "Suéter", 250, "Otono"));
        clothes_list.add(new Ropa("SW-19", "Suéter", 280, "Otono"));
        clothes_list.add(new Ropa("JN-34", "Pantalón", 300, "Otono"));

        clothing_store.setClothesList(clothes_list);
        //INVIERNO
        clothing_store.setSalesStrategy(new EstrategiaInvierno());
        clothing_store.venderConEstrategia();
        //VERANO
        clothing_store.setSalesStrategy(new EstrategiaVerano());
        clothing_store.venderConEstrategia();
        //PRIMAVERA
        clothing_store.setSalesStrategy(new EstrategiaPrimavera());
        clothing_store.venderConEstrategia();
        //OTOÑO
        clothing_store.setSalesStrategy(new EstrategiaOtono());
        clothing_store.venderConEstrategia();
    }
}
