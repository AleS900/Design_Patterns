package interpreter.e6_numeros_romanos;

public class TerminalExpresion_I extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        for(int i = 0 ; i < Integer.parseInt(context.input.substring(0, 1)); i++) {
            context.output = context.output + "I";
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
