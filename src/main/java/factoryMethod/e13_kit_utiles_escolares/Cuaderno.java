package factoryMethod.e13_kit_utiles_escolares;

public class Cuaderno {
    private String nb_id;
    private String nb_type;
    private String nb_number_sheets;

    public Cuaderno() {
    }

    public String getNotebookID() {
        return nb_id;
    }

    public void setNotebookID(String nb_id) {
        this.nb_id = nb_id;
    }

    public String getNotebookType() {
        return nb_type;
    }

    public void setNotebookType(String nb_type) {
        this.nb_type = nb_type;
    }

    public String getNotebookNumberSheets() {
        return nb_number_sheets;
    }

    public void setNotebookNumberSheets(String nb_number_sheets) {
        this.nb_number_sheets = nb_number_sheets;
    }

    public void showInfo() {
        System.out.println("              - Código Identificador: " + nb_id);
        System.out.println("              - Tipo de Cuaderno    : " + nb_type);
        System.out.println("              - Número de Páginas   : " + nb_number_sheets);
    }
}
