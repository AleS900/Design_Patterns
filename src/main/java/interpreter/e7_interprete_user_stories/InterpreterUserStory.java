package interpreter.e7_interprete_user_stories;

import java.util.ArrayList;
import java.util.List;

public class InterpreterUserStory extends AbstractExpression {
    private List<AbstractExpression> parseTree = new ArrayList<>();
    private ContextUserStory context;

    public InterpreterUserStory(String word) {
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context = new ContextUserStory(input.replace(" ", ""));
        for (String word : input.split(" ")) {
            switch (word) {
                case "Como": case "COMO":
                    parseTree.add(new TerminalExpressionComo());
                    break;
                case "Quiero": case "QUIERO":
                    parseTree.add(new TerminalExpressionQuiero());
                    break;
                case "Para": case "PARA":
                    parseTree.add(new TerminalExpressionPara());
                    break;
                default:
                    parseTree.add(new TerminalExpressionOtros(word.length()));
                    break;
            }

        }
    }


    public String interpretar() {
        for (AbstractExpression terminalExpresion : parseTree) {
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextUserStory context) {

    }
}