package patternCombinations.e27_repositorio_de_github_2P;

public class OBSNotificacionGit {
    private String ntf_title;
    private String ntf_commit;

    public OBSNotificacionGit(String ntf_title, String ntf_commit) {
        this.ntf_title = ntf_title;
        this.ntf_commit = ntf_commit;
    }

    public void showInfo(){
        System.out.println("\n---- INFORMACION NOTIFICACION: ----");
        System.out.println(">> Titulo : " + ntf_title);
        System.out.println(">> Commit : ["+ ntf_commit +"]");
        System.out.println("------------------------------------");
    }

    public String getNtf_title() {
        return ntf_title;
    }

    public void setNtf_title(String ntf_title) {
        this.ntf_title = ntf_title;
    }

    public String getNtf_commit() {
        return ntf_commit;
    }

    public void setNtf_commit(String ntf_commit) {
        this.ntf_commit = ntf_commit;
    }
}
