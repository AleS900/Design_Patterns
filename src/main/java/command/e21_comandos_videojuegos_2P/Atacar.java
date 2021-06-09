package command.e21_comandos_videojuegos_2P;

public class Atacar implements IComandosEspecificos {
    private GameReceiver game;

    public Atacar(GameReceiver game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("-- Atacando.....");
        this.game.actAttack();
    }
}
