package interpreter.e7_interprete_user_stories;

public class TerminalExpressionOtros extends AbstractExpression {

    public TerminalExpressionOtros(int word_length){
        this.word_length =word_length;
    }

    @Override
    public void interpreter(ContextUserStory context) {
        context.output = context.output + " " + context.input.substring(0,word_length) + " ";;
        context.input = context.input.substring(word_length);
    }
}
