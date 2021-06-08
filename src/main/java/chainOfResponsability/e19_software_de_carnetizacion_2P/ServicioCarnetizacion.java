package chainOfResponsability.e19_software_de_carnetizacion_2P;

public class ServicioCarnetizacion implements IHandler {
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
        ResponsableDeCarnetizacion responsable = new ResponsableDeCarnetizacion();
        this.setNext(responsable);

        Notario notary = new Notario();
        responsable.setNext(notary);

        Cajero cashier = new Cajero();
        notary.setNext(cashier);

        AyudaAlCiente customer_help = new AyudaAlCiente();
        cashier.setNext(customer_help);

        this.next.iniciarCarnetizacion(person);
    }
}
