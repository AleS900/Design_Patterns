package factoryMethod.e13_kit_utiles_escolares;

public class KitColegial implements IKit{
    private Mochila backpack;
    private Libro book1;
    private Libro book2;
    private Libro book3;
    private Computadora laptop;
    private String ck_id;

    public KitColegial() {
    }

    public KitColegial(Mochila backpack, Libro book1, Libro book2, Libro book3, Computadora laptop) {
        this.backpack = backpack;
        this.book1 = book1;
        this.book2 = book2;
        this.book3 = book3;
        this.laptop = laptop;
    }

    @Override
    public void create() {
        System.out.println("------------------ KIT COLEGIAL ------------------\n");
        System.out.println("* Código Ientificador: " + ck_id);
        System.out.println("* Mochila    :");
        backpack.showInfo();
        System.out.println("* Libros     :");
        System.out.println("              * Libro 1:");
        book1.showInfo();
        System.out.println("\n              * Libro 2:");
        book2.showInfo();
        System.out.println("\n              * Libro 3:");
        book3.showInfo();
        System.out.println("* Computadora:");
        laptop.showInfo();
        System.out.println("------------------ ___________ ------------------\n");
    }

    public Mochila getBackpack() {
        return backpack;
    }

    public void setBackpack(Mochila backpack) {
        this.backpack = backpack;
    }

    public Libro getBook1() {
        return book1;
    }

    public void setBook1(Libro book1) {
        this.book1 = book1;
    }

    public Libro getBook2() {
        return book2;
    }

    public void setBook2(Libro book2) {
        this.book2 = book2;
    }

    public Libro getBook3() {
        return book3;
    }

    public void setBook3(Libro book3) {
        this.book3 = book3;
    }

    public Computadora getLaptop() {
        return laptop;
    }

    public void setLaptop(Computadora laptop) {
        this.laptop = laptop;
    }

    public String getCkID() {
        return ck_id;
    }

    public void setCkID(String ck_id) {
        this.ck_id = ck_id;
    }
}
