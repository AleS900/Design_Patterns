package prototype.e2_celulares;

public class Client {
    public static void main(String[] args) {
        RegistroDispositivo input = new RegistroDispositivo();
        input.setSamsungDevice(new Dispositivo("Samsung","R10"));
        input.setSIM(new TarjetaSIM("",""));
        input.setAccesorios(new Accesorios("","",""));
        input.setPerson(new Persona("",""));
        input.setSize("1.5 x 2.2 x 5.0\" / 3.8 x 5.6 x 12.7 cm");
        input.setCPU("0");
        input.setMemory("0");
        input.setDate("0");
        input.setAndroidVersion("0");
        input.setCamaraQuality("8 Megapíxeles");
        input.setBluetoothVersion("4.2");
        input.setNumberExternalMemories("1");
        input.setBatteryType("NiMH");
        input.setNit("1028413020");
        input.setBill("0");

        RegistroDispositivo officialInput1 = (RegistroDispositivo) input.clone();
        officialInput1.setPerson(new Persona("7390116", "Vargas Santiago"));
        officialInput1.setSIM(new TarjetaSIM("Viva","+591 79408867"));
        officialInput1.setAccesorios(new Accesorios("Si","Si","No"));
        officialInput1.setCPU("Exynos 2100, 2.9GHz Single-core (Cortex®-X1)");
        officialInput1.setMemory("128 Gb");
        officialInput1.setDate("01/05/2021");
        officialInput1.setAndroidVersion("8.0 Oreo");
        officialInput1.setBill("161335");

        RegistroDispositivo officialInput2 = (RegistroDispositivo) input.clone();
        officialInput2.setPerson(new Persona("4083310", "Céspedes Mónica"));
        officialInput2.setSIM(new TarjetaSIM("Entel","+591 70411471"));
        officialInput2.setAccesorios(new Accesorios("Si","Si","Si"));
        officialInput2.setCPU("SNAPDRAGON 865, 6 GHz Dual-core (Cortex®-X2)");
        officialInput2.setMemory("256 Gb");
        officialInput2.setDate("01/05/2021");
        officialInput2.setAndroidVersion("9.0 Pie");
        officialInput2.setBill("161336");

        RegistroDispositivo officialInput3 = (RegistroDispositivo) input.clone();
        officialInput3.setPerson(new Persona("1033343", "Pariente Blanca"));
        officialInput3.setSIM(new TarjetaSIM("Viva","+591 70413234"));
        officialInput3.setAccesorios(new Accesorios("Si","No","No"));
        officialInput3.setCPU("Exynos 2100, 2.9GHz Single-core (Cortex®-X1)");
        officialInput3.setMemory("128 Gb");
        officialInput3.setDate("02/05/2021");
        officialInput3.setAndroidVersion("8.0 Oreo");
        officialInput3.setBill("161337");

        officialInput1.showInformation();
        officialInput2.showInformation();
        officialInput3.showInformation();

    }
}
