package chainOfResponsability.e18_servicio_de_software_2P;

public class Support  implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void aceptarConsulta(Persona persona) {
        if (persona.getConsulta().equals("OTRO")) {
            System.out.println("INFO >> Solicitud de " + persona.getConsulta() + " será procesada por Support.");
        } else {
            System.out.println("INFO >> ¡ERROR! Tipo de Solicitud Desconocido ¡ERROR!" );
        }
    }
}
