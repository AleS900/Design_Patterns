package prototype.e2_celulares;

public class Persona {
    private String ci;
    private String name;

    public Persona(){}

    public Persona(String ci, String name) {
        this.ci= ci;
        this.name=name;
    }

    public String getCI() {
        return ci;
    }

    public void setCI(String ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
