package ua.holovko.jadv.hw11;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("XYZ", 2022, "black", 60, 20, 8);
        PassengerCar passengerCar = new PassengerCar("ABC", 2021, "white", 50, 25, 7, 3);
        Truck truck = new Truck("DEF", 2020, "red", 80, 50, 15);

        car.move();
        car.showStatistics();

        passengerCar.move();
        passengerCar.showStatistics();
        passengerCar.addPassenger();
        passengerCar.addPassenger();
        passengerCar.addPassenger();
        passengerCar.addPassenger();
        passengerCar.showStatistics();

        truck.move();
        truck.showStatistics();
        truck.loadCargo(40);
        truck.loadCargo(50);
        truck.showStatistics();
        truck.unloadCargo(30);
        truck.showStatistics();

    }
}


