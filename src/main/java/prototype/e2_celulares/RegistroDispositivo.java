package prototype.e2_celulares;

public class RegistroDispositivo implements IRegistroDispositivo {

    private Dispositivo device;
    private String size;
    private String cpu;
    private String memory;
    private TarjetaSIM sim;
    private String android_version;
    private String camara_quality;
    private String bluetooth_version;
    private String number_external_memories;
    private String battery_type;
    private Accesorios accessories;
    //Agregados Para un Mejor Resultado
    private Persona person;
    private String nit;
    private String bill;
    private String date;

    public RegistroDispositivo(){}

    public Dispositivo getSamsungDevice() {
        return device;
    }

    public void setSamsungDevice(Dispositivo samsung_device) {
        this.device = samsung_device;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCPU() {
        return cpu;
    }

    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public TarjetaSIM getSIM() {
        return sim;
    }

    public void setSIM(TarjetaSIM sim) {
        this.sim = sim;
    }

    public String getAndroidVersion() {
        return android_version;
    }

    public void setAndroidVersion(String android_version) {
        this.android_version = android_version;
    }

    public String getCamaraQuality() {
        return camara_quality;
    }

    public void setCamaraQuality(String camara_quality) {
        this.camara_quality = camara_quality;
    }

    public String getBluetoothVersion() {
        return bluetooth_version;
    }

    public void setBluetoothVersion(String bluetooth_version) {
        this.bluetooth_version = bluetooth_version;
    }

    public String getNumberExternalMemories() {
        return number_external_memories;
    }

    public void setNumberExternalMemories(String number_external_memories) {
        this.number_external_memories = number_external_memories;
    }

    public String getBatteryType() {
        return battery_type;
    }

    public void setBatteryType(String battery_type) {
        this.battery_type = battery_type;
    }

    public Accesorios getAccesorios() {
        return accessories;
    }

    public void setAccesorios(Accesorios accessories) {
        this.accessories = accessories;
    }

    public Persona getPerson() {
        return person;
    }

    public void setPerson(Persona person) {
        this.person = person;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getBill() {
        return bill;
    }

    public void setBill(String bill) {
        this.bill = bill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public Object clone() {
        RegistroDispositivo objClone= new RegistroDispositivo();
        objClone.setSamsungDevice(this.device);
        objClone.setSize(this.size);
        objClone.setCPU(this.cpu);
        objClone.setMemory(this.memory);
        objClone.setSIM(this.sim);
        objClone.setDate(this.date);
        objClone.setAndroidVersion(this.android_version);
        objClone.setCamaraQuality(this.camara_quality);
        objClone.setBluetoothVersion(this.bluetooth_version);
        objClone.setNumberExternalMemories(this.number_external_memories);
        objClone.setBatteryType(this.battery_type);
        objClone.setAccesorios(this.accessories);
        objClone.setPerson(this.person);
        objClone.setNit(this.nit);
        objClone.setBill(this.bill);
        return objClone;
    }

    public void showInformation(){
        System.out.println("****************************************************************");
        System.out.println("NIT    : " + nit);
        System.out.println("Factura: " + bill);
        System.out.println("Fecha  : " + date);
        System.out.println("Cliente: ");
        System.out.println("         NIT/CI         : " + person.getCI());
        System.out.println("         Nombre-Apellido: " + person.getName());
        System.out.println("--Fabricante: " + device.getManufacturingCompany());
        System.out.println("--Modelo    : " + device.getModel());
        System.out.println("--Tamaño    : " + size);
        System.out.println("--CPU       : " + cpu);
        System.out.println("--SIM       : " + sim.getPhoneNumber() + " " + sim.getTelephoneCompany());
        System.out.println("--Versión de");
        System.out.println("  Android   : " + android_version);
        System.out.println("--Calidad de");
        System.out.println("  Cámara    : " + camara_quality);
        System.out.println("--Versión de");
        System.out.println("  Bluetooth : " + bluetooth_version);
        System.out.println("--Número de ");
        System.out.println("  Memorias ");
        System.out.println("  Extraibles: " + number_external_memories);
        System.out.println("--Tipo de");
        System.out.println("  Batería   : " + battery_type);
        System.out.println("--Accesorios: ");
        System.out.println("         Audífonos: " + accessories.getHeadphones());
        System.out.println("         Cargador : " + accessories.getPhoneCharger());
        System.out.println("         Estuche  : " + accessories.getPhoneCase());
        System.out.println("****************************************************************");
    }

}
