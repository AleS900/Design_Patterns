package memento.e25_tesis_de_un_estudiante_2P;

import java.util.HashMap;
import java.util.Map;

public class DocumentoCareTaker {
    private Map<Integer,Memento> stateSaved= new HashMap<>();

    public void createVersion(Integer version, Memento memento){
        stateSaved.put(version,memento);
    }

    public Memento getMemento(Integer version){
        return stateSaved.get(version);
    }
}
