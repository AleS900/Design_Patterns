package chainOfResponsability.e18_servicio_de_software_2P;

public class Persona {
    private String id;
    private String name;
    private String consulta;

    public Persona(String id, String name, String consulta) {
        this.id = id;
        this.name = name;
        this.consulta = consulta;
    }

    public void showInfo() {
        System.out.println("Persona > C.I.            :" + id);
        System.out.println("Persona > Nombre          : " + name);
        System.out.println("Persona > Tipo De Consulta: " + consulta);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
}
