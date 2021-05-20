package factoryMethod.e3_pasajes_aerolinea;

public class Client {
    public  static void main (String[]args){
        // ******PASAJES ESTANDAR*****
        //1.
        CreatorPasajes standart1 = new CreatorPasajeEstandar();
        PasajeEstandar ticket1 = (PasajeEstandar) standart1.create();
        Pasajero passenger1 = ticket1.getPassenger();
        passenger1.setName("Gabriel Calzadilla");
        passenger1.setCi("8030129 TJ");
        ticket1.setPassenger(passenger1);
        ticket1.setSeat_number("2E");
        ticket1.create();
        //2.
        CreatorPasajes standart2 = new CreatorPasajeEstandar();
        PasajeEstandar ticket2 = (PasajeEstandar) standart2.create();
        Pasajero passenger2 = ticket2.getPassenger();
        passenger2.setName("Franciso Mejía");
        passenger2.setCi("7390114 LP");
        ticket2.setPassenger(passenger2);
        ticket2.setSeat_number("3E");
        ticket2.create();

        // ******PASAJES SOLIDARIOS*****
        //1.
        CreatorPasajes solidary1 = new CreatorPasajeSolidario();
        PasajeSolidario ticket3 = (PasajeSolidario) solidary1.create();
        Pasajero passenger3 = ticket3.getPassenger();
        passenger3.setName("Rocío Miranda");
        passenger3.setCi("9012434 OR");
        ticket3.setPassenger(passenger3);
        ticket3.setSeat_number("18A");
        ticket3.create();
        //2.
        CreatorPasajes solidary2 = new CreatorPasajeSolidario();
        PasajeSolidario ticket4 = (PasajeSolidario) solidary2.create();
        Pasajero passenger4 = ticket4.getPassenger();
        passenger4.setName("Kenneth Marin");
        passenger4.setCi("11066615 OR");
        ticket4.setPassenger(passenger4);
        ticket4.setSeat_number("27D");
        ticket4.create();

        // ******PASAJES INFANTILES*****
        //1.
        CreatorPasajes infant1 = new CreatorPasajeInfantes();
        PasajeInfantes ticket5 = (PasajeInfantes) infant1.create();
        Pasajero passenger5 = ticket5.getPassenger();
        passenger5.setName("Andrés Céspedes");
        passenger5.setCi("12066615 CBB");
        ticket5.setPassenger(passenger5);
        ticket5.setSeat_number("5A");
        ticket5.create();
        //2
        CreatorPasajes infant2 = new CreatorPasajeInfantes();
        PasajeInfantes ticket6 = (PasajeInfantes) infant2.create();
        Pasajero passenger6 = ticket6.getPassenger();
        passenger6.setName("Katherine Cardozo");
        passenger6.setCi("15066615 OR");
        ticket6.setPassenger(passenger6);
        ticket6.setSeat_number("14C");
        ticket6.create();
    }
}
