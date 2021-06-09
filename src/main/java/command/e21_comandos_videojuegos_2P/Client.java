package command.e21_comandos_videojuegos_2P;

public class Client {
    public static void main (String[]args){
        GameReceiver game = new GameReceiver("2.2.4", "WINDOWS", true);

        Disparar shoot =  new Disparar(game);
        CambiarAModoDefensa defense_mode = new CambiarAModoDefensa(game);
        Atacar attack = new Atacar(game);

        //Action Combo 1
        Invoker make_sequence_of_actions_1 = new Invoker();
        make_sequence_of_actions_1.addCommand(shoot);
        make_sequence_of_actions_1.addCommand(shoot);
        make_sequence_of_actions_1.addCommand(defense_mode);
        make_sequence_of_actions_1.addCommand(attack);
        make_sequence_of_actions_1.addCommand(defense_mode);

        //Action Combo 2
        Invoker make_sequence_of_actions_2 = new Invoker();
        make_sequence_of_actions_2.addCommand(defense_mode);
        make_sequence_of_actions_2.addCommand(defense_mode);
        make_sequence_of_actions_2.addCommand(attack);
        make_sequence_of_actions_2.addCommand(attack);
        make_sequence_of_actions_2.addCommand(shoot);
        make_sequence_of_actions_2.addCommand(defense_mode);
        make_sequence_of_actions_2.addCommand(defense_mode);

        game.showInfo();
        //Llamando a comando específico
        game.startCombo("FIRST");
        make_sequence_of_actions_1.executeCommands();
        game.finishCombo();
        game.startCombo("SECOND");
        make_sequence_of_actions_2.executeCommands();
        game.finishCombo();
    }
}
