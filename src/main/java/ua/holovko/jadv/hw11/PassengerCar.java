package ua.holovko.jadv.hw11;

public class PassengerCar extends Car implements Recovery {
    private int passenger;

    public PassengerCar(String series, int year, String color, int tankSize, int fuel, int fuelConsumption, int i) {
        super(series, year, color, tankSize, fuel, fuelConsumption);
        passenger = 0;
    }

    public void addPassenger() {
        if (passenger < 3) {
            passenger++;
            System.out.println("Passenger added. Total passengers: " + passenger);
        } else {
            System.out.println("Cannot add more passengers. Car is full.");
        }
    }
}
