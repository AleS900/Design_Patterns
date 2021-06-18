package visitor.e32_visitante_librecambista_PF;

public class Italia extends PaisDeEuropa{
    private double coinValue;
    private String nombre;
    private boolean is_membership;
    private String coinName;

    public Italia() {
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.cambiandoMoneda(this);
    }

    @Override
    public void miembroDeLaUnionEuropea(Boolean isTrue) {
        if(isTrue){
            this.setCoinValue(1.19);
        }
    }

    public void valorFrenteAlDolar(double valor) {
        this.setCoinValue(valor);
    }

    public double getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(double coinValue) {
        this.coinValue = coinValue;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIs_membership() {
        return is_membership;
    }

    public void setIs_membership(boolean is_membership) {
        this.is_membership = is_membership;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}
