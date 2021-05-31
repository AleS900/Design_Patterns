package factoryMethod.e13_kit_utiles_escolares;

public class Computadora {
    private String pc_id;
    private String pc_trademark;
    private String pc_os;

    public Computadora() {
    }

    public String getPCId() {
        return pc_id;
    }

    public void setPCId(String id_pc) {
        this.pc_id = id_pc;
    }

    public String getPCTrademark() {
        return pc_trademark;
    }

    public void setPCTrademark(String pc_trademark) {
        this.pc_trademark = pc_trademark;
    }

    public String getPCOS() {
        return pc_os;
    }

    public void setPCOS(String os) {
        this.pc_os = os;
    }

    public void showInfo() {
        System.out.println("              - Código Identificador: " + pc_id);
        System.out.println("              - Marca               : " + pc_trademark);
        System.out.println("              - Sistema Operativo   : " + pc_os);
    }
}
