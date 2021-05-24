package abstractFactory.e4_heladeria;

public class HeladoMixto implements IHelado{

    private String mic_size;
    private String mic_form;
    private Fruta mic_fruit;
    private Base mic_base;
    private Crema mic_cream;
    private String mic_price;

    public HeladoMixto(){
        mic_fruit = new Fruta();
        mic_base = new Base();
        mic_cream = new Crema();
    }

    @Override
    public void create() {
        System.out.println("************ HELADO DE MIXTO ************");
        System.out.println("* Tamaño   : " + mic_size);
        System.out.println("* Forma    : " + mic_form);
        mic_fruit.showInfo();
        mic_base.showInfo();
        mic_cream.showInfo();
        System.out.println("* Precio   : " + mic_price);
        System.out.println();
        System.out.println("************ ++++++++++++++ ************");
        System.out.println();
    }

    public String getMICSize() {
        return mic_size;
    }

    public void setMICSize(String mic_size) {
        this.mic_size = mic_size;
    }

    public String getMICForm() {
        return mic_form;
    }

    public void setMICForm(String mic_form) {
        this.mic_form = mic_form;
    }

    public Fruta getMICFruit() {
        return mic_fruit;
    }

    public void setMICFruit(Fruta mic_fruit) {
        this.mic_fruit = mic_fruit;
    }

    public Base getMICBase() {
        return mic_base;
    }

    public void setMICBase(Base mic_base) {
        this.mic_base = mic_base;
    }

    public Crema getMICCream() {
        return mic_cream;
    }

    public void setMICCream(Crema mic_cream) {
        this.mic_cream = mic_cream;
    }

    public String getMICPrice() {
        return mic_price;
    }

    public void setMICPrice(String mic_price) {
        this.mic_price = mic_price;
    }

}
