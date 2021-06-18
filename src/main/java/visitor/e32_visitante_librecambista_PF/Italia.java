package visitor.e32_visitante_librecambista_PF;

public class Italia implements IPais{
    private double mountOfMoney;
    private boolean is_membership;
    private double coin_value;

    public Italia() {
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.cambiandoMoneda(this);
    }

    public void miembroDeLaUnionEuropea(Boolean isTrue) {
        if(isTrue){
            this.setCoin_value(1.190);
        }
    }

    public double getMountOfMoney() {
        return mountOfMoney;
    }

    public void setMountOfMoney(double mountOfMoney) {
        this.mountOfMoney = mountOfMoney;
    }

    public boolean isIs_membership() {
        return is_membership;
    }

    public void setIs_membership(boolean is_membership) {
        this.is_membership = is_membership;
    }

    public double getCoin_value() {
        return coin_value;
    }

    public void setCoin_value(double coin_value) {
        this.coin_value = coin_value;
    }
}
