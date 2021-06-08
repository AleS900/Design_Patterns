package chainOfResponsability.e18_servicio_de_software_2P;

public class ServicioDeSoftware implements IHandler {
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
        DevOps devops = new DevOps();
        this.setNext(devops);

        QA qa = new QA();
        devops.setNext(qa);

        Developer developer = new Developer();
        qa.setNext(developer);

        EncargadoFinazas finazas = new EncargadoFinazas();
        developer.setNext(finazas);

        Support support = new Support();
        finazas.setNext(support);

        this.next.aceptarConsulta(persona);
    }
}

