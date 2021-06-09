package command.e21_comandos_videojuegos_2P;

public class CambiarAModoDefensa implements IComandosEspecificos {
    private GameReceiver game;

    public CambiarAModoDefensa(GameReceiver game){
        this.game=game;
    }

    @Override
    public void execute() {
        System.out.println("-- Cambiando a Modo de Defensa.....");
        this.game.actDefenseMode();
    }
}