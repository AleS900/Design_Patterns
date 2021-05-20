package factoryMethod.e3_pasajes_aerolinea;

public class Avion {
    private String manufacturing_company;
    private String model;
    private String capacity;
    private String number_of_seats;

    public Avion() {
    }

    public String getCompany() {
        return manufacturing_company;
    }

    public void setCompany(String manufacturing_company) {
        this.manufacturing_company = manufacturing_company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getNumberSeats() {
        return number_of_seats;
    }

    public void setNumberSeats(String number_of_seats) {
        this.number_of_seats = number_of_seats;
    }

    public void showInfo(){
        System.out.println("* Avión/Modelo: " + manufacturing_company + " " + model);
        System.out.println("* Capacidad   : " + capacity);
        System.out.println("* Nro. Asiento: " + number_of_seats);
    }
}
