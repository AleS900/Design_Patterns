package factoryMethod.e3_pasajes_aerolinea;

public class CreatorPasajeInfantes extends CreatorPasajes {

    @Override
    public PasajeInfantes create() {
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

        PasajeInfantes infant = new PasajeInfantes();
        infant.setFlight_number("1183");
        infant.setDestination(destination);
        infant.setOrigin(origin);
        infant.setFlight(flight);
        infant.setPassenger(passenger);
        infant.setSeat_number("0");
        infant.setSpecial_price("280 $us");

        return infant;
    }
}
