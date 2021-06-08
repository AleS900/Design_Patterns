package chainOfResponsability.e18_servicio_de_software_2P;

public class Developer  implements IHandler {
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
        if (persona.getConsulta().equals("FUNCIONALIDAD")  ){
            System.out.println("INFO >> Solicitud de " + persona.getConsulta() + " será procesada por Developer, se estimará la nueva funcionalidad.");
        } else {
            this.next.aceptarConsulta(persona);
        }
    }
}
