package interpreter.e7_interprete_user_stories;

public class TerminalExpressionQuiero extends AbstractExpression {
    @Override
    public void interpreter(ContextUserStory context) {
        context.output = context.output + "Then  ";
        context.input = context.input.substring(6);
    }
}
