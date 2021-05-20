package factoryMethod.e3_pasajes_aerolinea;

public class Destino {
    private String d_country;
    private String d_city;
    private String d_airport;

    public Destino(){
    }

    public String getDCountry() {
        return d_country;
    }

    public void setDCountry(String d_country) {
        this.d_country = d_country;
    }

    public String getDCity() {
        return d_city;
    }

    public void setDCity(String d_city) {
        this.d_city = d_city;
    }

    public String getDAirport() {
        return d_airport;
    }

    public void setDAirport(String d_airport) {
        this.d_airport = d_airport;
    }

    public void showInfo(){
        System.out.println("* Destino     :");
        System.out.println("                País      : " + d_country);
        System.out.println("                Ciudad    : " + d_city);
        System.out.println("                Aeropuerto: " + d_airport);
    }
}
