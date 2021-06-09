package observer.e22_empresa_telefonica_2P;

public interface ICliente {
    void update(String message, NotificacionEmpresa video);
    String getClientCategory();
    boolean getClientSupscriptionToPrices();
    boolean getClientSupscriptionToPromotions();
    boolean getClientSupscriptionToGifts();
    boolean getClientSupscriptionToNews();
}
