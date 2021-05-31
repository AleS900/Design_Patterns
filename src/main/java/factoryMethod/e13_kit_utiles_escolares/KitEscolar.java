package factoryMethod.e13_kit_utiles_escolares;

public class KitEscolar implements IKit{
    private Mochila backpack;
    private Deportivo sportswear;
    private Cuaderno notebook1;
    private Cuaderno notebook2;
    private String ek_id;

    public KitEscolar() {
    }

    public KitEscolar(Mochila backpack, Deportivo sportswear, Cuaderno notebook1, Cuaderno notebook2) {
        this.backpack = backpack;
        this.sportswear = sportswear;
        this.notebook1 = notebook1;
        this.notebook2 = notebook2;
    }

    @Override
    public void create() {
        System.out.println("------------------ KIT ESCOLAR ------------------");
        System.out.println("\n* Código Ientificador: " + ek_id);
        System.out.println("* Mochila    :");
        backpack.showInfo();
        System.out.println("* Deportivo  :");
        sportswear.showInfo();
        System.out.println("* Cuadernos  :");
        System.out.println("              * Cuaderno 1:");
        notebook1.showInfo();
        System.out.println();
        System.out.println("              * Cuaderno 2:");
        notebook2.showInfo();
        System.out.println("------------------ ___________ ------------------\n");
    }

    public Mochila getBackpack() {
        return backpack;
    }

    public void setBackpack(Mochila backpack) {
        this.backpack = backpack;
    }

    public Deportivo getSportswear() {
        return sportswear;
    }

    public void setSportswear(Deportivo sportswear) {
        this.sportswear = sportswear;
    }

    public Cuaderno getNotebook1() {
        return notebook1;
    }

    public void setNotebook1(Cuaderno notebook1) {
        this.notebook1 = notebook1;
    }

    public Cuaderno getNotebook2() {
        return notebook2;
    }

    public void setNotebook2(Cuaderno notebook2) {
        this.notebook2 = notebook2;
    }

    public String getSchoolKit() {
        return ek_id;
    }

    public void setSchoolKit(String ek_id) {
        this.ek_id = ek_id;
    }
}
