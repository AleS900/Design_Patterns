package memento.e25_tesis_de_un_estudiante_2P;

public class ConcreteTesis {
    private String tesis_title;
    private String tesis_body;
    private Integer tesis_version;

    public ConcreteTesis() {
    }

    public ConcreteTesis(String tesis_title, String tesis_body, Integer tesis_version) {
        this.tesis_title = tesis_title;
        this.tesis_body = tesis_body;
        this.tesis_version = tesis_version;
    }

    public void showInfo() {
        System.out.println("TITULO : " + tesis_title);
        System.out.println("VERSION: " + tesis_version);
        System.out.println("\n" + tesis_body);
    }

    public void showVersion() {
        System.out.println("VERSION: " + tesis_version + "\n");
    }

    public String getTesis_title() {
        return tesis_title;
    }

    public void setTesis_title(String tesis_title) {
        this.tesis_title = tesis_title;
    }

    public String getTesis_body() {
        return tesis_body;
    }

    public void setTesis_body(String tesis_body) {
        this.tesis_body = tesis_body;
    }

    public Integer getTesis_version() {
        return tesis_version;
    }

    public void setTesis_version(Integer tesis_version) {
        this.tesis_version = tesis_version;
    }
}
