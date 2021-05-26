package interpreter.e6_numeros_romanos;

import java.util.ArrayList;
import java.util.List;

public class InterpreterRomanos extends AbstractExpresion{
    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private ContextRomanos context;

    public InterpreterRomanos(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextRomanos(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "1": case "2" : case "3":
                    parseTree.add(new TerminalExpresion_I());
                    break;
                case "4": case "5": case "6": case "7": case "8":
                    parseTree.add(new TerminalExpresion_V());
                    break;
                case "9": case "10":
                    parseTree.add(new TerminalExpresion_X());
                    break;
                default:
                    break;
            }

        }
    }


    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(ContextRomanos context) {

    }
}
