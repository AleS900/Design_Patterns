package memento.e25_tesis_de_un_estudiante_2P;

public class Memento {
    private ConcreteTesis state;

    public Memento(ConcreteTesis stateSaved){
        this.state=stateSaved;
    }

    public ConcreteTesis getState() {
        return state;
    }
}
