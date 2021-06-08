package chainOfResponsability.e20_algoritmos_de_ordenamiento;

public class Persona {
    private String pers_id;
    private String pers_name;
    private int pers_age;

    public Persona(String pers_id, String pers_name, int pers_age) {
        this.pers_id = pers_id;
        this.pers_name = pers_name;
        this.pers_age = pers_age;
    }

    public String getPers_id() {
        return pers_id;
    }

    public void setPers_id(String pers_id) {
        this.pers_id = pers_id;
    }

    public String getPers_name() {
        return pers_name;
    }

    public void setPers_name(String pers_name) {
        this.pers_name = pers_name;
    }

    public int getPers_age() {
        return pers_age;
    }

    public void setPers_age(int pers_age) {
        this.pers_age = pers_age;
    }
}
