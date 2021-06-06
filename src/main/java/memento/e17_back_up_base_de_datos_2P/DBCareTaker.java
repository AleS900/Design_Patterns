package memento.e17_back_up_base_de_datos_2P;

import java.util.HashMap;
import java.util.Map;

public class DBCareTaker {
    private Map<String, Memento> stateSaved= new HashMap<>();

    public void createBackUp(String bc_nickname, Memento memento){
        stateSaved.put(bc_nickname,memento);
    }

    public Memento getMemento(String bc_nickname){
        return stateSaved.get(bc_nickname);
    }

}
