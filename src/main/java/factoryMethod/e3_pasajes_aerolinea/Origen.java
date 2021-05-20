package factoryMethod.e3_pasajes_aerolinea;

public class Origen {
    private String o_country;
    private String o_city;
    private String o_airport;

    public Origen(){
    }

    public String getOCountry() {
        return o_country;
    }

    public void setOCountry(String o_country) {
        this.o_country = o_country;
    }

    public String getOCity() {
        return o_city;
    }

    public void setOCity(String o_city) {
        this.o_city = o_city;
    }

    public String getOAirport() {
        return o_airport;
    }

    public void setOAirport(String o_airport) {
        this.o_airport = o_airport;
    }

    public void showInfo(){
        System.out.println("* Origen      : ");
        System.out.println("                País      : " + o_country);
        System.out.println("                Ciudad    : " + o_city);
        System.out.println("                Aeropuerto: " + o_airport);
    }
}
