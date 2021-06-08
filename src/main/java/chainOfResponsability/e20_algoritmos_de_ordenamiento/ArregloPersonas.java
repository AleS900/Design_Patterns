package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public class ArregloPersonas {
    private String arr_id;
    private Persona[] arr_data;

    public ArregloPersonas(String arr_id, Persona[] arr_data) {
        this.arr_id = arr_id;
        this.arr_data = arr_data;
    }

    public String getArr_id() {
        return arr_id;
    }

    public void setArr_id(String arr_id) {
        this.arr_id = arr_id;
    }

    public Persona[] getArr_data() {
        return arr_data;
    }

    public void setArr_data(Persona[] arr_data) {
        this.arr_data = arr_data;
    }
}
