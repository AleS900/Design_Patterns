package chainOfResponsability.e26_cadena_de_mando_ejercito_2P;

public class CuerpoDelEjercito implements IHandler {
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
    public void atenderOrden(OrdenDeMando order) {
        General general = new General();
        this.setNext(general);

        Teniente lieutenant = new Teniente();
        general.setNext(lieutenant);

        Coronel colonel = new Coronel();
        lieutenant.setNext(colonel);

        Cabo corporal = new Cabo();
        colonel.setNext(corporal);

        this.next.atenderOrden(order);
    }
}

