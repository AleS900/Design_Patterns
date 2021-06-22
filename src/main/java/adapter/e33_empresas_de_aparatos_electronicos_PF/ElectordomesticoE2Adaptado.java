package adapter.e33_empresas_de_aparatos_electronicos_PF;

public class ElectordomesticoE2Adaptado implements IElectrodomesticosPrimeraEmpresa{
    private IElectrodomesticosSegundaEmpresa appliance;

    public ElectordomesticoE2Adaptado(IElectrodomesticosSegundaEmpresa appliance) {
        this.appliance = appliance;
    }

    @Override
    public void price() {
        if (appliance instanceof Refrigerador) {
            System.out.println("Adaptando el costo de un Refrigerador, al precio");
        } else if (appliance instanceof Televisor) {
            System.out.println("Adaptando el costo de un Televisor, al precio");
        } else if (appliance instanceof Lavadora) {
            System.out.println("Adaptando el costo de un Lavadora, al precio");
        }
        System.out.println("de un electrodoméstico de la Primera Empresa,");
        System.out.println("es decir, el COSTO es igual al PRECIO:");
        this.appliance.cost();
    }

    @Override
    public void lifeTime() {
        if (appliance instanceof Refrigerador) {
            System.out.println("Adaptando el tiempo de garantía de un Refrigerador, al tiempo");
        } else if (appliance instanceof Televisor) {
            System.out.println("Adaptando el tiempo de garantía de un Televisor, al tiempo");
        } else if (appliance instanceof Lavadora) {
            System.out.println("Adaptando el tiempo de garantía de un Lavadora, al tiempo");
        }
        System.out.println("de vida de un electrodoméstico de la Primera Empresa,");
        System.out.println("siendo el tiempo de garantía igual al tiempo de vida:");
        this.appliance.warrantyTime();
    }
}
