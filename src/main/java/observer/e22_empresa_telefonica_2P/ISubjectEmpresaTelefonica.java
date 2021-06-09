package observer.e22_empresa_telefonica_2P;

public interface ISubjectEmpresaTelefonica {
    void attach(ICliente observer);
    void deattach(ICliente observer);
    void notifyObserver(NotificacionEmpresa mssg);
}

