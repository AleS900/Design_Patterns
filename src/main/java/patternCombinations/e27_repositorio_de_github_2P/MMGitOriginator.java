package patternCombinations.e27_repositorio_de_github_2P;

public class MMGitOriginator {
    private MMConcreteCodigo state;

    public MMGitOriginator(){}

    public void setState(MMConcreteCodigo state) {
        System.out.println("**** Set State *****");
        state.showInfo();
        System.out.println("********************\n");
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        state.showInfo();
        System.out.println("***********************\n");
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** STATE RESTORED *****");
        this.state.showInfo();
        System.out.println("*************************\n");
    }
}
