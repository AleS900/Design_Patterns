package Extras;

public class Switch_Enum {
 /*
-- Programa Java para demostrar cómo usar Enum en la declaración del caso de Switch.
-- Enum se puede usar en un bloque de interruptores similar al patrón primitivo int o enum int.
-- Enum también se puede usar en la instrucción CASE para tomar la acción apropiada basada en la instancia de Enum.
*/
        public enum Day {

            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        }

        public static void main(String args[]) {
            Day[] daysOfWeek = Day.values();
            for (Day today : daysOfWeek) {
                //Switch Case Utilizando Enum en Java
                switch (today) {
                    case MONDAY:
                        System.err.println("- Lunes    : Quiero saber si Enum puede ser usado en Switch Case.");
                        break;
                    case TUESDAY:
                        System.err.println("- Martes   : Trato de utilizar Enum en Switch, con resultados favorables.");
                        break;
                    case WEDNESDAY:
                        System.err.println("- Miércoles: Confirmo que Enum en Java se puede usar en el caso de Switch.");
                        break;
                    case THURSDAY:
                        System.err.println("- Jueves   : Descubro que el método: Java Enum values() nos devuelve todos los Enum en una arreglo.");
                        break;
                    case FRIDAY:
                        System.err.println("- Viernes  : Me doy cuenta de que Enum también se puede utilizar en la declaración de CASE.");
                        break;
                    case SATURDAY:
                        System.err.println("- Sábado   : Me sorprendo de saber que Enum en Java tiene una complejidad de ejecución constante.");
                        break;
                    case SUNDAY:
                        System.err.println("- Domingo  : Concluyo que: USAR ENUM EN SWITCH ES MUY FACIL. :)");
                        break;

                }
            }
        }
    }


