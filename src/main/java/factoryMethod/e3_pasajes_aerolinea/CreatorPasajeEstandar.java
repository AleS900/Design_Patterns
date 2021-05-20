package factoryMethod.e3_pasajes_aerolinea;

public class CreatorPasajeEstandar extends CreatorPasajes {

    @Override
    public PasajeEstandar create(){

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

        PasajeEstandar standart = new PasajeEstandar();
        standart.setFlight_number("1183");
        standart.setDestination(destination);
        standart.setOrigin(origin);
        standart.setFlight(flight);
        standart.setPassenger(passenger);
        standart.setSeat_number("0");
        standart.setPrice("420 $us");

        return standart;
    }
}
