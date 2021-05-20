package factoryMethod.e3_pasajes_aerolinea;

public class CreatorPasajeSolidario extends CreatorPasajes {

    @Override
    public PasajeSolidario create(){

        Destino destination = new Destino();
        destination.setDCountry("México");
        destination.setDCity("Ciudad De México");
        destination.setDAirport("Aeropuerto Internacional De la Cidudad de México");

        Origen origin = new Origen();
        origin.setOCountry("Chile");
        origin.setOCity("Santiago De Chile");
        origin.setOAirport("Aeropuerto Internacional Arturo Merino Benítez (SCL)");

        Avion flight = new Avion();
        flight.setCompany("Boing");
        flight.setModel("747");
        flight.setCapacity("467");
        flight.setNumberSeats("660");

        Pasajero passenger = new Pasajero();
        passenger.setName("---");
        passenger.setCi("---");

        PasajeSolidario solidary = new PasajeSolidario();
        solidary.setFlight_number("1183");
        solidary.setDestination(destination);
        solidary.setOrigin(origin);
        solidary.setFlight(flight);
        solidary.setPassenger(passenger);
        solidary.setSeat_number("0");
        solidary.setPrice("220 $us");
        solidary.setDiscount("-200 $us");
        solidary.setDiscount_reason("Proyecto de Ayuda Solidaria AGE");

        return solidary;
    }
}
