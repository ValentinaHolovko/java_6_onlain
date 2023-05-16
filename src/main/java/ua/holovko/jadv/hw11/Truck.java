package ua.holovko.jadv.hw11;

public class Truck extends Car {
    private int cargo;
    private final int cargoCapacity;

    public Truck(String series, int year, String color, int tankSize, int fuel, int fuelConsumption, int cargoCapacity) {
        super(series, year, color, tankSize, fuel, fuelConsumption);
        this.cargoCapacity = cargoCapacity;
        cargo = 0;
    }

    public void loadCargo(int cargoWeight) {
        if (cargo + cargoWeight <= cargoCapacity) {
            cargo += cargoWeight;
            System.out.println("Cargo loaded. Total cargo weight: " + cargo);
        } else {
            System.out.println("Cannot load more cargo. Cargo capacity exceeded.");
        }
    }

    public void unloadCargo(int cargoWeight) {
        if (cargo - cargoWeight >= 0) {
            cargo -= cargoWeight;
            System.out.println("Cargo unloaded. Total cargo weight: " + cargo);
        } else {
            System.out.println("Cannot unload more cargo. No cargo available.");
        }
    }

    @Override
    public void move() {
        while (fuel > 0) {
            fuel -= fuelConsumption * 2;
            if (fuel < 0) {
                fuel = 0;
            }
            System.out.println("Truck is moving. Fuel left: " + fuel);
        }

        if (fuel == 0) {
            System.out.println("Truck stopped. Out of fuel.");
        }
    }
}




