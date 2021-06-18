package visitor.e32_visitante_librecambista_PF;

public class Brasil implements IPais{
    private double mountOfMoney;

    public Brasil() {
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.cambiandoMoneda(this);
    }

    public double getMountOfMoney() {
        return mountOfMoney;
    }

    public void setMountOfMoney(double mountOfMoney) {
        this.mountOfMoney = mountOfMoney;
    }

}
