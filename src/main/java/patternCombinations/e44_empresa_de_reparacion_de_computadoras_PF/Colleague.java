package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public abstract class Colleague {
    protected IServicioDeMensajes servicioDeMensajes;

    public Colleague(IServicioDeMensajes mediator){
            this.servicioDeMensajes =mediator;
    }

    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
