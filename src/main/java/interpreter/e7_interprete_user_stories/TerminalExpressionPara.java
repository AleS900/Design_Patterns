package interpreter.e7_interprete_user_stories;

public class TerminalExpressionPara extends AbstractExpression  {
    @Override
    public void interpreter(ContextUserStory context) {
        context.output = context.output + "When  ";
        context.input = context.input.substring(4);
    }
}
