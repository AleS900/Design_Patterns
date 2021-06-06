package memento.e17_back_up_base_de_datos_2P;

public class BKOriginator {
    private ConcreteBackUp state;

    public BKOriginator(){}

    public void setState(ConcreteBackUp state) {
        System.out.println("*********** SET STATE ************");
        state.showInfo();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("********* CREATE STATE ***********");
        state.showInfo();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state = memento.getState();
        System.out.println("********* STATE RESTORED *********");
        this.state.showInfo();
    }

}
