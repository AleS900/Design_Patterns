package interpreter.e7_interprete_user_stories;

public class TerminalExpressionComo extends AbstractExpression {
    @Override
    public void interpreter(ContextUserStory context) {
        context.output = context.output + "Given ";
        context.input = context.input.substring(4);
    }
}
