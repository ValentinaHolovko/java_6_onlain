package ua.holovko.jadv.hw11;

public class Truck extends Car implements Recovery {
    private int cargo;

    public Truck(String series, int year, String color, int tankSize, int fuel, int fuelConsumption) {
        super(series, year, color, tankSize, fuel, fuelConsumption);
        cargo = 0;
    }

    public void loadCargo(int cargoWeight) {
        if (cargo + cargoWeight <= tankSize) {
            cargo += cargoWeight;
            System.out.println("Cargo loaded. Total cargo weight: " + cargo);
        } else {
            System.out.println("Cannot load more cargo. Tank is full.");
        }
    }

    public void unloadCargo(int cargoWeight) {
        if (cargo - cargoWeight >= 0) {
            cargo -= cargoWeight;
            System.out.println("Cargo unloaded. Total cargo weight: " + cargo);
        } else {
            System.out.println("Cannot unload more cargo. Tank is empty.");
        }
    }
}


