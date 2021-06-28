package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public interface IDispositivo {
    void accept(IVisitante visitante);
    int getPrice();
    void setPrice();
}
