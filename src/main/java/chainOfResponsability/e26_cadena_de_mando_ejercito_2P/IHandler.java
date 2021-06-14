package chainOfResponsability.e26_cadena_de_mando_ejercito_2P;

public interface IHandler {
        void setNext(IHandler handler);
        IHandler next();
        void atenderOrden(OrdenDeMando orden);
}
