package factoryMethod.e3_pasajes_aerolinea;

public class PasajeSolidario implements IPasaje {
    private String flight_number;
    private Destino destination;
    private Origen origin;
    private Avion flight;
    private Pasajero passenger;
    private String seat_number;
    private String price;
    private String discount;
    private String discount_reason;

    public PasajeSolidario(){
        destination = new Destino();
        origin = new Origen();
        flight = new Avion();
        passenger = new Pasajero();
    }

    @Override
    public void create() {
        System.out.println("--------------PASAJE SOLIDARIO--------------");
        System.out.println("* Nro. Vuelo  : " + flight_number);
        destination.showInfo();
        origin.showInfo();
        flight.showInfo();
        passenger.showInfo();
        System.out.println("* Nro. Asiento: " + seat_number);
        System.out.println("* Precio      : " + price);
        System.out.println("* Descuento   : " + discount);
        System.out.println("* Motivo Desc.: " + discount_reason);
        System.out.println("--------------________________--------------");
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscount_reason() {
        return discount_reason;
    }

    public void setDiscount_reason(String discount_reason) {
        this.discount_reason = discount_reason;
    }
}
