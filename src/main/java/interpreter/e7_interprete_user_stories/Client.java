package interpreter.e7_interprete_user_stories;

public class Client {
    public static void main (String[]args){
        System.out.println("***** USER STORIES --> GHERKINS FORMAT ****");

        System.out.println("1.");
        String user_story = "\n- Como : Desarrollador. \n- Quiero : Una herramienta. \n- Para : Recoger los requisitos del SW Fácil y Bien.";
        InterpreterUserStory gherkins_format = new InterpreterUserStory(user_story);
        System.out.println("* User Story     : "+ user_story);
        System.out.println();
        System.out.println("* Gherkins Format: "+ gherkins_format.interpretar());

        System.out.println();

        System.out.println("2.");
        String user_story1 = "\n- Como : Equipo de Desarrollo. \n- Quiero : Descomponer una Historia de Usuario en Tareas. \n- Para : Trazar un plan que nos permita entregar el Incremento de Producto de Valor.";
        InterpreterUserStory gherkins_format1 = new InterpreterUserStory(user_story1);
        System.out.println("* User Story     : "+ user_story1);
        System.out.println();
        System.out.println("* Gherkins Format: "+ gherkins_format1.interpretar());
    }
}
