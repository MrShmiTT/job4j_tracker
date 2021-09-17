package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Количество пассажиров: " + numberOfPassengers);
    }

    @Override
    public int refuel(int fuelQuantity) {
        int fuelPrice = 10;
        return fuelQuantity * fuelPrice;
    }
}
