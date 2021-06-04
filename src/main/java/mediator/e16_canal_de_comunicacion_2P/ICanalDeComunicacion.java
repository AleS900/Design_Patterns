package mediator.e16_canal_de_comunicacion_2P;

public interface ICanalDeComunicacion {
    void send(String message, Colleague colleague);
}
