package strategy.e28_modulo_de_busqueda_de_celulares_2P;

import java.util.ArrayList;
import java.util.List;

public class TiendaDeCelulares {
    private IEstrategiaDeBusqueda search_strategy;
    private ListaCelulares cell_phone_list;
    private String store_name;
    private int device_quantity;

    public TiendaDeCelulares() {
    }

    public void buscarConEstrategia() {
        search_strategy.buscar(this.cell_phone_list, device_quantity);
    }

    public IEstrategiaDeBusqueda getSearchStrategy() {
        return search_strategy;
    }

    public void setSearchStrategy(IEstrategiaDeBusqueda search_strategy) {
        this.search_strategy = search_strategy;
    }

    public String getStoreName() {
        return store_name;
    }

    public void setStoreName(String store_name) {
        this.store_name = store_name;
    }

    public int getDeviceQuantity() {
        return device_quantity;
    }

    public void setDeviceQuantity(int device_quantity) {
        this.device_quantity = device_quantity;
    }

    public ListaCelulares getCellPhoneList() {
        return cell_phone_list;
    }

    public void setCellPhoneList(ListaCelulares cell_phone_list) {
        this.cell_phone_list = cell_phone_list;
    }
}
