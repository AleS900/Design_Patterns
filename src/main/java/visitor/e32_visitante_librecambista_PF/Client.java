package visitor.e32_visitante_librecambista_PF;

public class Client {
    public static void main(String []sss){

        Argentina argentina = new Argentina();
        argentina.setMountOfMoney(500);
        Bolivia bolivia = new Bolivia();
        bolivia.setMountOfMoney(50);
        Brasil brasil = new Brasil();
        brasil.setMountOfMoney(50);
        Italia italia = new Italia();
        italia.miembroDeLaUnionEuropea(true);
        italia.setMountOfMoney(18);

        Librecambista librecambista = new Librecambista();
        argentina.accept(librecambista);
        bolivia.accept(librecambista);
        brasil.accept(librecambista);
        italia.accept(librecambista);
    }
}
