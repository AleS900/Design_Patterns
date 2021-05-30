package prototype.e12_contrato_de_docentes;

public class Docente {
    private String tchr_id;
    private String tchr_name;
    private String thcr_last_name;

    public Docente() {
    }

    public Docente(String tchr_id, String tchr_name, String thcr_last_name) {
        this.tchr_id = tchr_id;
        this.tchr_name = tchr_name;
        this.thcr_last_name = thcr_last_name;
    }

    public String getTchrID() {
        return tchr_id;
    }

    public void setTchrID(String tchr_id) {
        this.tchr_id = tchr_id;
    }

    public String getTchrName() {
        return tchr_name;
    }

    public void setTchrName(String tchr_name) {
        this.tchr_name = tchr_name;
    }

    public String getThcrLastName() {
        return thcr_last_name;
    }

    public void setThcrLastName(String thcr_last_name) {
        this.thcr_last_name = thcr_last_name;
    }
}
