package patternCombinations.e27_repositorio_de_github_2P;

public class Memento {
    private MMConcreteCodigo state;

    public Memento(MMConcreteCodigo stateSaved){
        this.state=stateSaved;
    }

    public MMConcreteCodigo getState() {
        return state;
    }
}
