package command.e21_comandos_videojuegos_2P;

public class Disparar implements IComandosEspecificos {
    private GameReceiver game;

    public Disparar(GameReceiver game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("-- Disparando.....");
        this.game.actShoot();
    }
}