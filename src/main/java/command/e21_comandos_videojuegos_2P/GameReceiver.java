package command.e21_comandos_videojuegos_2P;

public class GameReceiver {
    private String game_version;
    private String game_plataform;
    private boolean game_complete_version;

    public GameReceiver(String game_version, String game_plataform, boolean game_complete_version) {
        this.game_version = game_version;
        this.game_plataform = game_plataform;
        this.game_complete_version = game_complete_version;
    }

    public void showInfo() {
        System.out.println("*********** THE GAME ***********");
        System.out.println("-- Versión del Juego: " + game_version);
        System.out.println("-- Platafomra       : " + game_plataform);
        System.out.println("-- Versión Completa : " + game_complete_version);
        System.out.println("********************************\n");
    }

    public void actShoot() {
        System.out.println("COMMAND >> shooting :");
        System.out.println("\n(ﾉ ° □ °)-︻╦╤─ - - -\n");
    }

    public void actDefenseMode() {
        System.out.println("COMMAND >> switching to defense mode :");
        System.out.println("\n(ﾉ ° ¬ °)ﾉ├┬┴┬┴┬┴┬┴┤\n");
    }

    public void actAttack() {
        System.out.println("COMMAND >> attacking :");
        System.out.println("\n(ﾉ ° Д °)--(=======>\n");
    }

    public void startCombo(String numeral){
        System.out.println("*********** "+ numeral +" COMBO **********\n");
    }

    public void finishCombo(){
        System.out.println("*********** COMBO FINISHED **********\n\n");
    }

}
