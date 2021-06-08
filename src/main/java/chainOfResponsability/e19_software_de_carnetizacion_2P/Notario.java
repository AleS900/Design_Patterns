package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class Notario implements IHandler {
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
        if (!person.isPersonBirthCertificate() && person.isPersonPaymentToTheBank() && person.isPersonTicket()){
            System.out.println("****************************************************************\n");
            System.out.println("INFO >> Solicitud de carnetización de: " + person.getPersonName() + " " + person.getPersonLastName());
            System.out.println("     >> REQUISITOS INCOMPLETOS, enviando al cliente a obtener");
            System.out.println("     >> su Certificado de Nacimiento a cargo de un Notario;");
            System.out.println("     >> luego se continuará con el proceso.\n");
            reiniciarCarnetizacion(person);
        } else {
            this.next.iniciarCarnetizacion(person);
        }
    }

    public void reiniciarCarnetizacion(Persona person){
        ServicioCarnetizacion service_restart = new ServicioCarnetizacion();
        person.setPersonBirthCertificate(true);
        service_restart.iniciarCarnetizacion(person);
    }
}
