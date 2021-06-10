package state.e23_estados_de_una_computadora_2P;

import java.util.Map;

public class ArregloProgramas {
    private String arr_id;
    private Programa[] arr_data;
    private Map<Integer, Boolean>[] list_id;

    public ArregloProgramas(String arr_id, Programa[] arr_data) {
        this.arr_id = arr_id;
        this.arr_data = arr_data;
    }

    public String getArr_id() {
        return arr_id;
    }

    public void setArr_id(String arr_id) {
        this.arr_id = arr_id;
    }

    public Programa[] getArr_data() {
        return arr_data;
    }

    public void setArr_data(Programa[] arr_data) {
        this.arr_data = arr_data;
    }

    public void showInfo(int number){
        for(int i=0; i<number; i++){
            int numero = (int)(Math.random() * number+1);
                System.out.println("Programa abierto: " + arr_data[(int)(Math.random()*number+1)].getProg_name());
        }
        System.out.println("*********************\n");
    }
}
