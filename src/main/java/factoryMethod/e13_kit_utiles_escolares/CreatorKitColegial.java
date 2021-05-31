package factoryMethod.e13_kit_utiles_escolares;

public class CreatorKitColegial extends CreatorKits {
    @Override
    public KitColegial create() {
        //
        Mochila creator_backpack = new Mochila();
        creator_backpack.setBackpackID("0000");
        creator_backpack.setBackpackTrademark("Totto");
        creator_backpack.setBackpackPocketsNumber("5");
        creator_backpack.setBackpackSize("Mediano");
        //
        Libro creator_book_a = new Libro();
        creator_book_a.setBookID("0000000");
        creator_book_a.setBookType("Libro de Ejercicios");
        creator_book_a.setBookName("Mátematicas Avanzadas");
        creator_book_a.setBookAutor("Andre Guisbert");
        //
        Libro creator_book_b = new Libro();
        creator_book_b.setBookID("0000000");
        creator_book_b.setBookType("Libro de Teoría");
        creator_book_b.setBookName("Mátematicas: Algebra y Aritmética Aplicada");
        creator_book_b.setBookAutor("Rosa Castillo");
        //
        Libro creator_book_c = new Libro();
        creator_book_c.setBookID("0000000");
        creator_book_c.setBookType("Libro de Teoría");
        creator_book_c.setBookName("Gúia de Estudio Prueba de Conocimiento");
        creator_book_c.setBookAutor("María Rosales");
        //
        Computadora creator_pc = new Computadora();
        creator_pc.setPCId("0000XXXX");
        creator_pc.setPCTrademark("Quipus");
        creator_pc.setPCOS("Windows 10");
        //
        KitColegial college_kit = new KitColegial();
        college_kit.setCkID("-");
        college_kit.setBackpack(creator_backpack);
        college_kit.setBook1(creator_book_a);
        college_kit.setBook2(creator_book_b);
        college_kit.setBook3(creator_book_c);
        college_kit.setLaptop(creator_pc);
        return college_kit;
    }
}
