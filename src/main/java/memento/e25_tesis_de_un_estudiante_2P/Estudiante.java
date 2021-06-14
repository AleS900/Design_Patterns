package memento.e25_tesis_de_un_estudiante_2P;

public class Estudiante {
    private String stdnt_id;
    private String stdnt_name;

    public Estudiante(String stdnt_id, String stdnt_name) {
        this.stdnt_id = stdnt_id;
        this.stdnt_name = stdnt_name;
    }

    public void showInfo(){
        System.out.println("******************************");
        System.out.println("**  I.D.      : " + stdnt_id);
        System.out.println("**  ESTUDIANTE: " + stdnt_name);
        System.out.println("******************************\n");
    }

    public String getStdnt_id() {
        return stdnt_id;
    }

    public void setStdnt_id(String stdnt_id) {
        this.stdnt_id = stdnt_id;
    }

    public String getStdnt_name() {
        return stdnt_name;
    }

    public void setStdnt_name(String stdnt_name) {
        this.stdnt_name = stdnt_name;
    }
}
