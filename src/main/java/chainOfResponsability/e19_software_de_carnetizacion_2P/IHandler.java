package chainOfResponsability.e19_software_de_carnetizacion_2P;

public interface IHandler {
        void setNext(IHandler handler);
        IHandler next();
        void iniciarCarnetizacion(Persona persona);
}
