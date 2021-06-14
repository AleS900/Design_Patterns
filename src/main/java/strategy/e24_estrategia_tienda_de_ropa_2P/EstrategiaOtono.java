package strategy.e24_estrategia_tienda_de_ropa_2P;

import java.util.List;

public class EstrategiaOtono implements IEstrategiaDeVentas {
    @Override
    public void vender(List<Ropa> clothesList) {
        System.out.println("****TEMPORADA DE OTOñO****");
        int it =1;
        for(Ropa clothes : clothesList) {
            if(clothes.getSeason().toUpperCase().equals("OTONO")) {
                System.out.println("Ropa " + it++);
                clothes.showInfo();
                System.out.println("-- Precio de   ");
                System.out.println("   temporada : " +  Math.round( (clothes.getClothesPrice() * 0.5)*100.0)/100.0 + " Bs.\n");
            }
        }

    }
}
