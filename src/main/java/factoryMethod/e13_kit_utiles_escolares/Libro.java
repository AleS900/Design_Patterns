package factoryMethod.e13_kit_utiles_escolares;

public class Libro {
    private String bk_id;
    private String bk_name;
    private String bk_type;
    private String bk_autor;

    public Libro() {
    }

    public String getBookID() {
        return bk_id;
    }

    public void setBookID(String bk_id) {
        this.bk_id = bk_id;
    }

    public String getBookName() {
        return bk_name;
    }

    public void setBookName(String bk_name) {
        this.bk_name = bk_name;
    }

    public String getBookType() {
        return bk_type;
    }

    public void setBookType(String bk_type) {
        this.bk_type = bk_type;
    }

    public String getBookAutor() {
        return bk_autor;
    }

    public void setBookAutor(String bk_autor) {
        this.bk_autor = bk_autor;
    }

    public void showInfo() {
        System.out.println("              - Código Identificador: " + bk_id);
        System.out.println("              - Tipo de Libro       : " + bk_type);
        System.out.println("              - Título              : " + bk_name);
        System.out.println("              - Autor               : " + bk_autor);
    }
}
