package interpreter.e6_numeros_romanos;

public class TerminalExpresion_X extends AbstractExpresion{
    @Override
    public void interpreter(ContextRomanos context) {
        int input_number = Integer.parseInt(context.input.substring(0, 1));
        if(input_number == 9){
            context.output = context.output + "IX";
        } else {
            context.input = context.input.substring(1);
            context.output = context.output + "X";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
