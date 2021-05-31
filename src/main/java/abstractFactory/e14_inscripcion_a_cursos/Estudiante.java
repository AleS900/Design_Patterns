package abstractFactory.e14_inscripcion_a_cursos;

public class Estudiante {
    private String std_id;
    private String std_name;
    private String std_last_name;
    private String std_code;

    public Estudiante() {
    }

    public Estudiante(String std_id, String std_last_name, String std_name, String std_code) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.std_last_name = std_last_name;
        this.std_code = std_code;
    }

    public String getStd_id() {
        return std_id;
    }

    public void setStd_id(String std_id) {
        this.std_id = std_id;
    }

    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_last_name() {
        return std_last_name;
    }

    public void setStd_last_name(String std_last_name) {
        this.std_last_name = std_last_name;
    }

    public String getStd_code() {
        return std_code;
    }

    public void setStd_code(String std_code) {
        this.std_code = std_code;
    }

    public void showInfo(){
        System.out.println("        -- Apellido  : " + std_last_name);
        System.out.println("        -- Nombre    : " + std_name);
        System.out.println("        -- C.I.      : "+ std_id);
        System.out.println("        -- Código de  ");
        System.out.println("           Estudiante: " + std_code);
    }
}
