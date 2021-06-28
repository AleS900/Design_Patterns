package patternCombinations.e44_empresa_de_reparacion_de_computadoras_PF;

public class Cliente {
    private String name;
    private String id;

    public Cliente(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void pagar(TecnicoAsignado tecnico, String cuenta){
        System.out.println("-- Cuenta  : " + cuenta);
        System.out.println("-- Usuario : " + name + ", ID: " + id +"\n");
        Empresa.getInstance().pay(tecnico);
        Empresa.getInstance().getBalance();
    }
}
