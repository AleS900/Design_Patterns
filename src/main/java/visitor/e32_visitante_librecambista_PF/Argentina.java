package visitor.e32_visitante_librecambista_PF;

public class Argentina extends PaisDelSur{
    private double coinValue;
    private String nombre;
    private String coinName;

    public Argentina() {
    }

    @Override
    public void accept(IVisitante visitante) {
        visitante.cambiandoMoneda(this);
    }

    @Override
    public void valorFrenteAlDolar(double valor) {
        setCoinValue(valor);
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

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }
}
