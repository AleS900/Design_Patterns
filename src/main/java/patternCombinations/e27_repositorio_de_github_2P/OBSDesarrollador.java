package patternCombinations.e27_repositorio_de_github_2P;

public class OBSDesarrollador implements IDesarrollador{
    private String dev_id;
    private OBSPersona dev_person;

    public OBSDesarrollador(String dev_id, OBSPersona dev_person) {
        this.dev_id = dev_id;
        this.dev_person = dev_person;
    }

    @Override
    public void update(String message, OBSNotificacionGit code) {
        System.out.println("********* NOTIFICACION  GITHUB *********");
        code.showInfo();
        System.out.println(message);
        dev_person.showInfo();
        System.out.println("\n******************************************\n");
    }

    public String getDev_id() {
        return dev_id;
    }

    public void setDev_id(String dev_id) {
        this.dev_id = dev_id;
    }

    public OBSPersona getDev_person() {
        return dev_person;
    }

    public void setDev_person(OBSPersona dev_person) {
        this.dev_person = dev_person;
    }
}
