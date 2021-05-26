package interpreter.e6_numeros_romanos;

public class TerminalExpresion_V extends AbstractExpresion {
    @Override
    public void interpreter(ContextRomanos context) {
        int input_number = Integer.parseInt(context.input.substring(0, 1));
        if(input_number == 4){
            context.output = context.output +"IV";
        } else if (input_number == 5){
            context.output = context.output + "V";
        } else {
            context.output = context.output + "V";
            for(int i = 0 ; i < (input_number - 5); i++) {
                context.output = context.output + "I";
            }
        }
        context.output = context.output + " ";
        context.input = context.input.substring(1);
    }
}
