package abstractFactory.e4_heladeria;

public class HeladoCrema implements IHelado {
    private String cic_size;
    private String cic_form;
    private Fruta cic_fruit;
    private Base cic_base;
    private Crema cic_cream;

    public HeladoCrema(){
        cic_fruit = new Fruta();
        cic_base = new Base();
        cic_cream = new Crema();
    }

    @Override
    public void create() {
        System.out.println("*********** HELADO DE CREMA ***********");
        System.out.println("* Tamaño   : " + cic_size);
        System.out.println("* Forma    : "+ cic_form);
        cic_fruit.showInfo();
        cic_base.showInfo();
        cic_cream.showInfo();
        System.out.println();
        System.out.println("************ ++++++++++++++ ************");
        System.out.println();
    }

    public String getCICSize() {
        return cic_size;
    }

    public void setCICSize(String cic_size) {
        this.cic_size = cic_size;
    }

    public String getCICForm() {
        return cic_form;
    }

    public void setCICForm(String cic_form) {
        this.cic_form = cic_form;
    }

    public Fruta getCICFruit() {
        return cic_fruit;
    }

    public void setCICFruit(Fruta cic_fruit) {
        this.cic_fruit = cic_fruit;
    }

    public Base getCICBase() {
        return cic_base;
    }

    public void setCICBase(Base cic_base) {
        this.cic_base = cic_base;
    }

    public Crema getCICCream() {
        return cic_cream;
    }

    public void setCICCream(Crema cic_cream) {
        this.cic_cream = cic_cream;
    }

}
