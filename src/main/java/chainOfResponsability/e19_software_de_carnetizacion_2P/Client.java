package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class Client {
    public static void main (String[] args){
        ServicioCarnetizacion servicio = new ServicioCarnetizacion();

        servicio.iniciarCarnetizacion(new Persona("7390116","Benjamín","Guzmán", true,true, true));
        servicio.iniciarCarnetizacion(new Persona("8425533","Francisco","De La Riva", false,true, true));
        servicio.iniciarCarnetizacion(new Persona("9214214","Gabriel"," Villegas", true,false, true));
        servicio.iniciarCarnetizacion(new Persona("7305252","Rodrigo","Calzadilla", false,false, true));
        servicio.iniciarCarnetizacion(new Persona("10543535","Brayan","Serrano", false,false, false));
    }
}
