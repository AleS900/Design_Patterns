package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class AyudaAlCiente implements IHandler {
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
    public void iniciarCarnetizacion(Persona person) {
        if (!person.isPersonBirthCertificate() && !person.isPersonPaymentToTheBank() && person.isPersonTicket()){
            System.out.println("****************************************************************\n");
            System.out.println("INFO >> Solicitud de carnetización de: " + person.getPersonName() + " " + person.getPersonLastName());
            System.out.println("     >> REQUISITOS INCOMPLETOS E INEXISTENTES, enviando al cliente");
            System.out.println("     >> al Servicio de Ayuda al Cliente para obtener la información");
            System.out.println("     >> de los Requisitos pra iniciar el servicio de Carnetización.\n");
            System.out.println("****************************************************************\n");
        } else {
            System.out.println("****************************************************************\n");
            System.out.println("INFO >> ¡ERROR! El Cliente no tiene una Ficha de Atención ¡ERROR!\n");
            System.out.println("****************************************************************\n");
        }
    }
}
