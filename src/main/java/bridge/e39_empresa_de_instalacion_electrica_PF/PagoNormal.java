package bridge.e39_empresa_de_instalacion_electrica_PF;

public class PagoNormal implements ITipoPago {
    @Override
    public void pagar(double precio) {
        System.out.println("INFORMACION DE PAGO");
        System.out.println("-- Tipo de Pago: Presencial");
        System.out.println("-- Descuento   : --");
        System.out.println("-- Total Pagado: " + precio + " Bs.");
    }
}
