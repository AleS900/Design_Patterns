package abstractFactory.e4_heladeria;

public class HeladoAgua implements IHelado {
    private String wic_size;
    private String wic_form;
    private Fruta wic_fruit;
    private Base wic_base;

    public HeladoAgua(){
        wic_fruit = new Fruta();
        wic_base = new Base();
    }

    @Override
    public void create() {
        System.out.println("************ HELADO DE AGUA ************");
        System.out.println("* Tamaño   : " + wic_size);
        System.out.println("* Forma    : " + wic_form);
        wic_fruit.showInfo();
        wic_base.showInfo();
        System.out.println();
        System.out.println("************ ++++++++++++++ ************");
        System.out.println();
    }

    public String getWICSize() {
        return wic_size;
    }

    public void setWICSize(String wic_size) {
        this.wic_size = wic_size;
    }

    public String getWICForm() {
        return wic_form;
    }

    public void setWICForm(String wic_form) {
        this.wic_form = wic_form;
    }

    public Fruta getWICFruit() {
        return wic_fruit;
    }

    public void setWICFruit(Fruta wic_fruit) {
        this.wic_fruit = wic_fruit;
    }

    public Base getWICBase() {
        return wic_base;
    }

    public void setWICBase(Base wic_base) {
        this.wic_base = wic_base;
    }

}
