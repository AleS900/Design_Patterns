package memento.e17_back_up_base_de_datos_2P;

public class Memento {
    private ConcreteBackUp state;

    public Memento(ConcreteBackUp stateSaved){
        this.state = stateSaved;
    }

    public ConcreteBackUp getState() {
        return state;
    }
}
