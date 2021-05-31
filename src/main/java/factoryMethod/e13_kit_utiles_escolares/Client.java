package factoryMethod.e13_kit_utiles_escolares;

import factoryMethod.e3_pasajes_aerolinea.Destino;

public class Client {
    public  static void main (String[]args){
        //*********** KIT ESCOLAR ***********
        //1.
        CreatorKits school_kit1 = new CreatorKitEscolar();
        KitEscolar kit1 = (KitEscolar)school_kit1.create();
        kit1.setSchoolKit("1515-OR");
        //
        Mochila backpack1 = kit1.getBackpack();
        backpack1.setBackpackID("4049-TT-1515");
        kit1.setBackpack(backpack1);
        //
        Deportivo sportswear1 = kit1.getSportswear();
        sportswear1.setSportswearID("SP-4534");
        sportswear1.setSportswearSize("S");
        sportswear1.setSportswearColor("Azul");
        kit1.setSportswear(sportswear1);
        //
        Cuaderno notebook1a = kit1.getNotebook1();
        notebook1a.setNotebookID("NB-14536-YW");
        kit1.setNotebook1(notebook1a);
        //
        Cuaderno notebook1b = kit1.getNotebook2();
        notebook1b.setNotebookID("NB-10102-RD");
        kit1.setNotebook2(notebook1b);
        //
        kit1.create();

        //2.
        CreatorKits school_kit2 = new CreatorKitEscolar();
        KitEscolar kit2 = (KitEscolar)school_kit2.create();
        kit2.setSchoolKit("1516-OR");
        //
        Mochila backpack2 = kit2.getBackpack();
        backpack2.setBackpackID("4150-TT-1540");
        kit2.setBackpack(backpack2);
        //
        Deportivo sportswear2 = kit2.getSportswear();
        sportswear2.setSportswearID("SP-4535");
        sportswear2.setSportswearSize("M");
        sportswear2.setSportswearColor("Negro");
        kit2.setSportswear(sportswear2);
        //
        Cuaderno notebook2a = kit2.getNotebook1();
        notebook2a.setNotebookID("NB-15242-BK");
        kit2.setNotebook1(notebook2a);
        //
        Cuaderno notebook2b = kit2.getNotebook2();
        notebook2b.setNotebookID("NB-14570-YW");
        kit2.setNotebook2(notebook2b);
        //
        kit2.create();

        //*********** KIT COLEGIAL ***********
        //1.
        CreatorKits college_kit1 = new CreatorKitColegial();
        KitColegial kit3 = (KitColegial)college_kit1.create();
        kit3.setCkID("2030");
        //
        Mochila backpack3 = kit3.getBackpack();
        backpack3.setBackpackID("4114-TT-1623");
        kit3.setBackpack(backpack3);
        //
        Libro book1a = kit3.getBook1();
        book1a.setBookID("154020");
        kit3.setBook1(book1a);
        //
        Libro book2a = kit3.getBook2();
        book2a.setBookID("1640-A");
        kit3.setBook2(book2a);
        //
        Libro book3a = kit3.getBook3();
        book3a.setBookID("231");
        kit3.setBook3(book3a);
        //
        Computadora pc1 =  kit3.getLaptop();
        pc1.setPCId("1515QPSX");
        kit3.setLaptop(pc1);
        //
        kit3.create();

        //2.
        CreatorKits college_kit2 = new CreatorKitColegial();
        KitColegial kit4 = (KitColegial)college_kit2.create();
        kit4.setCkID("2031");
        //
        Mochila backpack4 = kit4.getBackpack();
        backpack4.setBackpackID("4124-TT-1615");
        kit4.setBackpack(backpack3);
        //
        Libro book1b = kit4.getBook1();
        book1b.setBookID("154145");
        kit4.setBook1(book1b);
        //
        Libro book2b = kit4.getBook2();
        book2b.setBookID("1701-A");
        kit4.setBook2(book2b);
        //
        Libro book3b = kit4.getBook3();
        book3b.setBookID("234");
        kit4.setBook3(book3b);
        //
        Computadora pc2 =  kit4.getLaptop();
        pc2.setPCId("4040QPSX");
        kit4.setLaptop(pc2);
        //
        kit4.create();
    }
}
