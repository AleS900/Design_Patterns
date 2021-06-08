package chainOfResponsability.e18_servicio_de_software_2P;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();
    void aceptarConsulta(Persona persona);
}
