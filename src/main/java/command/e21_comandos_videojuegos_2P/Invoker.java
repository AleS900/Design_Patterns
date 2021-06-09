package command.e21_comandos_videojuegos_2P;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IComandosEspecificos> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(IComandosEspecificos concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommands(){
        for (IComandosEspecificos command: commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
