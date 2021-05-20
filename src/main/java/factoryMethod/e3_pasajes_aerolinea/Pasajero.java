package factoryMethod.e3_pasajes_aerolinea;

public class Pasajero {
    private String name;
    private String ci;

    public Pasajero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void showInfo(){
        System.out.println("* Pasajero    : " + name);
        System.out.println("* NIT/CI      : " + ci);
    }
}
