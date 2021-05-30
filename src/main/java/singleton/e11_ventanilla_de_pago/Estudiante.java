package singleton.e11_ventanilla_de_pago;

public class Estudiante {
    private String std_code;
    private String std_name;

    public Estudiante(String std_code, String std_name) {
        this.std_code = std_code;
        this.std_name = std_name;
    }

    public String getStdCode() {
        return std_code;
    }

    public void setStdCode(String std_code) {
        this.std_code = std_code;
    }

    public String getStdName() {
        return std_name;
    }

    public void setStdName(String std_name) {
        this.std_name = std_name;
    }
}
