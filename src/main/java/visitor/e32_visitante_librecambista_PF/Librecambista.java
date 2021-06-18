package visitor.e32_visitante_librecambista_PF;

public class Librecambista implements IVisitante{
    @Override
    public void cambiandoMoneda(PaisDelSur paisDelSur) {
        if(paisDelSur instanceof Argentina){
            Argentina argentina = (Argentina)paisDelSur;
            System.out.println("Se esta en un país de América del Sur,");
            System.out.println("en este caso en:  " + argentina.getNombre() + " ,");
            System.out.println(argentina.getCoinName() + " a dólares: " + argentina.getCoinValue());
        } else if (paisDelSur instanceof Bolivia){
            Bolivia boliva = (Bolivia)paisDelSur;
            System.out.println("Se esta en un país de América del Sur,");
            System.out.println("en este caso en  ");
            System.out.println("Se esta en un país de América del Sur,");
        }else if (paisDelSur instanceof Brazil){
            Brazil brazil = (Brazil)paisDelSur;
            System.out.println("Se esta en un país de América del Sur,");
            System.out.println("en este caso en  ");
            System.out.println("Se esta en un país de América del Sur,");
        } else {
            System.out.println("No se tiene datso de este pais");
        }

    }

    @Override
    public void cambiandoMoneda(PaisDeEuropa paisDeEuropa) {

    }
}
