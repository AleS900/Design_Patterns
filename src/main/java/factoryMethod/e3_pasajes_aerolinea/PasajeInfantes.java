package factoryMethod.e3_pasajes_aerolinea;

public class PasajeInfantes implements IPasaje {
    private String flight_number;
    private Destino destination;
    private Origen origin;
    private Avion flight;
    private Pasajero passenger;
    private String seat_number;
    private String special_price;

    public PasajeInfantes(){
        destination = new Destino();
        origin = new Origen();
        flight = new Avion();
        passenger = new Pasajero();
    }

    @Override
    public void create() {
        System.out.println("--------------PASAJE INFANTES--------------");
        System.out.println("* Nro. Vuelo  : " + flight_number);
        destination.showInfo();
        origin.showInfo();
        flight.showInfo();
        passenger.showInfo();
        System.out.println("* Nro. Asiento: " + seat_number);
        System.out.println("* Precio      : " + special_price + " --INFANTE-- ");
        System.out.println("--------------______________--------------");
        System.out.println("");
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public Destino getDestination() {
        return destination;
    }

    public void setDestination(Destino destination) {
        this.destination = destination;
    }

    public Origen getOrigin() {
        return origin;
    }

    public void setOrigin(Origen origin) {
        this.origin = origin;
    }

    public Avion getFlight() {
        return flight;
    }

    public void setFlight(Avion flight) {
        this.flight = flight;
    }

    public Pasajero getPassenger() {
        return passenger;
    }

    public void setPassenger(Pasajero passenger) {
        this.passenger = passenger;
    }

    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public String getSpecial_price() {
        return special_price;
    }

    public void setSpecial_price(String special_price) {
        this.special_price = special_price;
    }
}
