package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }

    @Override
    public void stop() {
        System.out.println("Поезд останавливается на вокзале");
    }
}
