package singleton.e11_ventanilla_de_pago;

public class Cajero {
    private String cshr_code;
    private String cshr_name;

    public Cajero(String cshr_code, String cshr_name) {
        this.cshr_code = cshr_code;
        this.cshr_name = cshr_name;
    }

    public String getCshrCode() {
        return cshr_code;
    }

    public void setCshrCode(String cshr_code) {
        this.cshr_code = cshr_code;
    }

    public String getCshrName() {
        return cshr_name;
    }

    public void setCshrName(String cshr_name) {
        this.cshr_name = cshr_name;
    }
}
