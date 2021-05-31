package factoryMethod.e13_kit_utiles_escolares;

public class CreatorKitEscolar extends CreatorKits {
    @Override
    public KitEscolar create() {
        //
        Mochila creator_backpack = new Mochila();
        creator_backpack.setBackpackID("0000");
        creator_backpack.setBackpackTrademark("Totto");
        creator_backpack.setBackpackPocketsNumber("3");
        creator_backpack.setBackpackSize("Pequeño");
        //
        Deportivo creator_sportswear = new Deportivo();
        creator_sportswear.setSportswearID("SP-0000");
        creator_sportswear.setSportswearSize("M");
        creator_sportswear.setSportswearColor("Negro");
        creator_sportswear.setSportswearNumGarments("4");
        //
        Cuaderno creator_notebook = new Cuaderno();
        creator_notebook.setNotebookID("NB-00000-XX");
        creator_notebook.setNotebookType("Anillado");
        creator_notebook.setNotebookNumberSheets("100");
        //
        Cuaderno creator_notebook1 = new Cuaderno();
        creator_notebook1.setNotebookID("NB-00000-XX");
        creator_notebook1.setNotebookType("Anillado");
        creator_notebook1.setNotebookNumberSheets("100");
        //
        KitEscolar school_kit = new KitEscolar();
        school_kit.setSchoolKit("-");
        school_kit.setBackpack(creator_backpack);
        school_kit.setSportswear(creator_sportswear);
        school_kit.setNotebook1(creator_notebook);
        school_kit.setNotebook2(creator_notebook1);
        return school_kit;
    }
}
