package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public interface IVisitante {
    void elegirKit(Laptop laptop);
    void elegirKit(PC pc);
    void elegirKit(Tablet tablet);
}
