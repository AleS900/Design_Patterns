package interpreter.e6_numeros_romanos;

public class Client {
    public static void main (String[]args){

        System.out.println("***** DE NUMEROS NATURALES A ROMANOS *****");

        System.out.println("1.");
        String natural_numbers = "1 2 3 4 5 6 7 8 9 10";
        InterpreterRomanos roman_numbers = new InterpreterRomanos(natural_numbers);
        System.out.println("* Números Naturales: "+ natural_numbers);
        System.out.println("* Números Romanos  : "+ roman_numbers.interpretar());

        System.out.println();

        System.out.println("2.");
        String natural_numbers1 = "10 9 8 7 6 5 4 3 2 1";
        InterpreterRomanos roman_numbers1 = new InterpreterRomanos(natural_numbers1);
        System.out.println("* Números Naturales: "+ natural_numbers1);
        System.out.println("* Números Romanos  : "+ roman_numbers1.interpretar());

        System.out.println();

        System.out.println("3.");
        String natural_numbers2 = "1 3 5 7 9 2 4 6 8 10";
        InterpreterRomanos roman_numbers2 = new InterpreterRomanos(natural_numbers2);
        System.out.println("* Números Naturales: "+ natural_numbers2);
        System.out.println("* Números Romanos  : "+ roman_numbers2.interpretar());

        System.out.println();

        System.out.println("4.");
        String natural_numbers3 = "5 7 6 7 6 5 4 5";
        InterpreterRomanos roman_numbers3 = new InterpreterRomanos(natural_numbers3);
        System.out.println("* Números Naturales: "+ natural_numbers3);
        System.out.println("* Números Romanos  : "+ roman_numbers3.interpretar());

        System.out.println();

        System.out.println("5.");
        String natural_numbers4 = "10 9 10 8 10 7 10 6 5 6";
        InterpreterRomanos roman_numbers4 = new InterpreterRomanos(natural_numbers4);
        System.out.println("* Números Naturales: "+ natural_numbers4);
        System.out.println("* Números Romanos  : "+ roman_numbers4.interpretar());

    }
}
