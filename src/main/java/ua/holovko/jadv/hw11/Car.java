package ua.holovko.jadv.hw11;

public class Car implements Recovery {

    private final String series;
    private final int year;
    private final String color;
    int tankSize;
    int fuel;
    int fuelConsumption;

    public Car(String series, int year, String color, int tankSize, int fuel, int fuelConsumption) {

        this.series = series;
        this.year = year;
        this.color = color;
        this.tankSize = tankSize;
        if (fuel > tankSize) {
            this.fuel = tankSize;
        } else {
            this.fuel = fuel;
        }
        this.fuelConsumption = fuelConsumption;
    }

    public void move() {
        while (fuel > 0) {
            fuel -= fuelConsumption;
            if (fuel < 0) {
                fuel = 0;
            }
            System.out.println("Car is moving. Fuel left: " + fuel);
        }

        if (fuel == 0) {
            System.out.println("Car stopped. Out of fuel.");
            refuel();
        }
    }

    public void refuel() {
        int fuelToAdd = tankSize - fuel;
        fuel = tankSize;
        System.out.println("Car refueled. Added " + fuelToAdd + " units of fuel.");
    }

    public void showStatistics() {
        System.out.println("Series: " + series);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Tank size: " + tankSize);
        System.out.println("Current fuel: " + fuel);
        System.out.println("Fuel consumption: " + fuelConsumption);
    }
}

