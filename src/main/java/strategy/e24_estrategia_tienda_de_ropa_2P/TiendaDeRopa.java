package strategy.e24_estrategia_tienda_de_ropa_2P;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeRopa {
    private IEstrategiaDeVentas sales_strategy;
    private List<Ropa> clothes_list = new ArrayList<>();
    private String administrator;

    public TiendaDeRopa() {
    }

    public void venderConEstrategia() {
        sales_strategy.vender(this.clothes_list);
    }

    public IEstrategiaDeVentas getSalesStrategy() {
        return sales_strategy;
    }

    public void setSalesStrategy(IEstrategiaDeVentas sales_strategy) {
        this.sales_strategy = sales_strategy;
    }

    public List<Ropa> getClothesList() {
        return clothes_list;
    }

    public void setClothesList(List<Ropa> clothes_list) {
        this.clothes_list = clothes_list;
    }

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }
}
