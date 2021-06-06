package memento.e17_back_up_base_de_datos_2P;

public class Persona {
    private String ppl_name;
    private String ppl_id;
    private String ppl_age;

    public Persona(String ppl_name, String ppl_id, String ppl_age) {
        this.ppl_name = ppl_name;
        this.ppl_id = ppl_id;
        this.ppl_age = ppl_age;
    }

    public String getPeopleName() {
        return ppl_name;
    }

    public void setPeopleName(String ppl_name) {
        this.ppl_name = ppl_name;
    }

    public String getPeopleID() {
        return ppl_id;
    }

    public void setPeopleID(String ppl_id) {
        this.ppl_id = ppl_id;
    }

    public String getPeopleAge() {
        return ppl_age;
    }

    public void setPeopleAge(String ppl_age) {
        this.ppl_age = ppl_age;
    }

    public void showPeople(int cont){
        System.out.println("     " + cont + ". -- Nombre: " +  ppl_name);
        System.out.println("        -- C.I.: " + ppl_id + "  -- Edad: " + ppl_age + "\n");
    }
}
