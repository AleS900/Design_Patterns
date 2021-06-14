package patternCombinations.e27_repositorio_de_github_2P;

public class OBSPersona {
    private String pers_id;
    private String pers_name;

    public OBSPersona(String pers_id, String pers_name) {
        this.pers_id = pers_id;
        this.pers_name = pers_name;
    }

    public String getPersonID() {
        return pers_id;
    }

    public void setPersonID(String pers_id) {
        this.pers_id = pers_id;
    }

    public String getPersonName() {
        return pers_name;
    }

    public void setPersonName(String pers_name) {
        this.pers_name = pers_name;
    }

    public void showInfo(){
        System.out.println("\n---- INFORMACION DESARROLLADOR: ----");
        System.out.println(">> C.I.      : " + pers_id);
        System.out.println(">> Nombre    : " + pers_name);
        System.out.println("------------------------------------");
    }
}
