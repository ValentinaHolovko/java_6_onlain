package ua.holovko.jadv.hw11;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("XYZ", 2022, "black", 60, 20, 8);
        PassengerCar passengerCar = new PassengerCar("ABC", 2021, "white", 50, 25, 7, 3);
        Truck truck = new Truck("DEF", 2020, "red", 80, 50, 15, 1500);

        car.move();
        car.showStatistics();

        passengerCar.move();
        passengerCar.showStatistics();
        passengerCar.addPassenger();
        passengerCar.addPassenger();
        passengerCar.addPassenger();
        passengerCar.showStatistics();

        truck.move();
        truck.showStatistics();
        truck.loadCargo(400);
        truck.loadCargo(500);
        truck.showStatistics();
        truck.unloadCargo(300);
        truck.showStatistics();

    }
}


