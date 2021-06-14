package strategy.e28_modulo_de_busqueda_de_celulares_2P;

import java.util.List;

public class ListaCelulares {
    private String search_type;
    private int search_filter;
    private String search_filter_string;
    private List<Celular> phone_list;

    public ListaCelulares(String search_type, int search_filter, String search_filter_string, List<Celular> phone_list) {
        this.search_type = search_type;
        this.search_filter = search_filter;
        this.search_filter_string = search_filter_string;
        this.phone_list = phone_list;
    }

    public String getSearch_type() {
        return search_type;
    }

    public void setSearch_type(String search_type) {
        this.search_type = search_type;
    }

    public int getSearchFilter() {
        return search_filter;
    }

    public void setSearchFilter(int search_filter) {
        this.search_filter = search_filter;
    }

    public String getSearchFilterString() {
        return search_filter_string;
    }

    public void setSearchFilterString(String search_filter_string) {
        this.search_filter_string = search_filter_string;
    }

    public List<Celular> getPhoneList() {
        return phone_list;
    }

    public void setPhoneList(List<Celular> phone_list) {
        this.phone_list = phone_list;
    }
}
