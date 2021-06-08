package chainOfResponsability.e18_servicio_de_software_2P;

public class QA  implements IHandler {
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
        if (persona.getConsulta().equals("BUG") || persona.getConsulta().equals("MEJORA") ){
            System.out.println("INFO >> Solicitud de " + persona.getConsulta() + " será procesada por QA, se aislará el error.");
        } else {
            this.next.aceptarConsulta(persona);
        }
    }
}
