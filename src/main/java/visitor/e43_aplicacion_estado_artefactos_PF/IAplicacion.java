package visitor.e43_aplicacion_estado_artefactos_PF;

public interface IAplicacion {
    void obtenerEstado(Celular cell_phone);
    void obtenerEstado(Computadora pc);
    void obtenerEstado(Televisor tv);
}
