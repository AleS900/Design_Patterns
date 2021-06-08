package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class Cajero implements IHandler {
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
        if (person.isPersonBirthCertificate() && !person.isPersonPaymentToTheBank() && person.isPersonTicket()){
            System.out.println("****************************************************************\n");
            System.out.println("INFO >> Solicitud de carnetización de: " + person.getPersonName() + " " + person.getPersonLastName());
            System.out.println("     >> REQUISITOS INCOMPLETOS, enviando al cliente a pagar");
            System.out.println("     >> y obtener el comprobante del Pago Al Banco, a cargo");
            System.out.println("     >> de un Cajero; luego se continuará el proceso.\n");
            reiniciarCarnetizacion(person);
        } else {
            this.next.iniciarCarnetizacion(person);
        }
    }

    public void reiniciarCarnetizacion(Persona person){
        ServicioCarnetizacion service_restart = new ServicioCarnetizacion();
        person.setPersonPaymentToTheBank(true);
        service_restart.iniciarCarnetizacion(person);
    }
}