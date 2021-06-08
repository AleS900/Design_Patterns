package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class ResponsableDeCarnetizacion implements IHandler {
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
        if (person.isPersonBirthCertificate() && person.isPersonPaymentToTheBank() && person.isPersonTicket()){
            System.out.println("****************************************************************\n");
            System.out.println("INFO >> Solicitud de carnetización de: " + person.getPersonName() + " " + person.getPersonLastName());
            System.out.println("     >> REQUISITOS CORRECTOS, iniciando proceso a cargo del");
            System.out.println("     >> Reponsable de Carnetización.\n");
            System.out.println("****************************************************************\n");
        } else {
            this.next.iniciarCarnetizacion(person);
        }
    }
}
