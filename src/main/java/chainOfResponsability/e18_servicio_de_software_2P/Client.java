package chainOfResponsability.e18_servicio_de_software_2P;

public class Client {
    public static void main (String[] args){
        ServicioDeSoftware servicio = new ServicioDeSoftware();

        servicio.aceptarConsulta(new Persona("1-D",  "María Rosales", "INFRAESTRUCTURA"));
        servicio.aceptarConsulta(new Persona("2-D",  "Carlos Alarcón", "FUNCIONALIDAD"));
        servicio.aceptarConsulta(new Persona("3-D",  "Alexander Entrambasaguas", "BUG"));
        servicio.aceptarConsulta(new Persona("4-D",  "Melania Soto", "COSTOS"));
        servicio.aceptarConsulta(new Persona("5-D",  "Ernesto Rodríuez", "OTRO"));
        servicio.aceptarConsulta(new Persona("6-D",  "Sebastián Villavizencio", "HOLA!"));
    }
}
